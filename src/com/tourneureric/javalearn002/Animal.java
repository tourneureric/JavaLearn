package com.tourneureric.javalearn002;

abstract class Animal {

	protected Animal() {
		Log.log(Log.LOG_DEBUG, "Animal::Animal() [begin]");

		P.print("Animal : instanciation");

		Log.log(Log.LOG_DEBUG, "Animal::Animal() [end]");	
	}

	protected String couleur;
	protected int poids;

	protected void manger() {
		Log.log(Log.LOG_DEBUG, "Animal::manger() [begin]");

		P.print("Animal : Je mange de la viande !");

		Log.log(Log.LOG_DEBUG, "Animal::manger() [end]");
	}

	protected void boire() {
		Log.log(Log.LOG_DEBUG, "Animal::boire() [begin]");

		P.print("Animal : Je bois de l'eau !");

		Log.log(Log.LOG_DEBUG, "Animal::boire() [end]");
	}

	abstract void deplacement();

	abstract void crier();

	public String toString(){
		String str = "Je suis un objet de la " + this.getClass() + ", je suis " + this.couleur + ", je pèse " + this.poids;
		return str;
	}        
}
