package com.tourneureric.javalearn006;

public class Duo<T, S> {

	private T valeur1;

	private S valeur2;

	public Duo() {
		this.valeur1 = null;
		this.valeur2 = null;
	}

	public Duo(T valeur1, S valeur2) {
		this.valeur1 = valeur1;
		this.valeur2 = valeur2;
	}

	public T getValeur1() {
		return valeur1;
	}

	public void setValeur1(T valeur1) {
		this.valeur1 = valeur1;
	}

	public S getValeur2() {
		return valeur2;
	}

	public void setValeur2(S valeur2) {
		this.valeur2 = valeur2;
	}

	public void setValeur(T valeur1, S valeur2) {
		this.valeur1 = valeur1;
		this.valeur2 = valeur2;
	}

}
