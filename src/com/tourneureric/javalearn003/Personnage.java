package com.tourneureric.javalearn003;

import com.tourneureric.javalearn003.comportement.*;

public abstract class Personnage {

  //Nos instances de comportement
  protected EspritCombatif espritCombatif = new Pacifiste();
  protected Soin soin = new AucunSoin();
  protected Deplacement deplacement = new Marcher();	
	
  //Constructeur par défaut
  public Personnage(){}
	
  //Constructeur avec paramètres
  public Personnage(EspritCombatif espritCombatif, Soin soin, Deplacement deplacement) {
    this.espritCombatif = espritCombatif;
    this.soin = soin;
    this.deplacement = deplacement;
  }
	
  //Méthode de déplacement de personnage
  public void seDeplacer(){
    //On utilise les objets de déplacement de façon polymorphe
    deplacement.deplacer();
  }

  // Méthode que les combattants utilisent
  public void combattre(){
    //On utilise les objets de déplacement de façon polymorphe
    espritCombatif.combat();
  }
	
  //Méthode de soin
  public void soigner(){
    //On utilise les objets de déplacement de façon polymorphe
    soin.soigner();
  }

  //Redéfinit le comportement au combat
  public void setEspritCombatif(EspritCombatif espritCombatif) {
    this.espritCombatif = espritCombatif;
  }

  //Redéfinit le comportement de Soin
  public void setSoin(Soin soin) {
    this.soin = soin;
  }

  //Redéfinit le comportement de déplacement
  public void setDeplacement(Deplacement deplacement) {
    this.deplacement = deplacement;
  }	
}