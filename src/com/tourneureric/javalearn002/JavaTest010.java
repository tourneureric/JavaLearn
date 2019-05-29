
package com.tourneureric.javalearn002;

import java.util.Scanner;

public class JavaTest010 {

	Scanner sc;

	private void doit() {

		Log.log(Log.LOG_DEBUG, this.getClass().getName() + "::doit() [begin]");
		
		Ville ville1 = new Ville();
		P.print("ville1 = " + ville1);
		
		Ville ville2 = new Ville("Marseille", 861_635, "France");
		P.print("ville2 = " + ville2);

		Ville ville3 = new Ville("Paris", 2_141_000, "France");
		P.print("ville3 = " + ville3);
		
		Ville villeTemp = new Ville();
		P.print("villeTemp = " + villeTemp);
		
		P.print("Inversion ville1 <=> ville2");
		villeTemp = ville1;
		ville1 = ville2;
		ville2 = villeTemp;
		
		P.print("ville1 = " + ville1);
		P.print("ville2 = " + ville2);
		
		P.print("Modification nom ville1 & ville2");
		ville1.setNomVille("Hong Kong");
		P.print("ville1.getNomVille() = " + ville1.getNomVille());
		ville2.setNomVille("Djibouti");
		P.print("ville2.getNomVille() = " + ville2.getNomVille());
		
		P.print("ville1 = " + ville1);
		P.print("ville2 = " + ville2);
		P.print("ville3 = " + ville3);
		
		P.print("ville1.comparer(ville2) = " + ville1.comparer(ville2));
		P.print("ville2.comparer(ville3) = " + ville2.comparer(ville3));
		
		Ville ville4 = new Ville();                
		P.print("Le nombre d'instances de la classe Ville est : " + Ville.nbreInstances);
		P.print("Le nombre d'instances de la classe Ville est : " + Ville.getNbreInstancesBis());
			                        
		Ville ville5 = new Ville("Marseille", 1236, "France");        
		P.print("Le nombre d'instances de la classe Ville est : " + Ville.nbreInstances);
		P.print("Le nombre d'instances de la classe Ville est : " + Ville.getNbreInstancesBis());
		
		Ville.nbreInstances = 97;
		                
		Ville ville6 = new Ville("Rio", 321654, "Brésil");        
		P.print("Le nombre d'instances de la classe Ville est : " + Ville.nbreInstances);
		P.print("Le nombre d'instances de la classe Ville est : " + Ville.getNbreInstancesBis());

		Log.log(Log.LOG_DEBUG, this.getClass().getName() + "::doit() [end]");

	}

	public void main() {

		Log.log(Log.LOG_DEBUG, this.getClass().getName() + "::main() [begin]");

		if (JavaLearn.JL_RUN) {

			try {

				String again = "n";

				sc = new Scanner(System.in);

				do {

					doit();

					P.print("Voulez-vous continuer (o/n) ?");
					again = sc.nextLine();

				} while (again.equalsIgnoreCase("o"));
				
				P.print("Fin");
				sc.close();

			} catch (Exception e) { Log.error("in main()"); throw e; }

			Log.log(Log.LOG_DEBUG, this.getClass().getName() + "::main() [end]");

		}

	}

	public JavaTest010 () {

		Log.log(Log.LOG_DEBUG, this.getClass().getName() + "::" + this.getClass().getName() + "()");

	}

}
