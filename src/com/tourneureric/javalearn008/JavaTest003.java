package com.tourneureric.javalearn008;

import java.util.Scanner;

public class JavaTest003 {

	Scanner sc;

	private void doit() {

		Log.log(Log.LOG_DEBUG, this.getClass().getSimpleName() + "::doit() [begin]");

		P.println("================================================================================");

		Dialoguer d1 = new Dialoguer() {
			public Integer parler(String question) {
				P.println("Tu as dis : " + question);	
				return 1;
			}
		};
		Integer i1 = d1.parler("Bonjour");
		P.println("i1 = " + i1);
		
		P.println("================================================================================");

		Dialoguer d2 = (s) -> { P.println("Tu as dis : " + s); return 2; };
		Integer i2 = d2.parler("Bonjour");
		P.println("i2 = " + i2);

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

	public JavaTest003 () {

		Log.log(Log.LOG_DEBUG, this.getClass().getSimpleName() + "::" + this.getClass().getSimpleName() + "[begin]");

		Log.log(Log.LOG_DEBUG, this.getClass().getSimpleName() + "::" + this.getClass().getSimpleName() + "[end]");

	}

}
