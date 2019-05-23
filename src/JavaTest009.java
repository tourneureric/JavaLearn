
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
					P.print("");

				} while (again.equalsIgnoreCase("o"));

				sc.close();

			} catch (Exception e) { Log.error("in main()"); throw e; }

			Log.log(Log.LOG_DEBUG, this.getClass().getName() + "::main() [end]");

		}

	}

	private void doit() {

		Log.log(Log.LOG_DEBUG, this.getClass().getName() + "::doit() [begin]");

		Log.log(Log.LOG_DEBUG, this.getClass().getName() + "::doit() [end]");

	}

}
