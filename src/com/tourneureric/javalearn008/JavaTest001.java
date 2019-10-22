package com.tourneureric.javalearn008;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Scanner;

public class JavaTest001 {

	Scanner sc;

	private void doit() {

		Log.log(Log.LOG_DEBUG, this.getClass().getSimpleName() + "::doit() [begin]");

		if ( false  ) {

			P.print("================================================================================");

			Class c1 = String.class;
			Class c2 = new String().getClass();

		}

		if ( false  ) {

			P.print("================================================================================");

			P.print("La superclasse de la classe " + String.class.getName() + " est : " + String.class.getSuperclass());
			P.print("La superclasse de la classe " + Object.class.getName() + " est : " + Object.class.getSuperclass());

		}

		if ( false  ) {

			P.print("================================================================================");

			Class c3 = new String().getClass();
			Class[] faces = c3.getInterfaces();
			System.out.println("Il y a " + faces.length + " interfaces implémentées");
			for(int i = 0; i < faces.length; i++)
				System.out.println(faces[i]);

		}

		if ( false  ) {

			P.print("================================================================================");

			Class c4 = new String().getClass();
			Method[] m4 = c4.getMethods();
			System.out.println("Il y a " + m4.length + " méthodes dans cette classe");
			for(int i = 0; i < m4.length; i++)
				System.out.println(m4[i]);

		}

		if ( false  ) {

			P.print("================================================================================");

			Class c5 = new String().getClass();
			Method[] m5 = c5.getMethods();
			System.out.println("Il y a " + m5.length + " méthodes dans cette classe");
			for(int i = 0; i < m5.length; i++)
			{
				System.out.println(m5[i]);
				Class[] p = m5[i].getParameterTypes();
				for(int j = 0; j < p.length; j++)
					System.out.println(p[j].getName());
				System.out.println("----------------------------------\n");
			}
		}

		if ( false  ) {

			P.print("================================================================================");

			Class c6 = new String().getClass();
			Field[] m = c6.getDeclaredFields();
			System.out.println("Il y a " + m.length + " champs dans cette classe");
			for(int i = 0; i < m.length; i++)
				System.out.println(m[i].getName());

		}

		if ( true  ) {

			P.print("================================================================================");

			Class c7 = new String().getClass();
			Constructor[] construc = c7.getConstructors();   
			System.out.println("Il y a " + construc.length + " constructeurs dans cette classe");
			for(int i = 0; i < construc.length; i++){
				System.out.println(construc[i].getName());
				Class[] param = construc[i].getParameterTypes();                        
				for(int j = 0; j < param.length; j++)
					System.out.println(param[j]);
				System.out.println("-----------------------------\n");
			}

		}

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
