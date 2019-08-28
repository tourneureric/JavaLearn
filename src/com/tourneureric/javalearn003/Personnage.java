package com.tourneureric.javalearn003;

public abstract class Personnage {

	protected String armes = "";
	protected String chaussure = "";
	protected String sacDeSoin = "";

	public void seDeplacer(){
		P.print("Je me déplace à pied.");
	}

	public void combattre(){
		P.print("Je ne combats PAS !");
	}

	public void soigner(){
		P.print("Je ne soigne pas.");
	}

	protected void setArmes(String armes) {
		this.armes = armes;
	}

	protected void setChaussure(String chaussure) {
		this.chaussure = chaussure;
	}

	protected void setSacDeSoin(String sacDeSoin) {
		this.sacDeSoin = sacDeSoin;
	}
}
