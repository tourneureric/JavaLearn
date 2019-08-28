package com.tourneureric.javalearn003;

import com.tourneureric.javalearn003.comportement.*;

public abstract class Personnage {

  //Nos instances de comportement
  protected EspritCombatif espritCombatif = new Pacifiste();
  protected Soin soin = new AucunSoin();
  protected Deplacement deplacement = new Marcher();	
	
  //Constructeur par d�faut
  public Personnage(){}
	
  //Constructeur avec param�tres
  public Personnage(EspritCombatif espritCombatif, Soin soin, Deplacement deplacement) {
    this.espritCombatif = espritCombatif;
    this.soin = soin;
    this.deplacement = deplacement;
  }
	
  //M�thode de d�placement de personnage
  public void seDeplacer(){
    //On utilise les objets de d�placement de fa�on polymorphe
    deplacement.deplacer();
  }

  // M�thode que les combattants utilisent
  public void combattre(){
    //On utilise les objets de d�placement de fa�on polymorphe
    espritCombatif.combat();
  }
	
  //M�thode de soin
  public void soigner(){
    //On utilise les objets de d�placement de fa�on polymorphe
    soin.soigner();
  }

  //Red�finit le comportement au combat
  public void setEspritCombatif(EspritCombatif espritCombatif) {
    this.espritCombatif = espritCombatif;
  }

  //Red�finit le comportement de Soin
  public void setSoin(Soin soin) {
    this.soin = soin;
  }

  //Red�finit le comportement de d�placement
  public void setDeplacement(Deplacement deplacement) {
    this.deplacement = deplacement;
  }	
}