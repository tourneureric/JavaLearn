package com.tourneureric.javalearn006;

public class VoitureSansPermis extends Voiture {

	private Integer vitesseMaxi;

	public VoitureSansPermis() {
		super("Inconnu", "Inconnu", 0);
		setVitesseMaxi(0);
	}

	public VoitureSansPermis(String marque, String model, Integer prix, Integer vitesseMaxi) {
		super(marque, model, prix);
		this.setVitesseMaxi(vitesseMaxi);
	}

	public Integer getVitesseMaxi() {
		return vitesseMaxi;
	}

	public void setVitesseMaxi(Integer vitesseMaxi) {
		this.vitesseMaxi = vitesseMaxi;
	}
	
	public String toString() {
		return "{" + super.toString() + ",vitesseMaxi=" + vitesseMaxi + "}";
	}

}
