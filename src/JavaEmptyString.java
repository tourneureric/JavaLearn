
public class JavaEmptyString {

	public JavaEmptyString () {
		System.out.println("JavaEmptyString::JavaEmptyString()");
	}

	public void main() {
		System.out.println("JavaEmptyString::main()");
		System.out.println("");

		String s1 = new String("");
		System.out.println("s1='" + s1 + "'");
		String s2 = new String("ABC");
		System.out.println("s2='" + s2 + "'");
		System.out.println("");
		
		System.out.println("This is Okay");
		if (s1.equals("")) {
			System.out.println("		(s1.equals(\"\")) true");
		} else {
			System.out.println("		(s1.equals(\"\") false");
		}
		if (s2.equals("")) {
			System.out.println("	&&	(s2.equals(\"\")) true");
		} else {
			System.out.println("	&&	(s2.equals(\"\")) false");
		}
		System.out.println("");
		
		System.out.println("This is Okay");
		if (s1.isEmpty()) {
			System.out.println("		(s1.isEmpty()) true");
		} else {
			System.out.println("		(s1.isEmpty()) false");
		}
		if (s2.isEmpty()) {
			System.out.println("	&&	(s2.isEmpty()) true");
		} else {
			System.out.println("	&&	(s2.isEmpty()) false");
		}
		System.out.println("");
		
		System.out.println("This is Wrong");
		if (s1 == null) {
			System.out.println("		(s1 == null) true");
		} else {
			System.out.println("		(s1 == null) false");
		}
		if (s2 == null) {
			System.out.println("	&&	(s2 == null) true");
		} else {
			System.out.println("	&&	(s2 == null) false");
		}
		System.out.println("");
		
		System.out.println("This is Wrong");
		if (s1 == "") {
			System.out.println("		(s1 == \"\") true");
		} else {
			System.out.println("		(s1 == \"\") false");
		}
		if (s2 == "") {
			System.out.println("	&&	(s2 == \"\") true");
		} else {
			System.out.println("	&&	(s2 == \"\") false");
		}
		System.out.println("");

	}
	
}
