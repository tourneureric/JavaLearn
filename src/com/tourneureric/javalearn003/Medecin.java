package com.tourneureric.javalearn003;

public class Medecin extends Personnage{
  public void combattre() {
    System.out.println("Vive le scalpel !");
  }

  public void seDeplacer() {
    System.out.println("Je me d�place � pied.");
  }

  public void soigner(){
    System.out.println("Je soigne les blessures.");
  }
}
