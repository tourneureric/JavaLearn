package com.tourneureric.javalearn004;

public class Alien implements Pondre, Mitose {

	public void reproduire() {

		Log.log(Log.LOG_DEBUG, this.getClass().getSimpleName() + "::reproduire() [begin]");

		P.print("Je suis un alien et :");
		Pondre.super.reproduire();
		Mitose.super.reproduire();

		Log.log(Log.LOG_DEBUG, this.getClass().getSimpleName() + "::reproduire() [end]");

	}

	public void penser() {

		Log.log(Log.LOG_DEBUG, this.getClass().getSimpleName() + "::penser() [begin]");

		P.print("Je pense donc je suis !");
		Pondre.super.penser();
		Mitose.super.penser();

		Log.log(Log.LOG_DEBUG, this.getClass().getSimpleName() + "::penser() [end]");

	}

	public Alien () {

		Log.log(Log.LOG_DEBUG, this.getClass().getSimpleName() + "::" + this.getClass().getSimpleName() + "[begin]");

		Log.log(Log.LOG_DEBUG, this.getClass().getSimpleName() + "::" + this.getClass().getSimpleName() + "[end]");

	}

}
