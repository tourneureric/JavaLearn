package com.tourneureric.javalearn005;

public class AvantEnumeration {

	public static final int PARAM1 = 1;
	public static final int PARAM2 = 2;

	public void fait(Langage param){
		if(param.equals(Langage.JAVA))
			System.out.println("Fait à la façon N°1");
		if(param.equals(Langage.PHP))
			System.out.println("Fait à la façon N°2");
	}

}
