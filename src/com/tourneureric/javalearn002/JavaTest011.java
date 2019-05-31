
package com.tourneureric.javalearn002;

import java.util.Scanner;

public class JavaTest011 {

	Scanner sc;

	private void doit() {

		Log.log(Log.LOG_DEBUG, "JavaTest011::doit() [begin]");
		
		Capitale cap = new Capitale();
		P.print(cap.toString()); 

		Log.log(Log.LOG_DEBUG, "JavaTest011::doit() [end]");

	}

	public void main() {

		Log.log(Log.LOG_DEBUG, "JavaTest011::main() [begin]");

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

			Log.log(Log.LOG_DEBUG, "JavaTest011::main() [end]");

		}

	}

	public JavaTest011 () {

		Log.log(Log.LOG_DEBUG, "JavaTest011::JavaTest011() [begin]");
		
		Log.log(Log.LOG_DEBUG, "JavaTest011::JavaTest011() [end]");
		
	}

}