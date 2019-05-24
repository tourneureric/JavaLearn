
import java.util.Scanner;

public class JavaTest008 {

	Scanner sc;

	public JavaTest008 () {

		Log.log(Log.LOG_DEBUG, this.getClass().getName() + "::" + this.getClass().getName() + "()");

	}

	public void main() {

		Log.log(Log.LOG_DEBUG, this.getClass().getName() + "::main() [begin]");

		if (JavaLearn.JL_RUN) {

			try {

				String again = "n";

				sc = new Scanner(System.in);

				do {

					doit();

					P.print("Voulez-vous continuer (o/n) ?");
					again = sc.nextLine();

				} while (again.equalsIgnoreCase("o"));

				sc.close();

			} catch (Exception e) { Log.error("in main()"); throw e; }

			Log.log(Log.LOG_DEBUG, this.getClass().getName() + "::main() [end]");

		}

	}

	private void doit() {

		Log.log(Log.LOG_DEBUG, this.getClass().getName() + "::doit() [begin]");

		P.print("================================================================================");

		int myTab001[][] = { {0, 2, 4, 6, 8},{1, 3,5 ,7, 9} };

		for (int i = 0; i < myTab001.length; i++) {
			for (int j = 0; j < myTab001[i].length; j++) {
				P.print("myTab001[" + i + "][" + j + "] = " + myTab001[i][j]);
			}
		}

		P.print("================================================================================");

		String myTab002[][][] =
			{
					{
						{"a", "b"},
						{"c", "d", "e"}
					},
					{
						{"f", "g"},
						{"h", "i", "j", "k"}
					},
					{
						{"l"},
						{"m", "n", "o", "p", "q"},
						{"r", "s"}
					},
					{
						{"t", "u", "v", "w"},
						{"x", "y", "z"}
					}
			};

		int i3 = 0;
		for (String myUtTab[][] : myTab002) {
			i3++;
			int j3 = 0;
			for (String myUtUtTab[] : myUtTab) {
				j3++;
				int k3 = 0;
				for (String myValue : myUtUtTab) {
					k3++;
					P.print("myTab002[" + i3 + "][" + j3 + "][" + k3 + "] = " + myValue);
				}
			}
		}
		
		P.print("================================================================================");

		for (int i5 = 0; i5 < myTab002.length; i5++) {
			for (int j5 = 0; j5 < myTab002[i5].length; j5++) {
				for (int k5 = 0; k5 < myTab002[i5][j5].length; k5++) {
					P.print("myTab002[" + i5 + "][" + j5 + "][" + k5 + "] = " + myTab002[i5][j5][k5]);
				}
			}
		}

		P.print("================================================================================");

		char tableauCaractere[] = {'a', 'b', 'c', 'd', 'e', 'f', 'g'};
		int i = 0;
		char carac = ' ';

		P.print("Rentrez une lettre en minuscule, SVP ");

		carac = sc.nextLine().charAt(0);

		while (i < tableauCaractere.length && carac != tableauCaractere[i]) { i++; }


		if (i < tableauCaractere.length) {
			P.print(" La lettre " + carac + " se trouve bien dans le tableau (position " + i + ") !");
		} else {
			P.print(" La lettre " + carac + " ne se trouve pas dans le tableau !");
		}

		P.print("================================================================================");

		String tab[][]={{"toto", "titi", "tutu", "tete", "tata"}, {"1", "2", "3", "4"}};
		int i1 = 0, j1 = 0;

		for(String sousTab[] : tab)
		{
			i1 = 0;
			for(String str : sousTab)
			{     
				System.out.println("La valeur de la nouvelle boucle est  : " + str);
				System.out.println("La valeur du tableau à l'indice ["+j1+"]["+i1+"] est : " + tab[j1][i1]);
				i1++;
			}
			j1++;
		}

		P.print("================================================================================");

		Log.log(Log.LOG_DEBUG, this.getClass().getName() + "::doit() [end]");

	}

}
