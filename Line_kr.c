//12.2. Line.kr
{SinOsc.ar(freq: 400, mul: 0.7)}.play

{SinOsc.ar(freq: Line.kr(200, 2000, 10), mul: Line.kr(0.9, 0.2, 10))}.play
{SinOsc.ar(freq: Line.kr(800, 400, 0.5), mul: Line.kr(0.9, 0, 0.5))}.play

/*
this will generate a sound that takes 0.7 seconds to go from mul 0.7 to 0.0
*/
{SinOsc.ar(freq: 400, mul: Line.kr(0.7, 0.0, 0.7))}.play

/*
this will generate a sound that takes 0.7 seconds to go from mul 0.7 to 0.0
and takes 0.2 second to drop from the highest to the lower frequency,
in essence this is a bassdrum. mono so only on one side.
*/
{SinOsc.ar(freq: Line.kr(600, 50, 0.03), mul: Line.kr(0.7, 0.0, 0.6))}.play

/*this is a little easier to manipulate*/
(var start_freq = 300, 
    end_freq = 50, 
    duration = 1.6,    
    start_array, end_array,
    freq_env, amp_env;
    
start_array = [start_freq, start_freq];
end_array = [end_freq, end_freq];

{SinOsc.ar(
	freq: Line.kr(start_array, end_array, 0.05), 
	mul: Line.kr(0.7, 0.0, duration))}.play
)

