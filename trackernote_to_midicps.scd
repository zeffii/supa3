// very non optimal

(

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


["C-4", "D#4", "G-4", "A#5"].do{
	|item, index|
	~strnote_midicps.value(item).postln;
};

)
