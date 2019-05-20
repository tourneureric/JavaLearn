
import java.util.ArrayList;
import java.util.Scanner;

public class JavaTest004 {

	public JavaTest004 () {
		
		System.out.println("JavaTest004::JavaTest004()");
		
	}

	public void main() {

		System.out.println("JavaTest004::main() [begin]");
		
		Scanner sc = new Scanner(System.in);
	
		try {
			System.out.println("Veuillez saisir un mot :");
			String str = sc.nextLine();
			System.out.println("Vous avez saisi le mot : " + str);
		} catch (Exception e) { System.out.println("ERROR " + e.getMessage()); }		
		
		try {
			System.out.println("Veuillez saisir trois nombres :");
			int nb1 = sc.nextInt();
			int nb2 = sc.nextInt();
			int nb3 = sc.nextInt();
			System.out.println("Vous avez saisi les nombres : " + nb1 + ", " + nb2 + ", " + nb3);
			sc.nextLine();
		} catch (Exception e) { System.out.println("ERROR " + e.getMessage()); }		

		try {
			ArrayList<String> listString = new ArrayList<>();
			String input;
			System.out.println("Veuillez saisir du texte :");
			do {
				input = sc.nextLine();
				System.out.println("input = '" + input + "'");
				listString.add(input);
			} while (! input.isEmpty());
			System.out.println("Vous avez saisi le texte :" + listString);
		} catch (Exception e) { System.out.println("ERROR " + e.getMessage()); }		

		try {
			System.out.println("Veuillez saisir un char (1 seul caractere) :");
			String s = sc.nextLine();
			char my_char = s.charAt(0);
			System.out.println("my_char = " + my_char);	
		} catch (Exception e) { System.out.println("ERROR " + e.getMessage()); }		
		
		try {
			System.out.println("Veuillez saisir un byte :");
			byte my_byte = sc.nextByte();
			System.out.println("my_byte = " + my_byte);
		} catch (Exception e) { System.out.println("ERROR " + e.getMessage()); }		
		
		try {
			System.out.println("Veuillez saisir un short :");
			short my_short= sc.nextShort();
			System.out.println("my_short = " + my_short);
		} catch (Exception e) { System.out.println("ERROR " + e.getMessage()); }		

		try {
			System.out.println("Veuillez saisir un int :");
			int my_int = sc.nextInt();
			System.out.println("my_int = " + my_int);
		} catch (Exception e) { System.out.println("ERROR " + e.getMessage()); }		

		try {
			System.out.println("Veuillez saisir un long :");
			long my_long = sc.nextLong();
			System.out.println("my_long = " + my_long);
		} catch (Exception e) { System.out.println("ERROR " + e.getMessage()); }		

		try {
			System.out.println("Veuillez saisir un float :");
			float my_float = sc.nextFloat();
			System.out.println("my_float = " + my_float);
		} catch (Exception e) { System.out.println("ERROR " + e.getMessage()); }		

		try {
			System.out.println("Veuillez saisir un double :");
			double my_double = sc.nextDouble();
			System.out.println("my_double = " + my_double);
		} catch (Exception e) { System.out.println("ERROR " + e.getMessage()); }		

		try {
			System.out.println("Veuillez saisir un boolean :");
			boolean my_boolean = sc.nextBoolean();
			System.out.println("my_boolean = " + my_boolean);

		} catch (Exception e) { System.out.println("ERROR " + e.getMessage()); }		

		try {
			sc.close();
		} catch (Exception e) { System.out.println("ERROR"); }
		
		System.out.println("JavaTest004::main() [end]");

	}
	
}
