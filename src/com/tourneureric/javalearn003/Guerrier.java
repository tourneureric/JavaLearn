package com.tourneureric.javalearn003;

public class Guerrier extends Personnage {

	public void combattre() {
		if(this.armes.equals("pistolet"))
			P.print("Attaque au pistolet !");
		else if(this.armes.equals("fusil de sniper"))
			P.print("Attaque au fusil de sniper !");
		else
			P.print("Attaque au couteau !");
	}
}
