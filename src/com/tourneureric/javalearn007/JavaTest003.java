package com.tourneureric.javalearn007;

import java.util.Scanner;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream; 
import java.io.IOException;

public class JavaTest003 {

	Scanner sc;

	private void doit() {

		Log.log(Log.LOG_DEBUG, this.getClass().getSimpleName() + "::doit() [begin]");

		FileInputStream fis = null;
		BufferedInputStream bis = null;

		try {
			fis = new FileInputStream(new File("test.txt"));
			bis = new BufferedInputStream(new FileInputStream(new File("test.txt")));
			byte[] buf = new byte[8];

			//On récupère le temps du système
			long startTime = System.currentTimeMillis();
			//Inutile d'effectuer des traitements dans notre boucle
			while(fis.read(buf) != -1);
			//On affiche le temps d'exécution
			System.out.println("Temps de lecture avec FileInputStream : " + (System.currentTimeMillis() - startTime));

			//On réinitialise                
			startTime = System.currentTimeMillis();
			//Inutile d'effectuer des traitements dans notre boucle
			while(bis.read(buf) != -1);
			//On réaffiche
			System.out.println("Temps de lecture avec BufferedInputStream : " + (System.currentTimeMillis() - startTime));

			//On ferme nos flux de données
			fis.close();
			bis.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
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

					P.println("Voulez-vous continuer (o/n) ?");
					again = sc.nextLine();

				} while (again.equalsIgnoreCase("o"));

				P.println("Fin");
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
