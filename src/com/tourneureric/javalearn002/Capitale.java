
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
				"monument='" + this.monument + "'" +
				", " + super.toString() +
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

		monument = "Aucun";
		
		Log.log(Log.LOG_DEBUG, "Capitale::Capitale() [end]");
	}
	
	/* ============================================================
		@Override private methods
	   ============================================================ */

	/* ============================================================
		Non @Override private methods
	   ============================================================ */

}
