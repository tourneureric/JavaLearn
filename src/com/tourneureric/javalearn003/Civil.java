package com.tourneureric.javalearn003;

public class Civil extends Personnage{
	public void combattre(){
		if(this.armes.equals("couteau"))
			P.print("Attaque au couteau !");
		else
			P.print("Je ne combats PAS !");
	}
}
