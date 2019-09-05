package com.tourneureric.javalearn004;

public interface Pondre extends Reproduction {

	public static void description() {
		Log.log(Log.LOG_DEBUG, "Pondre::description() [begin]");

		Reproduction.description();
		P.print("Redéfinie dans Pondre.java");

		Log.log(Log.LOG_DEBUG, "Pondre::description() [end]");
	}

	default void reproduire() {
		System.out.println("Je ponds des oeufs !");
	}

	default void penser() {
		System.out.println("Je pense que je ponds des oeufs !");
	}

}
