package com.tourneureric.javalearn003;

public class Sniper extends Personnage{
	public void combattre() {
		if(this.armes.equals("fusil � pompe"))
			P.print("Attaque au fusil � pompe !");
		else
			P.print("Je me sers de mon fusil � lunette !");
	}
}
