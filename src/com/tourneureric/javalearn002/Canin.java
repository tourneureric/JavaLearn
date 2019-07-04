package com.tourneureric.javalearn002;

public abstract class Canin extends Animal {
	
	protected Canin() {
		Log.log(Log.LOG_DEBUG, "Canin::Canin() [begin]");
		
		P.print("Canin : instanciation");

		Log.log(Log.LOG_DEBUG, "Canin::Canin() [end]");	
	}

	@Override
	void deplacement() {
		Log.log(Log.LOG_DEBUG, "Canin::deplacement() [begin]");

		P.print("Canin : Je me déplace en meute !");

		Log.log(Log.LOG_DEBUG, "Canin::deplacement() [end]");
	}

}
