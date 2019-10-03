package com.tourneureric.javalearn005;

import java.util.Scanner;

public class JavaTest003 {

	Scanner sc;

	private void doit() {

		Log.log(Log.LOG_DEBUG, "JavaTest003::doit() [begin]");

		Ville v = null;
		try {
			Log.log(Log.LOG_TRACE, "JavaTest003::doit() try");
			v = new Ville("Rennes", -12000, "France");
		} catch (NombreHabitantException e) {
			Log.log(Log.LOG_TRACE, "JavaTest003::doit() catch NombreHabitantException");
		}
		finally {
			Log.log(Log.LOG_TRACE, "JavaTest003::doit() finally");
			if (v == null) {
				v = new Ville();
			}
		}

		Log.log(Log.LOG_INFO, "JavaTest003::doit() "+ v.toString());

		Log.log(Log.LOG_DEBUG, "JavaTest003::doit() [end]");

	}

	public void main() {

		Log.log(Log.LOG_DEBUG, "JavaTest003::main() [begin]");

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

			Log.log(Log.LOG_DEBUG, "JavaTest003::main() [end]");

		}

	}

	public JavaTest003 () {

		Log.log(Log.LOG_DEBUG, "JavaTest003::JavaTest003() [begin]");

		Log.log(Log.LOG_DEBUG, "JavaTest003::JavaTest003() [end]");

	}

}