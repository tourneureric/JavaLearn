
package com.tourneureric.javalearn001;

public class JavaLearn {

	public static final boolean JL_RUN = true;

	private static boolean onJavaTestTemplate = false;
	private static boolean onJavaTest001 = false;
	private static boolean onJavaTest002 = false;
	private static boolean onJavaTest003 = false;
	private static boolean onJavaTest004 = false;
	private static boolean onJavaTest005 = false;
	private static boolean onJavaTest006 = false;
	private static boolean onJavaTest007 = false;
	private static boolean onJavaTest008 = false;
	private static boolean onJavaTest009 = false;
	private static boolean onJavaTest010 = true;

	public static void main(String[] args) {

		Log.log(Log.LOG_DEBUG, "JavaLearn::main() [begin]");

		if (onJavaTestTemplate) { JavaTestTemplate javaTest = new JavaTestTemplate(); javaTest.main(); }
		if (onJavaTest001) { JavaTest001 javaTest = new JavaTest001(); javaTest.main(); }
		if (onJavaTest002) { JavaTest002 javaTest = new JavaTest002(); javaTest.main(); }
		if (onJavaTest003) { JavaTest003 javaTest = new JavaTest003(); javaTest.main(); }
		if (onJavaTest004) { JavaTest004 javaTest = new JavaTest004(); javaTest.main(); }
		if (onJavaTest005) { JavaTest005 javaTest = new JavaTest005(); javaTest.main(); }
		if (onJavaTest006) { JavaTest006 javaTest = new JavaTest006(); javaTest.main(); }
		if (onJavaTest007) { JavaTest007 javaTest = new JavaTest007(); javaTest.main(); }
		if (onJavaTest008) { JavaTest008 javaTest = new JavaTest008(); javaTest.main(); }
		if (onJavaTest009) { JavaTest009 javaTest = new JavaTest009(); javaTest.main(); }
		if (onJavaTest010) { JavaTest010 javaTest = new JavaTest010(); javaTest.main(); }

		Log.log(Log.LOG_DEBUG, "JavaLearn::main() [end]");

	}

}
