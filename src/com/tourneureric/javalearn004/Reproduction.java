package com.tourneureric.javalearn004;

public interface Reproduction {

	public static void description() {
		Log.log(Log.LOG_DEBUG, "Reproduction::description() [begin]");

		System.out.println("Méthode statique dans une interface");

		Log.log(Log.LOG_DEBUG, "Reproduction::description() [end]");
	}

	public void penser();

}
