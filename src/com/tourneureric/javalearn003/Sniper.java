package com.tourneureric.javalearn003;

public class Sniper extends Personnage{
	public void combattre() {
		if(this.armes.equals("fusil à pompe"))
			P.print("Attaque au fusil à pompe !");
		else
			P.print("Je me sers de mon fusil à lunette !");
	}
}
