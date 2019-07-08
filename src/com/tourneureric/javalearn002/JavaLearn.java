package com.tourneureric.javalearn002;

public class JavaLearn {

	public static final boolean JL_RUN = true;

	private static boolean onJavaTestTemplate = false;
	private static boolean onJavaTest010 = false;
	private static boolean onJavaTest011 = false;
	private static boolean onJavaTest012 = false;
	private static boolean onJavaTest013 = false;
	private static boolean onJavaTest014 = false;
	private static boolean onJavaTest015 = true;


	public static void main(String[] args) {

		Log.log(Log.LOG_DEBUG, "JavaLearn::main() [begin]");

		if (onJavaTestTemplate) { JavaTestTemplate javaTest = new JavaTestTemplate(); javaTest.main(); }
		if (onJavaTest010) { JavaTest010 javaTest = new JavaTest010(); javaTest.main(); }
		if (onJavaTest011) { JavaTest011 javaTest = new JavaTest011(); javaTest.main(); }
		if (onJavaTest012) { JavaTest012 javaTest = new JavaTest012(); javaTest.main(); }
		if (onJavaTest013) { JavaTest013 javaTest = new JavaTest013(); javaTest.main(); }
		if (onJavaTest014) { JavaTest014 javaTest = new JavaTest014(); javaTest.main(); }
		if (onJavaTest015) { JavaTest015 javaTest = new JavaTest015(); javaTest.main(); }

		Log.log(Log.LOG_DEBUG, "JavaLearn::main() [end]");

	}

}
