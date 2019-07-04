package com.tourneureric.javalearn002;

public class Loup extends Canin {

	public Loup() {
		Log.log(Log.LOG_DEBUG, "Loup::Loup() [begin]");

		P.print("Loup : instanciation");

		Log.log(Log.LOG_DEBUG, "Loup::Loup() [end]");	
	}

	public Loup(String couleur, int poids) {
		this.couleur = couleur;
		this.poids = poids;
	}       

	void crier() {
		Log.log(Log.LOG_DEBUG, "Loup::crier() [begin]");

		P.print("Loup : Je hurle à la Lune en faisant ouhouh !"); 

		Log.log(Log.LOG_DEBUG, "Loup::crier() [end]");
	}
}
