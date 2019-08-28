package com.tourneureric.javalearn003;

public class Guerrier extends Personnage {	
	public Guerrier(){
		this.espritCombatif = new CombatPistolet();
	}
	public Guerrier(EspritCombatif esprit, Soin soin, Deplacement dep) {
		super(esprit, soin, dep);
	}
}
