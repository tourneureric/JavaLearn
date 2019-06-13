package com.tourneureric.javalearn002;

import java.util.Scanner;

public class JavaTest013 {

	Scanner sc;

	private void doit() {

		Log.log(Log.LOG_DEBUG, "JavaTest013::doit() [begin]");
		
		Object objLoup = new Loup();
		Loup loup = (Loup) objLoup;
		
		loup.deplacement();
		loup.crier();

		loup.manger();
		loup.boire();

		  Log.log(Log.LOG_DEBUG, "JavaTest013::doit() [end]");

	}

	public void main() {

		Log.log(Log.LOG_DEBUG, "JavaTest013::main() [begin]");

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

			Log.log(Log.LOG_DEBUG, "JavaTest013::main() [end]");

		}

	}

	public JavaTest013 () {

		Log.log(Log.LOG_DEBUG, "JavaTest013::JavaTest013() [begin]");

		Log.log(Log.LOG_DEBUG, "JavaTest013::JavaTest013() [end]");

	}

}
