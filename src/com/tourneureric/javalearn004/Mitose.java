package com.tourneureric.javalearn004;

public interface Mitose extends Reproduction {
	
	public static void description() {
		Log.log(Log.LOG_DEBUG, "Mitose::description() [begin]");

		Reproduction.description();
		P.print("Redéfinie dans Mitose.java");
		
		Log.log(Log.LOG_DEBUG, "Mitose::description() [end]");
	}
	
}
