
public class JavaLearn {
	
	private static boolean onJavaTest001 = false;
	private static boolean onJavaTest002 = false;
	private static boolean onJavaTest003 = false;
	private static boolean onJavaTest004 = false;
	private static boolean onJavaTest005 = true;

	public static void main(String[] args) {
		
		System.out.println("JavaLearn::main() [begin]");
	
		if (onJavaTest001) {
			JavaTest001 javaTest001 = new JavaTest001();
			javaTest001.main();
		}
		
		if (onJavaTest002) {
			JavaTest002 javaTest002 = new JavaTest002();
			javaTest002.main();
		}
		
		if (onJavaTest003) {
			JavaTest003 javaTest003 = new JavaTest003();
			javaTest003.main();
		}

		if (onJavaTest004) {
			JavaTest004 javaTest004 = new JavaTest004();
			javaTest004.main();
		}
		
		if (onJavaTest005) {
			JavaTest005 javaTest005 = new JavaTest005();
			javaTest005.main();
		}
		
		System.out.println("JavaLearn::main() [end]");
		
	}

}
