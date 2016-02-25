(
{
Mix.ar(
	Array.fill(5, // number of oscillators
		{arg c;
			Pan2.ar(SinOsc.ar(  // be sure the add is greater than the mul
				LFSaw.ar((c*0.2 + 1)/3, mul: 500, add: 700)
			),
			LFNoise0.kr(1)) // pan speed

			}
		)
)*0.1
}.play
) 