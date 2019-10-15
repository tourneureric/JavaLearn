package com.tourneureric.javalearn006;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JavaTest002 {

	Scanner sc;

	private void doit() {

		Log.log(Log.LOG_DEBUG, this.getClass().getSimpleName() + "::doit() [begin]");

		Solo<Integer> solo1 = new Solo<Integer>((int) 12.3);
		Integer nbre = solo1.getValeur();
		P.print("nbre = " + nbre);

		Solo<String> solo2 = new Solo<String>("Douze");
		String texte = solo2.getValeur();
		P.print("texte = " + texte);

		Solo<Integer> solo11 = new Solo<Integer>();
		Solo<String> solo12 = new Solo<String>("TOTOTOTO");
		Solo<Float> solo13 = new Solo<Float>(12.2f);
		Solo<Double> solo14 = new Solo<Double>(12.202568);

		P.print("solo11 = " + solo11.getValeur());
		P.print("solo12 = " + solo12.getValeur());
		P.print("solo13 = " + solo13.getValeur());
		P.print("solo14 = " + solo14.getValeur());

		Duo<String, Boolean> dual1 = new Duo<String, Boolean>("toto", true);
		System.out.println("Valeur de l'objet dual1 : val1 = " + dual1.getValeur1() + ", val2 = " + dual1.getValeur2());

		Duo<Double, Character> dual2 = new Duo<Double, Character>(12.2585, 'C');
		System.out.println("Valeur de l'objet dual2 : val1 = " + dual2.getValeur1() + ", val2 = " + dual2.getValeur2());

		System.out.println("Liste de String");
		System.out.println("------------------------------");
		List<String> listeString = new ArrayList<String>();
		listeString.add("Une chaîne");
		listeString.add("Une autre");
		listeString.add("Encore une autre");
		listeString.add("Allez, une dernière");
		
		for (String str : listeString) {
			P.print(str);
		}

		System.out.println("\nListe de float");
		System.out.println("------------------------------");

		List<Float> listeFloat = new ArrayList<Float>();
		listeFloat.add(12.25f);
		listeFloat.add(15.25f);
		listeFloat.add(2.25f);
		listeFloat.add(128764.25f);

		for (float f : listeFloat)
			System.out.println(f);
		
		System.out.println("\nListe d'objets");
		System.out.println("------------------------------");
		
		List<Object> listeObject = new ArrayList<Object>();
		listeObject.addAll(listeString);
		listeObject.addAll(listeFloat);
		
		for ( Object obj : listeObject) {
			System.out.println(obj);
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
