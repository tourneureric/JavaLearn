package com.tourneureric.javalearn002;

public class Loup extends Animal {

	@Override
	void deplacement() {
		Log.log(Log.LOG_DEBUG, "Loup::deplacement() [begin]");

		Log.log(Log.LOG_DEBUG, "Loup::deplacement() [end]");
	}
	
	@Override
	void crier() {
		Log.log(Log.LOG_DEBUG, "Loup::crier() [begin]");

		Log.log(Log.LOG_DEBUG, "Loup::crier() [end]");
	}

}
