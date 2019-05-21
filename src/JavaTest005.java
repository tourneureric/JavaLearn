
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
			System.out.println("Veuillez saisir un int :");
			int i = sc.nextInt();
			System.out.println("i = " + i);
			
			if (i < 0)
					System.out.println("Ce nombre est négatif !");      
			else if(i > 0)
					System.out.println("Ce nombre est positif !");           
			else  
					System.out.println("Ce nombre est nul !");
			sc.nextLine();
			
			if(i >=0 && i <= 100) 
			  System.out.println("Le nombre est bien dans l'intervalle [0-100].");
			else
			  System.out.println("Le nombre n'est pas dans l'intervalle [0-100].");
			
			System.out.println("Veuillez saisir deux int :");
			int x = sc.nextInt();
			int y = sc.nextInt();
			sc.nextLine();
			
			System.out.println("x = " + x);
			System.out.println("y = " + y);
			
			int max = (x < y) ? y : x ;
			
			System.out.println("max(" + x + ", " + y + ") = " + max);
			
		} catch (Exception e) { System.out.println("ERROR " + e.getMessage()); }	
		 
		try {
			sc.close();
		} catch (Exception e) { System.out.println("ERROR"); }
		
		Log.log(Log.LOG_DEBUG, this.getClass().getName() + "::main() [end]");

	}

}
