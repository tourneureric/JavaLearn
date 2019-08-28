package com.tourneureric.javalearn003;

import com.tourneureric.javalearn003.comportement.*;

public class Guerrier extends Personnage {	
	public Guerrier(){
		this.espritCombatif = new CombatPistolet();
	}
	public Guerrier(EspritCombatif esprit, Soin soin, Deplacement dep) {
		super(esprit, soin, dep);
	}
}
