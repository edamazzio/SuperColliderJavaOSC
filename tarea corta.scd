
(

SynthDef.new(\bass, {
	arg freq = 439, baseFreq = 245, amp = 1, phase = 0, gate = 1, time = 0.5;
	var env1, env2, env3, sig, sig1, sig2, sig3, freq2, freq3, diff;

	diff = 60;
	//Env.new([0.0001,0.8,0.0001,0.0001],[0.5, 0.5,0.5*4], \exp).plot;
	//Env.new([0.0001,0.0001,0.8,0.0001,0.0001],[0.5*2, 0.5, 0.5, 0.5*2], \exp).plot;
	//Env.new([0.0001,0.0001,0.8,0.0001],[0.5*4, 0.5, 0.5], \exp).plot;
	env1 = EnvGen.kr(Env([0.0001,0.8,0.0001,0.0001],[time, time, time*4], \exp).circle);
	env2 = EnvGen.kr(Env([0.0001,0.0001,0.8,0.0001,0.0001],[time*2, time, time, time*2], \exp).circle);
	env3 = EnvGen.kr(Env([0.0001,0.0001,0.8,0.0001],[time*4, time, time], \exp).circle);



	sig1 = (SinOsc.ar((freq % baseFreq), phase, amp) +
		SinOsc.ar((freq % baseFreq) +30, phase, amp) +
		SinOsc.ar((freq % baseFreq) +60, phase, amp) +
		SinOsc.ar((freq % baseFreq) +90, phase, amp) +
		SinOsc.ar((freq % baseFreq) +50, phase, amp) ) * env1;

	sig2 = (SinOsc.ar((freq +diff % baseFreq), phase, amp) +
		SinOsc.ar((freq +diff % baseFreq) +30, phase, amp) +
		SinOsc.ar((freq +diff % baseFreq) +60, phase, amp) +
		SinOsc.ar((freq +diff % baseFreq) +90, phase, amp) +
		SinOsc.ar((freq +diff % baseFreq) +50, phase, amp) ) * env2;

	sig3 = (SinOsc.ar((freq -50 % baseFreq), phase, amp) +
		SinOsc.ar((freq -diff % baseFreq) +30, phase, amp) +
		SinOsc.ar((freq -diff % baseFreq) +60, phase, amp) +
		SinOsc.ar((freq -diff % baseFreq) +90, phase, amp) +
		SinOsc.ar((freq -diff % baseFreq) +50, phase, amp) ) * env3;


	sig = Mix.new([sig1,sig2,sig3]);
	Out.ar(0, sig);
	Out.ar(1, sig);


}).add;

x = Synth(\bass, ["freq",440, "amp",1, "gate",1, "time",0.5]);
//x.set(\time, 1);

)


(

SynthDef.new(\vibrato, {
	arg freq = 440, rate = 6.0, depth = 0.02, delay = 0, onset=  0, rateVariation = 0.04, depthVariation = 0.1, iphase = 0, amp = 0.8;
	var sig, freq2, freq3, freq4;
	freq2 = rrand(freq, freq*2);
	freq3 = rrand(freq/2, freq);
	freq4 = rrand(freq/4, freq/2);
	sig = SinOsc.ar(Vibrato.kr(freq, rate, depth, delay, onset, rateVariation, depthVariation, iphase), mul:amp) +
	SinOsc.ar(Vibrato.kr(freq, rate, depth, delay, onset, rateVariation, depthVariation, iphase), mul:amp) +
	SinOsc.ar(Vibrato.kr(freq, rate, depth, delay, onset, rateVariation, depthVariation, iphase), mul:amp) +
	SinOsc.ar(Vibrato.kr(freq, rate, depth, delay, onset, rateVariation, depthVariation, iphase), mul:amp);
	Out.ar(0, sig);
	Out.ar(1, sig);
}).add;

)



(

SynthDef.new(\chords, {
	arg midi = 68, amp = 1, sustain = 1, time = 0.5;
	var env1, env2, env3, sig, chord1, chord2, chord3, diff, midi2, midi3;

	diff = 60;
	//Env.new([0.0001,0.8,0.0001,0.0001],[0.5, 0.5,0.5*4], \exp).plot;
	//Env.new([0.0001,0.0001,0.8,0.0001,0.0001],[0.5*2, 0.5, 0.5, 0.5*2], \exp).plot;
	//Env.new([0.0001,0.0001,0.8,0.0001],[0.5*4, 0.5, 0.5], \exp).plot;
	env1 = EnvGen.kr(Env([0.0001,0.8,0.0001,0.0001],[time, time, time*4], \exp).circle);
	env2 = EnvGen.kr(Env([0.0001,0.0001,0.8,0.0001,0.0001],[time*2, time, time, time*2], \exp).circle);
	env3 = EnvGen.kr(Env([0.0001,0.0001,0.8,0.0001],[time*4, time, time], \exp).circle);



	chord1 = (SinOsc.ar(midi.midicps, amp) +
		SinOsc.ar((midi + 7).midicps,  amp) +
		SinOsc.ar((midi + 12).midicps,  amp) ) * env1;

	midi2 = midi + 7;
	chord2 = (SinOsc.ar(midi2.midicps, amp) +
		SinOsc.ar((midi2 + 7).midicps,  amp) +
		SinOsc.ar((midi2 + 12).midicps,  amp) ) * env2;

	midi3 = midi + 3;
	chord3 = (SinOsc.ar(midi3.midicps, amp) +
		SinOsc.ar((midi3 + 7).midicps,  amp) +
		SinOsc.ar((midi3 + 12).midicps,  amp) ) * env3;


	sig = Mix.new([chord1,chord2,chord3]);
	Out.ar(0, sig);
	Out.ar(1, sig);


}).add;

x = Synth(\chords, ["freq",440, "amp",1, "time",0.5]);
//x.set(\time, 1);

)
