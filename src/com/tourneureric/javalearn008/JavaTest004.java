package com.tourneureric.javalearn008;

import java.util.Scanner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.*;

public class JavaTest004 {

	Scanner sc;

	private void doit() {

		Log.log(Log.LOG_DEBUG, this.getClass().getSimpleName() + "::doit() [begin]");

		P.println("================================================================================");

		List<Personne> lPersonne = Arrays.asList(
				new Personne(10, "toto"),
				new Personne(20, "titi"),
				new Personne(30, "tata"),
				new Personne(40, "tutu")
				);

		Function<Personne, String> f1 = (Personne p) -> p.getNom();
		Function<Personne, Integer> f2 = (Personne p) -> p.getAge() * 2;
		Function<Integer, Integer> f3 = (Integer a) -> a + 1;

		P.println(transformToListString(lPersonne, f1));
		P.println(transformToListInt(lPersonne, f2));
		P.println(transformToListInt(lPersonne, f2.andThen(f3)));

		P.println("================================================================================");

		for (int i = 0; i < lPersonne.size(); i++) {
			P.print(lPersonne.get(i).getNom() + " " + lPersonne.get(i).getAge() + ", "); 
		}
		P.println("");

		P.println("================================================================================");

		Predicate<Personne> mypredicate = (Personne p) -> p.getAge() >= 18;
		for (Personne p : lPersonne) {
			if(mypredicate.test(p))
				P.println(p.getNom() + "(" + p.getAge() + " ans) a l'âge requis !");
		}

		P.println("================================================================================");

		Supplier<String> s1 = () -> new String("hello !");
		P.println(s1.get());
		Supplier<Personne> s2 = () -> new Personne(50, "Dédé");
		P.println(s2.get());

		Log.log(Log.LOG_DEBUG, this.getClass().getSimpleName() + "::doit() [end]");

	}

	public static List<String> transformToListString(List<Personne> list, Function<Personne, String> func){
		List<String> ls = new ArrayList<>();
		for (Personne p : list) {
			ls.add(func.apply(p));
			//func.apply(p) retournera ici le nom de l'objet Personne
		}
		return ls;		
	}

	public static List<Integer> transformToListInt(List<Personne> list, Function<Personne, Integer> func){
		List<Integer> ls = new ArrayList<>();
		for (Personne p : list) {
			ls.add(func.apply(p));
			//func.apply(p) retournera ici l'âge multiplié par 2 de l'objet Personne
		}
		return ls;		
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

	public JavaTest004 () {

		Log.log(Log.LOG_DEBUG, this.getClass().getSimpleName() + "::" + this.getClass().getSimpleName() + "[begin]");

		Log.log(Log.LOG_DEBUG, this.getClass().getSimpleName() + "::" + this.getClass().getSimpleName() + "[end]");

	}

}
