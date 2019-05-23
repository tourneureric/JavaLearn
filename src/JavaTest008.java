
import java.util.Scanner;

public class JavaTest008 {

	public JavaTest008 () {

		Log.log(Log.LOG_DEBUG, this.getClass().getName() + "::" + this.getClass().getName() + "()");

	}

	public void main() {

		Log.log(Log.LOG_DEBUG, this.getClass().getName() + "::main() [begin]");

		if (JavaLearn.JL_RUN) {

			try {

				String again = "n";

				Scanner sc = new Scanner(System.in);

				do {

					doit();

					P.print("Voulez-vous continuer (o/n) ?");
					again = sc.nextLine();
					P.print("");

				} while (again.equalsIgnoreCase("o"));

				sc.close();

			} catch (Exception e) { Log.error("in main()"); throw e; }

			Log.log(Log.LOG_DEBUG, this.getClass().getName() + "::main() [end]");

		}

	}

	private void doit() {

		Log.log(Log.LOG_DEBUG, this.getClass().getName() + "::doit() [begin]");

		int myTab001[][] = { {0, 2, 4, 6, 8},{1, 3,5 ,7, 9} };

		for (int i = 0; i < myTab001.length; i++) {
			for (int j = 0; j < myTab001[i].length; j++) {
				P.print("myTab001[" + i + "][" + j + "] = " + myTab001[i][j]);
			}
		}

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

		for (int i = 0; i < myTab002.length; i++) {
			for (int j = 0; j < myTab002[i].length; j++) {
				for (int k = 0; k < myTab002[i][j].length; k++) {
					P.print("myTab002[" + i + "][" + j + "][" + k + "] = " + myTab002[i][j][k]);
				}
			}
		}

		Log.log(Log.LOG_DEBUG, this.getClass().getName() + "::doit() [end]");

	}

}
