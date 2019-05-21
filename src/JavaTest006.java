
import java.util.Scanner;

public class JavaTest006 {

	public JavaTest006 () {
		
		Log.log(Log.LOG_DEBUG, this.getClass().getName() + "::" + this.getClass().getName() + "()");
		
	}

	public void main() {
		
		Log.log(Log.LOG_DEBUG, this.getClass().getName() + "::main() [begin]");
		
		if (JavaLearn.JL_RUN) {
			
			//Une variable vide
			String prenom;
			//On initialise celle-ci à O pour oui
			char reponse = 'O';
			//Notre objet Scanner, n'oubliez pas l'import de java.util.Scanner !
			Scanner sc = new Scanner(System.in);
			//Tant que la réponse donnée est égale à oui…
			while (reponse == 'O')
			{
			  //On affiche une instruction
			  System.out.println("Donnez un prénom : ");
			  //On récupère le prénom saisi
			  prenom = sc.nextLine();
			  //On affiche notre phrase avec le prénom
			  System.out.println("Bonjour " +prenom+ ", comment vas-tu ?");
			  //On demande si la personne veut faire un autre essai
			  System.out.println("Voulez-vous réessayer ? (O/N)");
			  //On récupère la réponse de l'utilisateur
			  reponse = sc.nextLine().charAt(0);
			}
			sc.close();
			 
			System.out.println("Au revoir…");
			//Fin de la boucle
			
		}
		
		Log.log(Log.LOG_DEBUG, this.getClass().getName() + "::main() [end]");

	}

}
