package com.tourneureric.javalearn002;

import java.util.Scanner;

public class JavaTest015 {

	Scanner sc;

	private void doit() {

		Log.log(Log.LOG_DEBUG, "JavaTest015::doit() [begin]");

		Chien c = new Chien("Gris bleuté", 20);

		P.print("--------------------------------------------");

		//Les méthodes d'un chien 
		c.boire();
		c.manger();
		c.deplacement();
		c.crier();
		P.print(c.toString());

		P.print("--------------------------------------------");

		//Les méthodes de l'interface
		c.faireCalin();
		c.faireLeBeau();
		c.faireLechouille();

		P.print("--------------------------------------------");

		//Utilisons le polymorphisme de notre interface
		Rintintin r = new Chien();
		r.faireLeBeau();
		r.faireCalin();
		r.faireLechouille();

		P.print("--------------------------------------------");


		Log.log(Log.LOG_DEBUG, "JavaTest015::doit() [end]");

	}

	public void main() {

		Log.log(Log.LOG_DEBUG, "JavaTest015::main() [begin]");

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

			Log.log(Log.LOG_DEBUG, "JavaTest015::main() [end]");

		}

	}

	public JavaTest015 () {

		Log.log(Log.LOG_DEBUG, "JavaTest015::JavaTest015() [begin]");
		
		P.print("JavaTest015 : instanciation");

		Log.log(Log.LOG_DEBUG, "JavaTest015::JavaTest015() [end]");

	}

}
