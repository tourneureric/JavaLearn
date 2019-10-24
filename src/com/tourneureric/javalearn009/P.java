package com.tourneureric.javalearn009;

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
	
	public static final void printline() {
		if (PRINT_ON) {
			System.out.println("================================================================================");
		}
	}

}
