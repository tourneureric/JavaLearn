import java.util.Scanner;

public class JavaTest005 {

	public JavaTest005 () {
		
		System.out.println("JavaTest005::JavaTest005()");
		
	}

	public void main() {
		
		System.out.println("JavaTest005::main() [begin]");
		
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("Veuillez saisir un boolean (true|false) :");
			boolean my_boolean = sc.nextBoolean();
			System.out.println("my_boolean = " + my_boolean);
			String choice = (my_boolean ? "[T.R.U.E]" : "[F.A.L.S.E]");
			System.out.println("choice = " + choice);
		} catch (Exception e) { System.out.println("ERROR " + e.getMessage()); }		

		try {
			sc.close();
		} catch (Exception e) { System.out.println("ERROR"); }
		
		System.out.println("JavaTest005::main() [end]");

	}

}
