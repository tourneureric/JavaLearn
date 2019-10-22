package com.tourneureric.javalearn008;

public class Personne {

	int age;
	String name;

	public Personne(int age, String name) {
		this.age = age;
		this.name = name;
	}

	public String getNom() {
		return name;
	}

	public int getAge() {
		return age;
	}
	
	public String toString() {
		 return "#Nom : " + name + " - age : " + age + "#";
	}

}
