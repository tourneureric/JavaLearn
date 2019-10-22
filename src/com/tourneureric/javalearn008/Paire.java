package com.tourneureric.javalearn008;

public class Paire {
	private String valeur1, valeur2;

	public Paire() {
		this.valeur1 = null;
		this.valeur2 = null;
		System.out.println("Instanciation !");
	}

	public Paire(String val1, String val2) {
		this.valeur1 = val1;
		this.valeur2 = val2;
		System.out.println("Instanciation avec des paramètres !");
	}

	public String toString() {
		return  "Je suis un objet qui a pour valeur : " + this.valeur1 +  " - " + this.valeur2;
	}

	public String getValeur1() {
		return valeur1;
	}

	public void setValeur1(String valeur1) {
		this.valeur1 = valeur1;
	}

	public String getValeur2() {
		return valeur2;
	}

	public void setValeur2(String valeur2) {
		this.valeur2 = valeur2;
	}
}
