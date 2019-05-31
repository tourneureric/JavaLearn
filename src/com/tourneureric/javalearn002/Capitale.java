
package com.tourneureric.javalearn002;

public class Capitale extends Ville {

	/* ============================================================
		Technical Constant variables
	   ============================================================ */

	/* ============================================================
		Functionnal Constant variables
	   ============================================================ */

	/* ============================================================
		Technical variables
	   ============================================================ */

	/* ============================================================
		Functionnal variables
	   ============================================================ */

	private String monument;

	/* ============================================================
		@Override public methods
	   ============================================================ */

	@Override
	public String toString() {
		Log.log(Log.LOG_DEBUG, "Capitale::toString() [begin]");

		String str = "Capitale{" +
				super.toString() +
				", monument='" + this.monument + "'" +
				'}';

		Log.log(Log.LOG_DEBUG, "Capitale::toString() [end]");

		return str;
	}
	/* ============================================================
		Non @Override public methods
	   ============================================================ */

	public Capitale() {
		super();
		Log.log(Log.LOG_DEBUG, "Capitale::Capitale() [begin]");

		Log.log(Log.LOG_TRACE, "Creéation d'une capitale !");
		monument = "Aucun";

		Log.log(Log.LOG_DEBUG, "Capitale::Capitale() [end]");
	}

	public Capitale(String pNom, int pNbre, String pPays, String pMonument) {
		super(pNom, pNbre, pPays);
		Log.log(Log.LOG_DEBUG, "Capitale::Capitale(String pNom, int pNbre, String pPays, String pMonument) [begin]");

		Log.log(Log.LOG_TRACE, "Creéation d'une capitale avec des paramètres !");
		monument = pMonument;

		Log.log(Log.LOG_DEBUG, "Capitale::Capitale(String pNom, int pNbre, String pPays, String pMonument) [end]");
	}

	public String getMonument() {
		return monument;
	}

	public void setMonument(String monument) {
		this.monument = monument;
	}

	/* ============================================================
		@Override private methods
	   ============================================================ */

	/* ============================================================
		Non @Override private methods
	   ============================================================ */

}
