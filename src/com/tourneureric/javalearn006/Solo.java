package com.tourneureric.javalearn006;

public class Solo<T> {

	private T valeur;

	public Solo() {
		this.valeur = null;
	}

	public Solo(T valeur) {
		this.valeur = valeur;
	}

	public T getValeur() {
		return valeur;
	}

	public void setValeur(T valeur) {
		this.valeur = valeur;
	}


}
