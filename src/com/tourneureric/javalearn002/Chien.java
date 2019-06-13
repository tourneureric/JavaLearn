package com.tourneureric.javalearn002;

public class Chien extends Animal {

	@Override
	void deplacement() {
		Log.log(Log.LOG_DEBUG, "Chien::deplacement() [begin]");

		Log.log(Log.LOG_DEBUG, "Chien::deplacement() [end]");
	}
	
	@Override
	void crier() {
		Log.log(Log.LOG_DEBUG, "Chien::crier() [begin]");

		Log.log(Log.LOG_DEBUG, "Chien::crier() [end]");
	}

}
