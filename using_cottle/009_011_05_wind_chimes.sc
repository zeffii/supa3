(
{
Mix.ar(
	{Pan2.ar(
		Klank.ar(
			`[Array.fill(3, {exprand(1000, 10000)}),
			1, Array.fill(3, {rrand(1.0, 4.0)})],
			Dust.ar(1/3, 0.1)),
		LFTri.kr(rrand(3.0, 10.0)))}.dup(20)
) }.play;
)  