s.boot;
s.plotTree;
s.options.blockSize = 1024;
s.latency = 1

{SinOsc.ar(freq: 400, mul: Line.kr(0.3, 0.0, 0.2))}.play

(
SynthDef("tutorial", { 
	arg freq=440, dur=0.5;
	var outArray, mamp;
	mamp = Line.kr(0.2, 0, dur, doneAction: 2);
    outArray = [Saw.ar(freq, 0, mul: mamp), Saw.ar(freq*1.02, 0, mul: mamp)];
    Out.ar(0, outArray);
}).add;

)

(

Pbind(
 \instrument, \tutorial,
 \freq, Pseq([140, 150, 160, 170, 217], inf),
 \dur, Pseq([0.2, 0.1, 0.1, 0.2, 0.4, 0.1, 0.1], 5)
).play


)
