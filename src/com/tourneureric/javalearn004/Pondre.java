package com.tourneureric.javalearn004;

public interface Pondre extends Reproduction {

	public static void description() {
		Log.log(Log.LOG_DEBUG, "Pondre::description() [begin]");

		Reproduction.description();
		P.print("Red�finie dans Pondre.java");
		
		Log.log(Log.LOG_DEBUG, "Pondre::description() [end]");
	}

}
