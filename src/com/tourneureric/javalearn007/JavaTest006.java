package com.tourneureric.javalearn007;

import java.util.Scanner;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class JavaTest006 {

	Scanner sc;

	private void doit() {

		Log.log(Log.LOG_DEBUG, this.getClass().getSimpleName() + "::doit() [begin]");

		ObjectInputStream ois;
		ObjectOutputStream oos;

		try {

			oos = new ObjectOutputStream(
					new BufferedOutputStream(
							new FileOutputStream(
									new File("game.txt"))));

			oos.writeObject(new Game("Assassin Creed", "Aventure", 45.69));
			oos.writeObject(new Game("Tomb Raider", "Plateforme", 23.45));
			oos.writeObject(new Game("Tetris", "Stratégie", 2.50));
			oos.close();

			ois = new ObjectInputStream(
					new BufferedInputStream(
							new FileInputStream(
									new File("game.txt"))));

			try {
				System.out.println("Affichage des jeux :");
				System.out.println("*************************\n");
				System.out.println(((Game)ois.readObject()).toString());
				System.out.println(((Game)ois.readObject()).toString());
				System.out.println(((Game)ois.readObject()).toString());
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}

			ois.close();

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

	public JavaTest006 () {

		Log.log(Log.LOG_DEBUG, this.getClass().getSimpleName() + "::" + this.getClass().getSimpleName() + "[begin]");

		Log.log(Log.LOG_DEBUG, this.getClass().getSimpleName() + "::" + this.getClass().getSimpleName() + "[end]");

	}

}
