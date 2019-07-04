package com.tourneureric.javalearn002;

public class Chien extends Canin {

	public Chien() {
		Log.log(Log.LOG_DEBUG, "Chien::Chien() [begin]");

		P.print("Chien : instanciation");

		Log.log(Log.LOG_DEBUG, "Chien::Chien() [end]");	
	}

	public Chien(String couleur, int poids) {
		this.couleur = couleur;
		this.poids = poids;
	}       

	void crier() {
		Log.log(Log.LOG_DEBUG, "Chien::crier() [begin]");

		P.print("Chien : J'aboie sans raison !");

		Log.log(Log.LOG_DEBUG, "Chien::crier() [end]");
	} 
}
