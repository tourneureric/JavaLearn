package com.tourneureric.javalearn002;

public class Lion extends Animal {

	@Override
	void deplacement() {
		Log.log(Log.LOG_DEBUG, "Lion::deplacement() [begin]");

		Log.log(Log.LOG_DEBUG, "Lion::deplacement() [end]");
	}
	
	@Override
	void crier() {
		Log.log(Log.LOG_DEBUG, "Lion::crier() [begin]");

		Log.log(Log.LOG_DEBUG, "Lion::crier() [end]");
	}

}
