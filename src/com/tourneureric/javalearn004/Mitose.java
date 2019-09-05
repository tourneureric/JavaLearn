package com.tourneureric.javalearn004;

public interface Mitose extends Reproduction {

	public static void description() {
		Log.log(Log.LOG_DEBUG, "Mitose::description() [begin]");

		Reproduction.description();
		P.print("Red�finie dans Mitose.java");

		Log.log(Log.LOG_DEBUG, "Mitose::description() [end]");
	}

	default void reproduire() {
		System.out.println("Je me divise !");
	}

	default void penser() {
		System.out.println("Je pense que je me divise !");
	}

}
