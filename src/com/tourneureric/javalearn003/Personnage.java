package com.tourneureric.javalearn003;

public abstract class Personnage {
	
	public void seDeplacer(){
		System.out.println("Je me déplace à pied.");
	}
	
	public void combattre(){
		System.out.println("Je ne combats PAS !");
	}
	
	public void soigner(){
		System.out.println("Je ne soigne pas.");
	}
	
}
