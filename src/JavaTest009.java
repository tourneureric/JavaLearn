
import java.util.Scanner;

public class JavaTest009 {

	Scanner sc;

	public JavaTest009 () {

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

		int tabInt[] = {0, 1, 2, 3, 4};
		String tabString[] = {"aaa", "bbb", "ccc"};

		P.print("================================================================================");

		for (int i = 0, j = 0; i < tabInt.length; i++, j+=2) {
			P.print(i + " " + j);
		}

		P.print("================================================================================");

		for (int i : tabInt) {
			P.print(String.valueOf(i));
		}

		P.print("================================================================================");
		
		int n = 0;
		for (String s : tabString) {
			P.print("tabString[" + n + "] = " + tabString[n] + " => s = " + s);
			n++;
		}

		P.print("================================================================================");

		Log.log(Log.LOG_DEBUG, this.getClass().getName() + "::doit() [end]");

	}

}
