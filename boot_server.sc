// if the server crashes or isn't started, this will start it.

s.boot;  // run this line first, wait.
         // till report window states "server interface initialized".

// on windows the server volume seems to be initialized at 0 dB
// this sets it to something more reasonable
s.volume = -17
