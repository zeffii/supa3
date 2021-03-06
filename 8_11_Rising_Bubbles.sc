// 8.11. Rising Bubbles
// From CottleSC3pdf
// http://www.mat.ucsb.edu/275/CottleSC3.pdf

(
// select everything between the two parentheses
{
CombN.ar(
  	SinOsc.ar(
			LFNoise1.kr(
				4, // LFO
				24, // range in MIDI
				LFSaw.kr(
					[8,7.23],//second LFO
					0,
					3, // range in MIDI
					80 // offset in MIDI
				)
			).midicps,
			0,
			0.04
		),
		0.2, // max delay
		0.2, // actual delay
		4 // decay
)
}.play
)
