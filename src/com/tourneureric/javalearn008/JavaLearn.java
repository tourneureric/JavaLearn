package com.tourneureric.javalearn008;

public class JavaLearn {

	public static final boolean JL_RUN = true;
	private static boolean onJavaTestTemplate = false;
	private static boolean onJavaTest001 = false;
	private static boolean onJavaTest002 = false;
	private static boolean onJavaTest003 = false;
	private static boolean onJavaTest004 = true;

	public static void main(String[] args) {

		Log.log(Log.LOG_DEBUG, "JavaLearn::main() [begin]");

		if (onJavaTestTemplate) { JavaTestTemplate javaTest = new JavaTestTemplate(); javaTest.main(); }
		if (onJavaTest001) { JavaTest001 javaTest = new JavaTest001(); javaTest.main(); }
		if (onJavaTest002) { JavaTest002 javaTest = new JavaTest002(); javaTest.main(); }
		if (onJavaTest003) { JavaTest003 javaTest = new JavaTest003(); javaTest.main(); }
		if (onJavaTest004) { JavaTest004 javaTest = new JavaTest004(); javaTest.main(); }

		Log.log(Log.LOG_DEBUG, "JavaLearn::main() [end]");

	}

}
