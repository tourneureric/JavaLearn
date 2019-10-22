package com.tourneureric.javalearn008;

import java.lang.reflect.*;
import java.util.Scanner;

public class JavaTest002 {

	Scanner sc;

	private void doit() {

		Log.log(Log.LOG_DEBUG, this.getClass().getSimpleName() + "::doit() [begin]");

		String nom = Paire.class.getName();
		try {
			//On crée un objet Class
			Class cl = Class.forName(nom);
			//Nouvelle instance de la classe Paire
			Object o = cl.newInstance();

			//On crée les paramètres du constructeur
			Class[] types = new Class[]{String.class, String.class};
			//On récupère le constructeur avec les deux paramètres
			Constructor ct = cl.getConstructor(types);      
			//On instancie l'objet avec le constructeur surchargé !
			Object o2 = ct.newInstance(new String[]{"valeur 1 ", "valeur 2"} );

			//On va chercher la méthode toString, elle n'a aucun paramètre
			Method m = cl.getMethod("toString", null);
			//La méthode invoke exécute la méthode sur l'objet passé en paramètre
			//Pas de paramètre, donc null en deuxième paramètre de la méthode invoke !

			System.out.println("----------------------------------------");
			System.out.println("Méthode " + m.getName() + " sur o2: " +m.invoke(o2, null));
			System.out.println("Méthode " + m.getName() + " sur o: " +m.invoke(o, null));

		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
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

					P.print("Voulez-vous continuer (o/n) ?");
					again = sc.nextLine();

				} while (again.equalsIgnoreCase("o"));

				P.print("Fin");
				sc.close();

			} catch (Exception e) { Log.error("in main()"); throw e; }

			Log.log(Log.LOG_DEBUG, this.getClass().getSimpleName() + "::main() [end]");

		}

	}

	public JavaTest002 () {

		Log.log(Log.LOG_DEBUG, this.getClass().getSimpleName() + "::" + this.getClass().getSimpleName() + "[begin]");

		Log.log(Log.LOG_DEBUG, this.getClass().getSimpleName() + "::" + this.getClass().getSimpleName() + "[end]");

	}

}
