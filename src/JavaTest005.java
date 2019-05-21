
import java.util.Scanner;

public class JavaTest005 {

	public JavaTest005 () {
		
		Log.log(Log.LOG_DEBUG, this.getClass().getName() + "::" + this.getClass().getName() + "()");
		
	}

	public void main() {
		
		Log.log(Log.LOG_DEBUG, this.getClass().getName() + "::main() [begin]");
		
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
		
		
		int i = -10;
		 
		if (i < 0)
		  System.out.println("le nombre est négatif");
		else
		  System.out.println("le nombre est positif");
		
		Log.log(Log.LOG_DEBUG, this.getClass().getName() + "::main() [end]");

	}

}
