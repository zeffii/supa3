( // <- double click the parenthesis
{
Mix.ar(
	Array.fill(5, // not too many values, could crash
		{Pan2.ar(
			SinOsc.ar(
				SinOsc.ar(1/10, rrand(0, 6.0), 200, 500)),
				1.0.rand)}
    )
)*0.02
}.play
)