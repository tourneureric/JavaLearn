package com.tourneureric.javalearn006;

public class Voiture {

	private String marque;
	private String modele;
	private Integer prix;

	public Voiture() {
	}

	public Voiture(String marque, String modele, Integer prix) {
		this.marque = marque;
		this.modele = modele;
		this.prix = prix;
	}

	public String getMarque() {
		return marque;
	}

	public void setMarque(String marque) {
		this.marque = marque;
	}

	public String getModel() {
		return modele;
	}

	public void setModel(String modele) {
		this.modele = modele;
	}

	public Integer getPrix() {
		return prix;
	}

	public void setPrix(Integer prix) {
		this.prix = prix;
	}

	public String toString( ) {
		return "{marque=" + marque + ",modele=" + modele + ",prix=" + prix + "}";
	}

}
