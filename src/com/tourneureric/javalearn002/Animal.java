package com.tourneureric.javalearn002;

abstract class Animal {
	
	abstract void deplacement();
	abstract void crier();
	
	void manger() {
		Log.log(Log.LOG_DEBUG, "Animal::manger() [begin]");
		
		Log.log(Log.LOG_DEBUG, "Animal::manger() [end]");
	}
	
	void boire() {
		Log.log(Log.LOG_DEBUG, "Animal::boire() [begin]");
		
		Log.log(Log.LOG_DEBUG, "Animal::boire() [end]");
	}

}
