(
SynthDef("hatsound", {
	arg freq=440, dur=0.5;
	var outArray, mamp;
	mamp = Line.kr(0.2, 0, dur, doneAction: 2);
    outArray = [PinkNoise.ar(mul: mamp), PinkNoise.ar(mul: mamp)];
	outArray = HPF.ar(outArray, freq);
    Out.ar(0, outArray);
}).add;

)

Synth(\hatsound, [\freq, 720]);
Synth(\hatsound, [\freq, 1220]);
Synth(\hatsound, [\freq, 1220, \dur, 0.1]);