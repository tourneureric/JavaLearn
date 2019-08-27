package com.tourneureric.javalearn003;

public class Log {

	public static final int LOG_INFO = 1;
	public static final int LOG_TRACE = 2;
	public static final int LOG_DEBUG = 3;

	private static final boolean LOG_ON = true;
	private static final int LOG_LEVEL = LOG_DEBUG;

	public static final void log(int pLevel, String pText) {
		if (LOG_ON && pLevel <= LOG_LEVEL) {
			switch (pLevel) {
			case LOG_INFO:
				System.out.println("INFO " + pText);
				break;
			case LOG_TRACE:
				System.out.println("TRACE " + pText);
				break;
			case LOG_DEBUG:
				System.out.println("DEBUG " + pText);
				break;
			default:
				System.out.println(pText);
				break;
			}
		}
	}

	public static final void error(String pText) {
		System.out.println("ERROR " + pText);
	}

}
