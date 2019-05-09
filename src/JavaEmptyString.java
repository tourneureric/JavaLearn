
public class JavaEmptyString {

	public JavaEmptyString () {
		System.out.println("JavaEmptyString::JavaEmptyString()");
	}

	public void main() {
		System.out.println("JavaEmptyString::main()");

		String s1 = new String("");
		System.out.println("s1='" + s1 + "'");
		
		// This is Okay
		if (s1.equals("")) {
			System.out.println("s1.equals(\"\")");
		} else {
			System.out.println("! s1.equals(\"\")");
		}
		
		// This is Okay
		if (s1.isEmpty()) {
			System.out.println("s1 is empty");
		}
		
		// This is Wrong
		if (s1 == null) {
			System.out.println("s1 is null");
		} else {
			System.out.println("s1 is not null");
		}
		
		// This is Wrong
		if (s1 == "") {
			System.out.println("s1 == \"\"");
		} else {
			System.out.println("s1 != \"\"");
		}
		
		String s2 = new String("ABC");
		System.out.println("s2='" + s2 + "'");
		
		// This is Okay
		if (s2.equals("")) {
			System.out.println("s2.equals(\"\")");
		} else {
			System.out.println("! s2.equals(\"\")");
		}
		
		// This is Okay
		if (s2.isEmpty()) {
			System.out.println("s2 is empty");
		}
		
		// This is Wrong
		if (s2 == null) {
			System.out.println("s2 is null");
		} else {
			System.out.println("s2 is not null");
		}
		
		// This is Wrong
		if (s2 == "") {
			System.out.println("s2 == \"\"");
		} else {
			System.out.println("s2 != \"\"");
		}

	}
	
}
