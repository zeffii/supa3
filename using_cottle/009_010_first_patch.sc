(
// Double click the parenthesis above to quickly select
// the entire patch
// Or use com-shift-b
{   var out, delay;
	out = SinOsc.ar(
		//Sine wave osc
		abs( //This protects against negative values
			LFNoise1.kr(
				0.5, //frequency overall wandering
				600, //range of overall wandering
				LFSaw.kr(
					1.5, //speed of the individual sweeps
					mul: 50, //depth of sweep
					add: 500 //range of sweep
		)
		)
		),
		0,
		0.1 //volume, stay below 0.2
	);
	//delay
	delay = CombN.ar(
		out,
		3.0, //max delay
		[1.35, 0.7], //actual delay, stay below max delay
		6 //delay decay
	);
	Pan2.ar(out, 0) + delay
}.play
)