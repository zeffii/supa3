(
SynthDef("tutorial", {
	arg freq=440, dur=0.5;
	var outArray, mamp;
	mamp = Line.kr(0.2, 0, dur, doneAction: 2);
	freq = XLine.kr(400,30, dur*0.3);
    outArray = [SinOsc.ar(freq, 0, mul: mamp), SinOsc.ar(freq*1.02, 0, mul: mamp)];
    Out.ar(0, outArray);
}).add;

)

Synth(\tutorial);