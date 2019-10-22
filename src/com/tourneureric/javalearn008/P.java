package com.tourneureric.javalearn008;

public class P {

	private static final boolean PRINT_ON = true;

	public static final void print(Object pObject) {
		if (PRINT_ON) {
			System.out.print(pObject);
		}
	}
	
	public static final void println(Object pObject) {
		if (PRINT_ON) {
			System.out.println(pObject);
		}
	}

}
