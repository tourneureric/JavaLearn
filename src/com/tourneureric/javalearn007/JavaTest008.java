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
			//Cr�ation des objets
			fis = new FileInputStream(new File("test.txt"));
			bis = new BufferedInputStream(fis);
			//D�marrage du chrono
			long time = System.currentTimeMillis();
			//Lecture
			while(bis.read() != -1);
			//Temps d'ex�cution
			System.out.println("Temps d'ex�cution avec un buffer conventionnel : " + (System.currentTimeMillis() - time));

			//Cr�ation d'un nouveau flux de fichier
			fis = new FileInputStream(new File("test.txt"));
			//On r�cup�re le canal
			fc = fis.getChannel();
			//On en d�duit la taille
			int size = (int)fc.size();
			//On cr�e un buffer correspondant � la taille du fichier
			ByteBuffer bBuff = ByteBuffer.allocate(size);

			//D�marrage du chrono
			time = System.currentTimeMillis();
			//D�marrage de la lecture
			fc.read(bBuff);
			//On pr�pare � la lecture avec l'appel � flip
			bBuff.flip();
			//Affichage du temps d'ex�cution
			System.out.println("Temps d'ex�cution avec un nouveau buffer : " + (System.currentTimeMillis() - time));

			//Puisque nous avons utilis� un buffer de byte afin de r�cup�rer les donn�es
			//Nous pouvons utiliser un tableau de byte
			//La m�thode array retourne un tableau de byte
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
