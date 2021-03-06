package com.tourneureric.javalearntemplate;

public class JavaLearn {

	public static final boolean JL_RUN = true;

	private static boolean onJavaTestTemplate = false;
	private static boolean onJavaTest001 = true;

	public static void main(String[] args) {

		Log.log(Log.LOG_DEBUG, "JavaLearn::main() [begin]");

		if (onJavaTestTemplate) { JavaTestTemplate javaTest = new JavaTestTemplate(); javaTest.main(); }
		if (onJavaTest001) { JavaTest001 javaTest = new JavaTest001(); javaTest.main(); }

		Log.log(Log.LOG_DEBUG, "JavaLearn::main() [end]");

	}

}
