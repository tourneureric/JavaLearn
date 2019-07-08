package com.tourneureric.javalearn002;

public class Chien extends Canin implements Rintintin {

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

	@Override
	public void faireCalin() {
		Log.log(Log.LOG_DEBUG, "Chien::faireCalin() [begin]");

		P.print("Chien : Je te fais un GROS CÂLIN");

		Log.log(Log.LOG_DEBUG, "Chien::faireCalin() [end]");		
	}

	@Override
	public void faireLechouille() {
		Log.log(Log.LOG_DEBUG, "Chien::faireLechouille() [begin]");

		P.print("Chien : Je fais de grosses léchouilles...");

		Log.log(Log.LOG_DEBUG, "Chien::faireLechouille() [end]");		
	}

	@Override
	public void faireLeBeau() {
		Log.log(Log.LOG_DEBUG, "Chien::faireLeBeau() [begin]");

		P.print("Chien : Je fais le beau !");

		Log.log(Log.LOG_DEBUG, "Chien::faireLeBeau() [end]");		
	} 
}
