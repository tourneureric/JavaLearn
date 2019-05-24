
package com.tourneureric.javalearn001;

import java.util.Scanner;

public class JavaTest007 {

	public JavaTest007 () {

		Log.log(Log.LOG_DEBUG, this.getClass().getName() + "::" + this.getClass().getName() + "()");

	}

	public void main() {

		Log.log(Log.LOG_DEBUG, this.getClass().getName() + "::main() [begin]");

		if (JavaLearn.JL_RUN) {

			try {

				String again = "n";
				String mode = "0";
				boolean modeOk = false;
				boolean tempSourceOk = false;
				double tempSource = 0;
				double tempDest = 0;
				String tempSourceType = "";
				String tempDestType = "";

				Scanner sc = new Scanner(System.in);

				do {

					System.out.println("CONVERTISSEUR DEGRES CELSIUS ET DEGRES FAHRENHEIT");
					System.out.println("-------------------------------------------------");
					System.out.println("Choisissez le mode de conversion :");
					System.out.println("1 - Convertisseur Celsius vers Fahrenheit");
					System.out.println("2 - Convertisseur Fahrenheit vers Celsius");

					do {

						mode = sc.nextLine();
						Log.log(Log.LOG_TRACE, this.getClass().getName() + "::main() mode = " + mode);

						switch (mode) {
						case "1" :
							// Celsius -> Fahrenheit
							Log.log(Log.LOG_DEBUG, this.getClass().getName() + "::main() mode 1");
							tempSourceType = "°C";
							tempDestType = "°F";
							modeOk = true;
							break;
						case "2" :
							// Fahrenheit -> Celsius
							Log.log(Log.LOG_DEBUG, this.getClass().getName() + "::main() mode 2");
							tempSourceType = "°F";
							tempDestType = "°C";
							modeOk = true;
							break;
						default :
							Log.log(Log.LOG_DEBUG, this.getClass().getName() + "::main() mode default");
							modeOk = false;
							System.out.println("ATTENTION: vous devez choisir 1 ou 2");
							break;
						}

					} while (!modeOk);

					System.out.println("Température à convertir :");
					tempSourceOk = false;
					do {
						try {
							tempSource = sc.nextDouble();
							tempSourceOk = true;
						} catch (Exception e) {
							Log.log(Log.LOG_DEBUG, this.getClass().getName() + "::main() ERROR sc.nextDouble() Exception");
							Log.error("erreur de saisie, le format autorisé est : n[,m]");
						}
						sc.nextLine();
					} while (!tempSourceOk);
					Log.log(Log.LOG_TRACE, this.getClass().getName() + "::main() tempSource = " + tempSource);

					switch (mode) {
					case "1" :
						// Celsius -> Fahrenheit
						Log.log(Log.LOG_DEBUG, this.getClass().getName() + "::main() mode 1");
						tempDest = round((tempSource * (9.0 / 5.0)) + 32, 1);
						Log.log(Log.LOG_TRACE, this.getClass().getName() + "::main() tempDest = " + tempDest);
						System.out.println(tempSource + " " + tempSourceType + " correspond à : " + tempDest  + " " + tempDestType);
						break;
					case "2" :
						// Fahrenheit -> Celsius
						Log.log(Log.LOG_DEBUG, this.getClass().getName() + "::main() mode 2");
						tempDest = round((tempSource - 32) * (5.0 / 9.0), 1);
						Log.log(Log.LOG_TRACE, this.getClass().getName() + "::main() tempDest = " + tempDest);
						System.out.println(tempSource + " " + tempSourceType + " correspond à : " + tempDest + " " + tempDestType);
						break;
					default :
						Log.log(Log.LOG_DEBUG, this.getClass().getName() + "::main() mode default");
						System.out.println("ERREUR: erreur interne");
						break;
					}

					System.out.println("");
					System.out.println("Voulez-vous continuer (o/n) ?");
					again = sc.nextLine();

					System.out.println("");

				} while (again.equalsIgnoreCase("o"));

				sc.close();

			} catch (Exception e) { Log.error("in main()"); throw e; }

			Log.log(Log.LOG_DEBUG, this.getClass().getName() + "::main() [end]");

		}

	}

	public static double round(double A, int B) {
		return (double) ((int) (A * Math.pow(10, B) + .5)) / Math.pow(10, B);
	}
}
