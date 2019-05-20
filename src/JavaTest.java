import java.util.ArrayList;
import java.util.Scanner;

public class JavaTest {

	public JavaTest () {
		
		System.out.println("JavaTest::JavaTest()");
		
	}

	public void main() {

		System.out.println("JavaTest::main() [begin]");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Veuillez saisir un mot :");
		String str = sc.nextLine();
		System.out.println("Vous avez saisi le mot : " + str);
		
		System.out.println("Veuillez saisir trois nombres :");
		int nb1 = sc.nextInt();
		int nb2 = sc.nextInt();
		int nb3 = sc.nextInt();
		System.out.println("Vous avez saisi les nombres : " + nb1 + ", " + nb2 + ", " + nb3);
		sc.nextLine();
		
		ArrayList<String> listString = new ArrayList<>();
		String input;
		System.out.println("Veuillez saisir du texte :");
		do {
			input = sc.nextLine();
			// System.out.println("input = '" + input + "'");
			listString.add(input);
		} while (! input.isEmpty());
		System.out.println("Vous avez saisi le texte :" + listString);
		
		System.out.println("Veuillez saisir un char (1 seul caractère) :");
		String s = sc.nextLine();
		char my_char = s.charAt(0);
		System.out.println("my_char = " + my_char);	
		
		System.out.println("Veuillez saisir un byte :");
		byte my_byte = sc.nextByte();
		System.out.println("my_byte = " + my_byte);
		
		System.out.println("Veuillez saisir un short :");
		short my_short = sc.nextShort();
		System.out.println("my_short = " + my_short);
		
		System.out.println("Veuillez saisir un int :");
		int my_int =sc.nextInt();
		System.out.println("my_int = " + my_int);
		
		System.out.println("Veuillez saisir un long :");
		long my_long = sc.nextLong();
		System.out.println("my_long = " + my_long);

		System.out.println("Veuillez saisir un float :");
		float my_float = sc.nextFloat();
		System.out.println("my_float = " + my_float);
		
		System.out.println("Veuillez saisir un double :");
		double my_double = sc.nextDouble();
		System.out.println("my_double = " + my_double);
		
		System.out.println("Veuillez saisir un boolean :");
		boolean my_boolean = sc.nextBoolean();
		System.out.println("my_boolean = " + my_boolean);

		sc.close();
		
		System.out.println("JavaTest::main() [end]");

	}
	
}
