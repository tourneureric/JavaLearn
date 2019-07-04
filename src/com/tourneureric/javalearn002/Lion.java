package com.tourneureric.javalearn002;

public class Lion extends Felin {

	public Lion() {
		Log.log(Log.LOG_DEBUG, "Lion::Lion() [begin]");

		P.print("Lion : instanciation");

		Log.log(Log.LOG_DEBUG, "Lion::Lion() [end]");
	}

	public Lion(String couleur, int poids) {
		this.couleur = couleur;
		this.poids = poids;
	}       

	void crier() {
		Log.log(Log.LOG_DEBUG, "Lion::crier() [begin]");

		P.print("Lion : Je rugis dans la savane !");

		Log.log(Log.LOG_DEBUG, "Lion::crier() [end]");
	} 
}
