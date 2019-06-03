
package com.tourneureric.javalearn002;

import java.util.Scanner;

public class JavaTest011 {

	Scanner sc;

	private void doit() {

		Log.log(Log.LOG_DEBUG, "JavaTest011::doit() [begin]");

		// Capitale cap = new Capitale();
		// P.print(cap.toString());

		// Capitale paris = new Capitale("Paris", 2_141_000, "France", "Tour Eiffel");
		// P.print("paris = " + paris);

		//Définition d'un tableau de villes null
		Ville[] tabVille = new Ville[6];

		//Définition d'un tableau de noms de villes et un autre de nombres d'habitants
		String[] tab1 = {"Marseille", "Lille", "Caen", "Lyon", "Paris", "Nantes"};
		int[] tab2 = {123456, 78456, 654987, 75832165, 1594, 213};

		//Les trois premiers éléments du tableau seront des villes,
		//et le reste, des capitales
		for (int i = 0; i < 6; i++) {
			if (i < 3) {
				Ville V = new Ville(tab1[i], tab2[i], "france");
				tabVille[i] = V;
			} else {
				Capitale C = new Capitale(tab1[i], tab2[i], "France", "Tour Eiffel");
				tabVille[i] = C;
			}
		}

		//Il ne nous reste plus qu'à décrire tout notre tableau !
		for (Ville V : tabVille) {
			P.print(V.toString() + "\n");
		}

		Log.log(Log.LOG_DEBUG, "JavaTest011::doit() [end]");

	}

	public void main() {

		Log.log(Log.LOG_DEBUG, "JavaTest011::main() [begin]");

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

			Log.log(Log.LOG_DEBUG, "JavaTest011::main() [end]");

		}

	}

	public JavaTest011 () {

		Log.log(Log.LOG_DEBUG, "JavaTest011::JavaTest011() [begin]");

		Log.log(Log.LOG_DEBUG, "JavaTest011::JavaTest011() [end]");

	}

}