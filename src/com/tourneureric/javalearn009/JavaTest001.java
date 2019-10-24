package com.tourneureric.javalearn009;

import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class JavaTest001 {

	Scanner sc;

	private void doit() {

		Log.log(Log.LOG_DEBUG, this.getClass().getSimpleName() + "::doit() [begin]");

		List<Personne> listP = Arrays.asList(
				new Personne(1.80, 70, "A", "Nicolas", Couleur.BLEU),
				new Personne(1.56, 50, "B", "Nicole", Couleur.VERRON),
				new Personne(1.75, 65, "C", "Germain", Couleur.VERT),
				new Personne(1.68, 50, "D", "Michel", Couleur.ROUGE),
				new Personne(1.96, 65, "E", "Cyrille", Couleur.BLEU),
				new Personne(2.10, 120, "F", "Denis", Couleur.ROUGE),
				new Personne(1.90, 90, "G", "Olivier", Couleur.VERRON)
				);

		P.printline();

		Stream<Personne> sp = listP.stream();
		sp.forEach(P::println);

		P.printline();

		Stream.iterate(2d, (x) -> x * 2).limit(10).forEach(System.out::println);

		P.printline();

		P.println("\nAprès le filtre");
		sp = listP.stream();
		sp.filter(x -> x.getPoids() > 50).forEach(P::println);

		P.printline();

		System.out.println("\nAprès le filtre et le map");
		sp = listP.stream();
		sp.	filter(x -> x.getPoids() > 50)
		.map(x -> "IMC = " + x.getPoids() / Math.pow(x.getTaille(), 2))
		.forEach(P::println);

		P.printline();

		P.println("\nAprès le filtre et le map et reduce");
		sp = listP.stream();

		Double sum = sp.filter(x -> x.getPoids() > 50)
				.map(x -> x.getPoids())
				.reduce(0.0d, (x,y) -> x+y);
		P.println(sum);

		P.printline();

		P.println("\nAprès le filtre et le map et reduce");
		sp = listP.stream();

		Optional<Double> sum2 = sp	.filter(x -> x.getPoids() > 250)
				.map(x -> x.getPoids())
				.reduce((x,y) -> x+y);
		if(sum2.isPresent())
			System.out.println(sum2.get());
		else
			System.out.println("Aucun aggrégat de poids...");

		P.printline();

		sp = listP.stream();

		long count = sp	.filter(x -> x.getPoids() > 50)
				.map(x -> x.getPoids())
				.count();

		System.out.println("Nombre d'éléments : " + count);

		P.printline();

		sp = listP.stream();

		List<Double> ld = sp.filter(x -> x.getPoids() > 50)
				.map(x -> x.getPoids())
				.collect(Collectors.toList());
		P.println(ld);

		P.printline();

		String fileName = "C://Temp/Test.txt";
		try (Stream<String> sf = Files.lines(Paths.get(fileName))) {
			sf.forEach(P::println);
		} catch(IOException e) {
			e.printStackTrace();
		}

		P.printline();

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

	public JavaTest001 () {

		Log.log(Log.LOG_DEBUG, this.getClass().getSimpleName() + "::" + this.getClass().getSimpleName() + "[begin]");

		Log.log(Log.LOG_DEBUG, this.getClass().getSimpleName() + "::" + this.getClass().getSimpleName() + "[end]");

	}

}
