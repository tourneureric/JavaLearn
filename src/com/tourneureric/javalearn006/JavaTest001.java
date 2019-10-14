package com.tourneureric.javalearn006;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class JavaTest001 {

	Scanner sc;

	private void doit() {

		Log.log(Log.LOG_DEBUG, this.getClass().getSimpleName() + "::doit() [begin]");

		List l = new LinkedList();
		l.add(12);
		l.add("toto ! !");
		l.add(12.20f);

		Log.log(Log.LOG_TRACE, "l.size() = " + l.size());

		for (int i = 0; i < l.size(); i++) {
			P.print("Élément à l'index " + i + " = " + l.get(i));
		}

		P.print("\n \tParcours avec un itérateur ");
		P.print("-----------------------------------");

		ListIterator li = l.listIterator();
		while (li.hasNext()) {
			P.print(li.next());
		}

		ArrayList al = new ArrayList();
		al.add(12);
		al.add("Une chaîne de caractères !");
		al.add(12.20f);
		al.add('d');

		for(int i = 0; i < al.size(); i++)
		{
			P.print("donnée à l'indice " + i + " = " + al.get(i));
		}

		Hashtable ht = new Hashtable();
		ht.put(1, "printemps");
		ht.put(10, "été");
		ht.put(12, "automne");
		ht.put(45, "hiver");

		Enumeration e = ht.elements();

		while(e.hasMoreElements())
			P.print(e.nextElement());
				
	    HashSet hs = new HashSet();
	    hs.add("toto");
	    hs.add(12);
	    hs.add('d');
	    
	    Iterator it = hs.iterator();
	    while(it.hasNext())
	      System.out.println(it.next());	    

	    System.out.println("\nParcours avec un tableau d'objet");
	    System.out.println("-----------------------------------");
	                
	    Object[] obj = hs.toArray();
	    for (Object o : obj)
	      System.out.println(o); 

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
