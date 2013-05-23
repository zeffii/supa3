(
{ //Noise bassline
  
	var lfo = LFNoise0.ar(freq: [8, 5], mul: 90, add: 160);
	SinOsc.ar(freq:lfo, mul: 0.2)
}.play;

)
