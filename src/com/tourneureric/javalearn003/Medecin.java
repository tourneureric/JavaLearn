package com.tourneureric.javalearn003;

public class Medecin extends Personnage{
	public void combattre() {
		if(this.armes.equals("pistolet"))
			P.print("Attaque au pistolet !");
		else
			P.print("Vive le scalpel !");
	}

	public void soigner(){
		if(this.sacDeSoin.equals("petit sac"))
			P.print("Je peux recoudre des blessures.");
		else
			P.print("Je soigne les blessures.");
	}
}
