s.boot;
s.plotTree;
s.options.blockSize = 1024;
s.latency = 1

{SinOsc.ar(freq: 400, mul: Line.kr(0.3, 0.0, 0.2))}.play

(
SynthDef("tutorial", { var outArray, mamp;
	mamp = Line.kr(0.3, 0.0, 0.3);
    outArray = [SinOsc.ar(440, 0, mul: mamp), SinOsc.ar(442, 0, mul: mamp)];
    Out.ar(0, outArray);
}).add;

)
b = Synth(\tutorial);

