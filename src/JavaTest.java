
public class JavaTest {

	public JavaTest () {
		System.out.println("JavaTest::JavaTest()");
	}

	public void main() {
		System.out.println("JavaTest::main()");

		String s1 = new String("");
		System.out.println("s1='" + s1 + "'");
		
		if (s1.isEmpty()) {
			System.out.println("s1 is empty");
		}
		
		if (s1 == null) {
			System.out.println("s1 is null");
		} else {
			System.out.println("s1 is not null");
		}
	}
	
}
