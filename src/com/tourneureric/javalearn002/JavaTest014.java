package com.tourneureric.javalearn002;

import java.util.Scanner;

public class JavaTest014 {

	Scanner sc;

	private void doit() {

		Log.log(Log.LOG_DEBUG, "JavaTest014::doit() [begin]");

		I1 mI1 = new X();
		I2 mI2 = new X();

		mI1.A();
		mI1.B();
		mI2.C();
		mI2.D();

		Log.log(Log.LOG_DEBUG, "JavaTest014::doit() [end]");

	}

	public void main() {

		Log.log(Log.LOG_DEBUG, "JavaTest014::main() [begin]");

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

			Log.log(Log.LOG_DEBUG, "JavaTest014::main() [end]");

		}

	}

	public JavaTest014 () {

		Log.log(Log.LOG_DEBUG, "JavaTest014::JavaTest014() [begin]");

		Log.log(Log.LOG_DEBUG, "JavaTest014::JavaTest014() [end]");

	}

}
