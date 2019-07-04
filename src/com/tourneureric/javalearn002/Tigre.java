package com.tourneureric.javalearn002;

public class Tigre extends Felin {

	public Tigre() {
		Log.log(Log.LOG_DEBUG, "Tigre::Tigre() [begin]");

		P.print("Tigre : instanciation");

		Log.log(Log.LOG_DEBUG, "Tigre::Tigre() [end]");
	}

	public Tigre(String couleur, int poids) {
		this.couleur = couleur;
		this.poids = poids;
	}

	void crier() {
		Log.log(Log.LOG_DEBUG, "Tigre::crier() [begin]");

		P.print("Tigre : Je grogne très fort !");

		Log.log(Log.LOG_DEBUG, "Tigre::crier() [end]");
	} 
}
