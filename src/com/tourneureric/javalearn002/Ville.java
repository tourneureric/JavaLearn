
package com.tourneureric.javalearn002;

public class Ville {

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

	public static int nbreInstances = 0;
	private static int nbreInstancesBis = 0;

	private String nomVille;
	private String nomPays;
	private int nbreHabitants;
	private char categorie;

	/* ============================================================
	    @Override methods
	   ============================================================ */

	@Override
	public String toString() {
		Log.log(Log.LOG_DEBUG, this.getClass().getName() + "::toString() [begin]");
		
		String str = "Ville{" +
				"nomVille='" + nomVille + "'" +
				", nomPays='" + nomPays + "'" +
				", nbreHabitants=" + nbreHabitants +
				", categorie='" + categorie + "'" +
				'}';
		
		Log.log(Log.LOG_DEBUG, this.getClass().getName() + "::toString() [end]");
		
		return str;
	}

	/* ============================================================
    	Non @Override methods
   		============================================================ */

	public Ville() {
		Log.log(Log.LOG_DEBUG, this.getClass().getName() + "::Ville() [begin]");

		Log.log(Log.LOG_TRACE, "Creéation d'une ville !");
		nbreInstances++;
		nbreInstancesBis++;
		nomVille = "Inconnu";
		nomPays = "Inconnu";
		nbreHabitants = 0;
		this.setCategorie();
		
		Log.log(Log.LOG_DEBUG, this.getClass().getName() + "::Ville() [end]");
	}

	public Ville(String pNom, int pNbre, String pPays) {
		Log.log(Log.LOG_DEBUG, this.getClass().getName() + "::Ville(String pNom, int pNbre, String pPays) [begin]");

		Log.log(Log.LOG_TRACE, "Creéation d'une ville avec des paramètres !");
		nbreInstances++;
		nbreInstancesBis++;
		nomVille = pNom;
		nomPays = pPays;
		nbreHabitants = pNbre;
		this.setCategorie();
		
		Log.log(Log.LOG_DEBUG, this.getClass().getName() + "::Ville(String pNom, int pNbre, String pPays) [end]");
	}

	public String getNomVille() {
		return nomVille;
	}

	public void setNomVille(String nomVille) {
		this.nomVille = nomVille;
	}

	public String getNomPays() {
		return nomPays;
	}

	public void setNomPays(String nomPays) {
		this.nomPays = nomPays;
	}

	public int getNbreHabitants() {
		return nbreHabitants;
	}

	public void setNbreHabitants(int nbreHabitants) {
		this.nbreHabitants = nbreHabitants;
		this.setCategorie();
	}

	public char getCategorie() {
		return categorie;
	}

	public static int getNbreInstancesBis() {
		return nbreInstancesBis;
	}

	public static void setNbreInstancesBis(int nbreInstancesBis) {
		Ville.nbreInstancesBis = nbreInstancesBis;
	}

	private void setCategorie() {
		Log.log(Log.LOG_DEBUG, this.getClass().getName() + "::setCategorie() [begin]");

		int bornesSuperieures[] = {0, 1_000, 10_000, 100_000, 500_000, 1_000_000, 5_000_000, 1_000_0000};
		char categories[] = {'?', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H'};

		int i = 0;
		while (i < bornesSuperieures.length && this.nbreHabitants > bornesSuperieures[i])
			i++;

		this.categorie = categories[i];
		
		Log.log(Log.LOG_DEBUG, this.getClass().getName() + "::setCategorie() [end]");
	}

	public String comparer(Ville pVille) {
		Log.log(Log.LOG_DEBUG, this.getClass().getName() + "::comparer() [begin]");

		String reponse;

		if (pVille.nbreHabitants < this.nbreHabitants) {
			reponse = pVille.nomVille + " est moins peuplée que " + this.nomVille;
		} else if (pVille.nbreHabitants == this.nbreHabitants) {
			reponse = pVille.nomVille + " est aussi peuplée que " + this.nomVille;
		} else if (pVille.nbreHabitants > this.nbreHabitants) {
			return pVille.nomVille + " est plus peuplée que " + this.nomVille;
		} else {
			reponse = "Unknown";
		}

		Log.log(Log.LOG_DEBUG, this.getClass().getName() + "::comparer() [end]");
		
		return reponse;		
	}

}
