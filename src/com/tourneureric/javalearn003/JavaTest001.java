package com.tourneureric.javalearn003;

import java.util.Scanner;

public class JavaTest001 {

	Scanner sc;

	private void doit() {

		Log.log(Log.LOG_DEBUG, this.getClass().getSimpleName() + "::doit() [begin]");

		Personnage[] tPers = {new Guerrier(), new Civil(), new Medecin()};

		P.print("#### TEST 001 ####");
		for(int i = 0; i < tPers.length; i++){
			P.print("\nInstance de " + tPers[i].getClass().getName());
			P.print("*****************************************");
			tPers[i].combattre();
			tPers[i].seDeplacer();
			tPers[i].soigner();
		}

		P.print("#### TEST 002 ####");
		Personnage pers = new Guerrier();
		pers.soigner();		
		pers.setSoin(new Operation());
		pers.soigner();

		Log.log(Log.LOG_DEBUG, this.getClass().getSimpleName() + "::doit() [end]");

	}

	public void main() {

		Log.log(Log.LOG_DEBUG, this.getClass().getSimpleName() + "::main() [begin]");

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

			Log.log(Log.LOG_DEBUG, this.getClass().getSimpleName() + "::main() [end]");

		}

	}

	public JavaTest001 () {

		Log.log(Log.LOG_DEBUG, this.getClass().getSimpleName() + "::" + this.getClass().getSimpleName() + "[begin]");

		P.print("JavaTest001 : instanciation");

		Log.log(Log.LOG_DEBUG, this.getClass().getSimpleName() + "::" + this.getClass().getSimpleName() + "[end]");

	}

}
