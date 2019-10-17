package com.tourneureric.javalearn007;

import java.util.Scanner;
import java.io.File;

public class JavaTest001 {

	Scanner sc;

	private void doit() {

		Log.log(Log.LOG_DEBUG, this.getClass().getSimpleName() + "::doit() [begin]");
		
		File f = new File("test.txt");
		P.print("Chemin absolu du fichier : " + f.getAbsolutePath());
		P.print("Nom du fichier : " + f.getName());
		P.print("Est-ce qu'il existe : " + f.exists());
		P.print("Est-ce un répertoire : " + f.isDirectory());
		P.print("Est-ce un fichier : " + f.isFile());
		
		P.print("Affichage des lecteurs à la racine de du PC :");
		for (File file : f.listRoots()) {
			P.print(file.getAbsolutePath());
			try {
				int i = 1;
				for (File nom : file.listFiles()) {
					P.print("\t\t" + ((nom.isDirectory() ? nom.getName()+"/" : nom.getName())));
					
					if (i%4 == 0) {
						P.print("");
					}
					i++;
				}
				P.print("");
			} catch (NullPointerException e) {
				
			}
		}

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

		Log.log(Log.LOG_DEBUG, this.getClass().getSimpleName() + "::" + this.getClass().getSimpleName() + "[end]");

	}

}
