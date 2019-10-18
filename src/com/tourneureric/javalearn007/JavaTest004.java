package com.tourneureric.javalearn007;

import java.util.Scanner;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class JavaTest004 {

	Scanner sc;

	private void doit() {

		Log.log(Log.LOG_DEBUG, this.getClass().getSimpleName() + "::doit() [begin]");

		//Nous d�clarons nos objets en dehors du bloc try/catch
		FileInputStream fis;
		FileOutputStream fos;
		BufferedInputStream bis;
		BufferedOutputStream bos; 

		try {
			fis = new FileInputStream(new File("test.txt"));
			fos = new FileOutputStream(new File("test2.txt"));
			bis = new BufferedInputStream(new FileInputStream(new File("test.txt")));
			bos = new BufferedOutputStream(new FileOutputStream(new File("test3.txt")));
			byte[] buf = new byte[8];

			//On r�cup�re le temps du syst�me
			long startTime = System.currentTimeMillis();

			while(fis.read(buf) != -1){
				fos.write(buf);
			}
			//On affiche le temps d'ex�cution
			System.out.println("Temps de lecture + �criture avec FileInputStream et FileOutputStream : " + (System.currentTimeMillis() - startTime));

			//On r�initialise                
			startTime = System.currentTimeMillis();

			while(bis.read(buf) != -1){
				bos.write(buf);
			}
			//On r�affiche
			System.out.println("Temps de lecture + �criture avec BufferedInputStream et BufferedOutputStream : " + (System.currentTimeMillis() - startTime));

			//On ferme nos flux de donn�es
			fis.close();
			bis.close();
			fos.close();
			bos.close();

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

	public JavaTest004 () {

		Log.log(Log.LOG_DEBUG, this.getClass().getSimpleName() + "::" + this.getClass().getSimpleName() + "[begin]");

		Log.log(Log.LOG_DEBUG, this.getClass().getSimpleName() + "::" + this.getClass().getSimpleName() + "[end]");

	}

}
