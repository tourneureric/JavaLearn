package com.tourneureric.javalearn009;

import java.util.Scanner;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class JavaTest002 {

	Scanner sc;

	private void doit() {

		Log.log(Log.LOG_DEBUG, this.getClass().getSimpleName() + "::doit() [begin]");

		P.printline();

		LocalDateTime currentTime = LocalDateTime.now();
		P.println("Date et heure courante : " + currentTime);

		LocalDate date1 = currentTime.toLocalDate();
		P.println("Date courante : " + date1);

		Month mois = currentTime.getMonth();
		int jour = currentTime.getDayOfMonth();
		int heure = currentTime.getHour();

		P.println("Mois : " + mois + ", jour : " + jour + ", heure : " + heure);

		LocalDateTime date2 = currentTime.withDayOfMonth(25).withYear(2023).withMonth(12);
		P.println("Date modifiée : " + date2);

		LocalDate date3  = LocalDate.of(2023, Month.DECEMBER, 25);
		P.println("Autre façon de fauire : " + date3);

		LocalTime parsed = LocalTime.parse("20:15:30");
		P.println("Date parsée : " + parsed);

		P.printline();

		LocalDateTime ldt = LocalDateTime.of(2018, Month.DECEMBER, 25, 13, 17, 0);
		P.println("Date de référence : " + ldt);

		P.println("+1 semaine : " + ldt.plus(1, ChronoUnit.WEEKS));
		P.println("+2 mois : " + ldt.plus(2, ChronoUnit.MONTHS));
		P.println("+3 ans : " + ldt.plus(3, ChronoUnit.YEARS));
		P.println("+4 heures : " + ldt.plus(4, ChronoUnit.HOURS));
		P.println("-5 secondes : " + ldt.minus(5, ChronoUnit.SECONDS));
		P.println("-38 minutes : " + ldt.minusMinutes(38));

		P.printline();

		LocalDateTime ldt1 = LocalDateTime.of(2018, Month.DECEMBER, 25, 13, 37, 0);
		LocalDateTime ldt2 = ldt1.plus(3, ChronoUnit.YEARS);
		LocalDateTime ldt3 = ldt1.minusMinutes(1337);
		
		Period p = Period.between(ldt1.toLocalDate(), ldt2.toLocalDate());
		Duration d = Duration.between(ldt1.toLocalTime(), ldt3.toLocalTime());
		P.println("Période : " + p.getYears());
		P.println("Durée : " + d.getSeconds());
		P.println("Ecart en jour : " + ChronoUnit.DAYS.between(ldt1, ldt2));

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

	public JavaTest002 () {

		Log.log(Log.LOG_DEBUG, this.getClass().getSimpleName() + "::" + this.getClass().getSimpleName() + "[begin]");

		Log.log(Log.LOG_DEBUG, this.getClass().getSimpleName() + "::" + this.getClass().getSimpleName() + "[end]");

	}

}
