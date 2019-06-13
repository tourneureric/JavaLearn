package com.tourneureric.javalearn002;

public class Tigre extends Animal {

	@Override
	void deplacement() {
		Log.log(Log.LOG_DEBUG, "Tigre::deplacement() [begin]");

		Log.log(Log.LOG_DEBUG, "Tigre::deplacement() [end]");
	}
	
	@Override
	void crier() {
		Log.log(Log.LOG_DEBUG, "Tigre::crier() [begin]");

		Log.log(Log.LOG_DEBUG, "Tigre::crier() [end]");
	}

}
