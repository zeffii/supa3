// very non optimal and lacks much error checking on note input

SynthDef.new(\iter, {
	arg freq=40;
	var temp, sum, env;
	sum = 0;
	env = EnvGen.kr(
		Env.perc(0.01, 5, 1, -2),
		doneAction:2
	);
	10.do{
		temp = VarSaw.ar(
			freq * {Rand(0.99, 1.02)}!2,
			{Rand(0.0, 1.0)}!2,
			{ExpRand(0.005, 0.05)}!2
		);
		sum = sum + temp;
	};
	sum = sum * 0.05 * env;
	Out.ar(0, sum);
}).add;

(

~artful = ["C-6", "D#6", "G-6", "A#6"];

~findIndex = {
	|source, item|
	var index = -1;
	var bk = -1;
	source.do{
		arg element, i;
		if (element == item, { index = i }, {});
	};
	index;
};

~strnote_midicps = {
	|note|
	var return = -7;
	var oct = 0;
	var str = "|";
	var index = -1;
	var notes_list = ["C-","C#","D-","D#","E-","F-","F#","G-","G#","A-","A#","B-"];

	return = case
	{note == "..."} {-1}
	{note == "OFF"} {-2}
	{note == "==="} {-3};

    oct = if (return == nil, { note[2].asString.asInteger },{ -8 });
	str = note.subStr(0,1);
    index = ~findIndex.value(notes_list, str);

	return = if (oct > -1, { (index + (oct * 12)) }, { return });
	return;
};


~artful.do{
	|item, index|
	var midinote = ~strnote_midicps.value(item);
	Synth.new(\iter, [\freq, midinote.midicps]);
};

)

