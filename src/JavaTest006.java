
import java.util.Scanner;

public class JavaTest006 {

	public JavaTest006 () {

		Log.log(Log.LOG_DEBUG, this.getClass().getName() + "::" + this.getClass().getName() + "()");

	}

	public void main() {

		Log.log(Log.LOG_DEBUG, this.getClass().getName() + "::main() [begin]");

		if (JavaLearn.JL_RUN) {

			/*
			String prenom;
			char reponse = 'O';
			Scanner sc = new Scanner(System.in);
			while (reponse == 'O')
			{
			  System.out.println("Donnez un prénom : ");
			  prenom = sc.nextLine();
			  System.out.println("Bonjour " +prenom+ ", comment vas-tu ?");                        
			  //Sans ça, nous n'entrerions pas dans la deuxième boucle
			  reponse = ' ';

			  //Tant que la réponse n'est pas O ou N, on repose la question
			  while(reponse != 'O' && reponse != 'N')
			  {
			    //On demande si la personne veut faire un autre essai
			    System.out.println("Voulez-vous réessayer ? (O/N)");
			    reponse = sc.nextLine().charAt(0);
			  }
			}
			System.out.println("Au revoir…");
			sc.close();
			}
			 */

			String prenom = new String();
			//Pas besoin d'initialiser : on entre au moins une fois dans la boucle !
			char reponse = ' ';

			Scanner sc = new Scanner(System.in);

			do{
				System.out.println("Donnez un prénom : ");
				prenom = sc.nextLine();
				System.out.println("Bonjour " +prenom+ ", comment vas-tu ?");

				do{
					System.out.println("Voulez-vous réessayer ? (O/N)");
					reponse = sc.nextLine().charAt(0);
				}while(reponse != 'O' && reponse != 'N');

			}while (reponse == 'O');

			System.out.println("Au revoir…");
			sc.close();

			/*
			for(int i = 1; i <= 10; i++)
			{
			  System.out.println("Voici la ligne "+i);
			}
			 */

			for(int i = 0, j = 2; (i < 20 && j < 30); i++, j+=2) {
				System.out.println("i = " + i + ", j = " + j);
			}

		}

		Log.log(Log.LOG_DEBUG, this.getClass().getName() + "::main() [end]");

	}

}
