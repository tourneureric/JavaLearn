package com.tourneureric.javalearn002;

public class Chat extends Felin {

	public Chat() {

	}

	public Chat(String couleur, int poids) {
		this.couleur = couleur;
		this.poids = poids;
	}

	void crier() {
		Log.log(Log.LOG_DEBUG, "Chat::crier() [begin]");

		P.print("Chat : Je miaule sur les toits !");

		Log.log(Log.LOG_DEBUG, "Chat::crier() [end]");
	} 
}
