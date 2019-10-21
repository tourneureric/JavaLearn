package com.tourneureric.javalearn007;

import java.util.Scanner;

import java.io.CharArrayReader;
import java.io.CharArrayWriter;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.IOException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;

public class JavaTest007 {

	Scanner sc;

	private void doit() {

		Log.log(Log.LOG_DEBUG, this.getClass().getSimpleName() + "::doit() [begin]");

		CharArrayWriter caw = new CharArrayWriter();
		CharArrayReader car;

		try {
			caw.write("Coucou les Zéros");
			//Appel à la méthode toString de notre objet de manière tacite
			System.out.println(caw);

			//caw.close() n'a aucun effet sur le flux
			//Seul caw.reset() peut tout effacer
			caw.close();

			//On passe un tableau de caractères à l'objet qui va lire le tampon
			car = new CharArrayReader(caw.toCharArray());
			int i;
			//On remet tous les caractères lus dans un String
			String str = "";
			while(( i = car.read()) != -1)
				str += (char) i;

			System.out.println(str);

		} catch (IOException e) {
			e.printStackTrace();
		}

		StringWriter sw = new StringWriter();
		StringReader sr;

		try {
			sw.write("Coucou les Zéros");
			//Appel à la méthode toString de notre objet de manière tacite
			System.out.println(sw);

			//caw.close() n'a aucun effet sur le flux
			//Seul caw.reset() peut tout effacer
			sw.close();

			//On passe un tableau de caractères à l'objet qui va lire le tampon
			sr = new StringReader(sw.toString());			
			int i ;
			//On remet tous les caractères lus dans un String
			String str = "";
			while(( i = sr.read()) != -1)
				str += (char) i;

			System.out.println(str);

		} catch (IOException e) {
			e.printStackTrace();
		}

		File file = new File("testFileWriter.txt");
		FileWriter fw;
		FileReader fr;

		try {
			//Création de l'objet
			fw = new FileWriter(file);
			String str = "Bonjour à tous, amis Zéros !\n";
			str += "\tComment allez-vous ? \n";
			//On écrit la chaîne
			fw.write(str);
			//On ferme le flux
			fw.close();

			//Création de l'objet de lecture
			fr = new FileReader(file);
			str = "";
			int i = 0;
			//Lecture des données
			while((i = fr.read()) != -1)
				str += (char)i;

			//Affichage
			System.out.println(str);

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

	public JavaTest007 () {

		Log.log(Log.LOG_DEBUG, this.getClass().getSimpleName() + "::" + this.getClass().getSimpleName() + "[begin]");

		Log.log(Log.LOG_DEBUG, this.getClass().getSimpleName() + "::" + this.getClass().getSimpleName() + "[end]");

	}

}
