package com.tourneureric.javalearn003;

public class Chirurgien extends Personnage{
  public void combattre() {
    System.out.println("Je ne combats PAS !");
  }

  public void seDeplacer() {
    System.out.println("Je me d�place � pied.");
  }

  public void soigner(){
    System.out.println("Je fais des op�rations.");
  }
}
