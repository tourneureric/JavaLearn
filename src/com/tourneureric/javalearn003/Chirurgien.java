package com.tourneureric.javalearn003;

public class Chirurgien extends Personnage{
	public void soigner(){
		if(this.sacDeSoin.equals("gros sac"))
			P.print("Je fais des merveilles.");
		else
			P.print("Je fais des opérations.");
	}
}
