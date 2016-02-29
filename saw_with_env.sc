(
SynthDef(\tresor, {
	arg freq=200, amp=1, dur=2;
	var source, env;
	env = Line.ar(start: 1, end: 0, dur: dur, mul: 1, add: 0, doneAction: 2);
	source = Saw.ar(freq, env, 0);
	Out.ar(0, source);
	}
).add;
)

Synth(\tresor, [\freq, 200]);