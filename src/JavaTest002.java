
public class JavaTest002 {

	public JavaTest002 () {
		
		System.out.println("JavaTest002::JavaTest002()");
		
	}

	@SuppressWarnings("unused")
	public void main() {
		
		System.out.println("JavaTest002::main() [begin]");
		
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
		
		System.out.println("User u1 =  new User(\"\", -1)");
		User u1 =  new User("", -1);
		String s3 = u1.getText();
		System.out.println("		s3 = u1.getText() = '" + s3 + "'");
		if (s3.equals("")) {
			System.out.println("		(s3.equals(\"\")) true");
		} else {
			System.out.println("		(s3.equals(\"\") false");
		}
		if (s3.isEmpty()) {
			System.out.println("		(s3.isEmpty()) true");
		} else {
			System.out.println("		(s3.isEmpty()) false");
		}
		System.out.println("");

		
		System.out.println("User u2 =  new User(null, -1)");
		User u2 =  new User(null, -1);
		String s4 = u1.getText();
		System.out.println("		s4 = u2.getText() = '" + s3 + "'");
		if (s4.equals("")) {
			System.out.println("		(s4.equals(\"\")) true");
		} else {
			System.out.println("		(s4.equals(\"\") false");
		}
		if (s4.isEmpty()) {
			System.out.println("		(s4.isEmpty()) true");
		} else {
			System.out.println("		(s4.isEmpty()) false");
		}
		System.out.println("");
		
		System.out.println("JavaTest002::main() [end]");

	}
	
}
