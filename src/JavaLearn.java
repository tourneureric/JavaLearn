
public class JavaLearn {
	
	private static boolean onJavaTypes = false;
	private static boolean onJavaDebug = false;
	private static boolean onJavaTest = false;
	private static boolean onJavaEmptyString = true;


	public static void main(String[] args) {
		
		if (onJavaTypes) {
			JavaTypes javaTypes = new JavaTypes();
			javaTypes.main();
		}
		
		if (onJavaDebug) {
			JavaDebug javaDebug = new JavaDebug();
			javaDebug.main();
		}
		
		if (onJavaTest) {
			JavaTest javaTest = new JavaTest();
			javaTest.main();
		}

		if (onJavaEmptyString) {
			JavaEmptyString javaEmptyString = new JavaEmptyString();
			javaEmptyString.main();
		}
		
	}

}
