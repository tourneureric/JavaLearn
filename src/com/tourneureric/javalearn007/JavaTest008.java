package com.tourneureric.javalearn007;

import java.util.Scanner;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.channels.FileChannel;

public class JavaTest008 {

	Scanner sc;

	private void doit() {

		Log.log(Log.LOG_DEBUG, this.getClass().getSimpleName() + "::doit() [begin]");

		FileInputStream fis;
		BufferedInputStream bis;
		FileChannel fc;

		try {
			//Création des objets
			fis = new FileInputStream(new File("test.txt"));
			bis = new BufferedInputStream(fis);
			//Démarrage du chrono
			long time = System.currentTimeMillis();
			//Lecture
			while(bis.read() != -1);
			//Temps d'exécution
			System.out.println("Temps d'exécution avec un buffer conventionnel : " + (System.currentTimeMillis() - time));

			//Création d'un nouveau flux de fichier
			fis = new FileInputStream(new File("test.txt"));
			//On récupère le canal
			fc = fis.getChannel();
			//On en déduit la taille
			int size = (int)fc.size();
			//On crée un buffer correspondant à la taille du fichier
			ByteBuffer bBuff = ByteBuffer.allocate(size);

			//Démarrage du chrono
			time = System.currentTimeMillis();
			//Démarrage de la lecture
			fc.read(bBuff);
			//On prépare à la lecture avec l'appel à flip
			bBuff.flip();
			//Affichage du temps d'exécution
			System.out.println("Temps d'exécution avec un nouveau buffer : " + (System.currentTimeMillis() - time));

			//Puisque nous avons utilisé un buffer de byte afin de récupérer les données
			//Nous pouvons utiliser un tableau de byte
			//La méthode array retourne un tableau de byte
			byte[] tabByte = bBuff.array();

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

	public JavaTest008 () {

		Log.log(Log.LOG_DEBUG, this.getClass().getSimpleName() + "::" + this.getClass().getSimpleName() + "[begin]");

		Log.log(Log.LOG_DEBUG, this.getClass().getSimpleName() + "::" + this.getClass().getSimpleName() + "[end]");

	}

}
