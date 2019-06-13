package com.tourneureric.javalearn002;

import java.util.Scanner;

public class JavaTest013 {

	Scanner sc;
	
	Chat chat1;
	Chien chien1;
	Lion lion1;
	Loup loup1;
	Tigre tigre1;

	private void doit() {

		Log.log(Log.LOG_DEBUG, "JavaTest013::doit() [begin]");
		
		Chat chat1 = new Chat();

		chat1.deplacement();
		chat1.crier();
		chat1.manger();
		chat1.boire();
		
		chien1 = new Chien();

		chien1.deplacement();
		chien1.crier();
		chien1.manger();
		chien1.boire();
		
		lion1 = new Lion();

		lion1.deplacement();
		lion1.crier();
		lion1.manger();
		lion1.boire();

		loup1 = new Loup();

		loup1.deplacement();
		loup1.crier();
		loup1.manger();
		loup1.boire();

		tigre1 = new Tigre();

		tigre1.deplacement();
		tigre1.crier();
		tigre1.manger();
		tigre1.boire();

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
