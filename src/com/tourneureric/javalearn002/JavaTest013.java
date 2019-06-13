package com.tourneureric.javalearn002;

import java.util.Scanner;

public class JavaTest013 {

	Scanner sc;

	private void doit() {

		Log.log(Log.LOG_DEBUG, "JavaTestTemplate::doit() [begin]");

		Log.log(Log.LOG_DEBUG, "JavaTestTemplate::doit() [end]");

	}

	public void main() {

		Log.log(Log.LOG_DEBUG, "JavaTestTemplate::main() [begin]");

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

			Log.log(Log.LOG_DEBUG, "JavaTestTemplate::main() [end]");

		}

	}

	public JavaTest013 () {

		Log.log(Log.LOG_DEBUG, "JavaTestTemplate::JavaTestTemplate() [begin]");

		Log.log(Log.LOG_DEBUG, "JavaTestTemplate::JavaTestTemplate() [end]");

	}

}
