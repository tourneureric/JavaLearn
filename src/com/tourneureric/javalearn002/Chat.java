package com.tourneureric.javalearn002;

public class Chat extends Animal {

	@Override
	void deplacement() {
		Log.log(Log.LOG_DEBUG, "Chat::deplacement() [begin]");

		Log.log(Log.LOG_DEBUG, "Chat::deplacement() [end]");
	}
	
	@Override
	void crier() {
		Log.log(Log.LOG_DEBUG, "Chat::crier() [begin]");

		Log.log(Log.LOG_DEBUG, "Chat::crier() [end]");
	}

}
