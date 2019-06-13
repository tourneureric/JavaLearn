package com.tourneureric.javalearn002;

public class Loup extends Animal {

	@Override
	void manger() {
		Log.log(Log.LOG_DEBUG, "Loup::manger() [begin]");
		
		Log.log(Log.LOG_DEBUG, "Loup::manger() [end]");
	}

}
