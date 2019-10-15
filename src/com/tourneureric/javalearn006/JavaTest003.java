package com.tourneureric.javalearn006;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JavaTest003 {

	Scanner sc;

	private void doit() {

		Log.log(Log.LOG_DEBUG, this.getClass().getSimpleName() + "::doit() [begin]");

		//Liste de voiture
		List<Voiture> listVoiture = new ArrayList<Voiture>();
		listVoiture.add(new Voiture("Renault", "Captur", 20000));
		listVoiture.add(new Voiture("Peugeot", "2008", 21000));

		List<VoitureSansPermis> listVoitureSP = new ArrayList<VoitureSansPermis>();
		listVoitureSP.add(new VoitureSansPermis("Honda", "KK", 5000, 80));
		listVoitureSP.add(new VoitureSansPermis("Fiat", "FF", 6000, 90));

		affiche(listVoiture);
		affiche(listVoitureSP);

		//Liste de voiture
		List<Voiture> listVoiture2 = new ArrayList<Voiture>();
		listVoiture2.add(new Voiture());
		listVoiture2.add(new Voiture());

		List<Object> listVoitureSP2 = new ArrayList<Object>();
		listVoitureSP2.add(new Object());
		listVoitureSP2.add(new Object());

		affiche2(listVoiture2);

		List<Voiture> listVoiture3 = new ArrayList<Voiture>();
		listVoiture3.add(new Voiture("Renault", "Captur", 20000));

		List<VoitureSansPermis> listVoitureSP3 = new ArrayList<VoitureSansPermis>();
		listVoitureSP3.add(new VoitureSansPermis("Honda", "KK", 5000, 80));

		Garage garage = new Garage();
		garage.add(listVoiture3);
		System.out.println("--------------------------");
		garage.add(listVoitureSP3);	

		Log.log(Log.LOG_DEBUG, this.getClass().getSimpleName() + "::doit() [end]");

	}

	static void affiche(List<? extends Voiture> list){

		for(Voiture v : list)
			System.out.println(v.toString());

	}

	static void affiche2(List<? super Voiture> list){

		for(Object v : list)
			System.out.println(v.toString());

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

	public JavaTest003 () {

		Log.log(Log.LOG_DEBUG, this.getClass().getSimpleName() + "::" + this.getClass().getSimpleName() + "[begin]");

		Log.log(Log.LOG_DEBUG, this.getClass().getSimpleName() + "::" + this.getClass().getSimpleName() + "[end]");

	}

}
