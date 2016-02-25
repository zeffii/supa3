(
{
var trig, out, delay;
trig = Impulse.kr(6); // trigger rate
out = Blip.ar(
		TRand.kr(48, 72, trig).midicps, // range, in midi, of pitches
		TRand.kr(1, 12, trig), // range of timbre
		max(0, TRand.kr(-0.5, 0.4, trig)) // amplitudes
);
out = Pan2.ar(out, TRand.kr(-1.0, 1.0, trig));
out = out*EnvGen.kr(Env.perc(0, 1), trig);
out = Mix.ar({out}.dup(6))*0.2;
delay = CombL.ar(out, 2.0, 4/6, 6);
out + delay
}.play
) 