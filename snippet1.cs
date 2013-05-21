// original by SoundsLogical at
// youtube.com/watch?v=hvqPFziOw2U#t=489s

// added formatting, variables and server boot + volume 

s.boot;
s.volume = -17.3;

w = Scale.major.degrees;
x = { (w.choose + (36,48..72).choose).midicps};
r = { SinOsc.ar(rrand(0.4, 4), rrand(8, 20))};
y = {
    var lftri, envgen, rrandval;
    lftri = LFTri.ar(x.value +r.value, 0.005);
    envgen = EnvGen.kr(Env.sine(10), doneAction: 2);
    rrandval = rrand(-0.8, 0.8);
    Pan2.ar( lftri*envgen, rrandval);
};
 
t = Task{ 
    10.do{
        7.do {y.play};
        7.wait;
    }
};

t.start;

