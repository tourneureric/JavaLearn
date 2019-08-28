package com.tourneureric.javalearn003;

import com.tourneureric.javalearn003.comportement.*;


public class Civil extends Personnage{
	  public Civil() {}

	  public Civil(EspritCombatif esprit, Soin soin, Deplacement dep) {
	    super(esprit, soin, dep);
	  }	
	}
