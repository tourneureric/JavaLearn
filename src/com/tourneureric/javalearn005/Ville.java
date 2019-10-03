package com.tourneureric.javalearn005;

import java.util.Objects;

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
	protected static int nbreInstancesBis = 0;

	protected String nomVille;
	protected String nomPays;
	protected int nbreHabitants;
	protected char categorie;

	/* ============================================================
	    @Override public methods
	   ============================================================ */

	@Override
	public String toString() {
		Log.log(Log.LOG_DEBUG, "Ville::toString() [begin]");

		String str = "Ville{" +
				"nomVille='" + nomVille + "'" +
				", nomPays='" + nomPays + "'" +
				", nbreHabitants=" + nbreHabitants +
				", categorie='" + categorie + "'" +
				'}';

		Log.log(Log.LOG_DEBUG, "Ville::toString() [end]");

		return str;
	}

	@Override
	public int hashCode() {
		return Objects.hash(categorie, nbreHabitants, nomPays, nomVille);
	}

	@Override
	public boolean equals(Object obj) {
		//On vérifie si les références d'objets sont identiques
		if (this == obj)
			return true;

		//On s'assure que les objets sont du même type, ici de type Ville
		if (getClass() != obj.getClass())
			return false;

		//Maintenant, on compare les attributs de nos objets
		Ville other = (Ville) obj;

		return Objects.equals(other.getCategorie(), this.getCategorie()) &&
				Objects.equals(other.getNomVille(), this.getNomVille()) &&
				Objects.equals(other.getNbreHabitants(), this.getNbreHabitants()) &&
				Objects.equals(other.getNomPays(), this.getNomPays());
	}

	/* ============================================================
    	Non @Override public methods
	   ============================================================ */

	public Ville() {
		Log.log(Log.LOG_DEBUG, "Ville::Ville() [begin]");

		Log.log(Log.LOG_TRACE, "Ville::Ville() Creéation d'une ville !");
		nbreInstances++;
		nbreInstancesBis++;
		nomVille = "Inconnu";
		nomPays = "Inconnu";
		nbreHabitants = 0;
		this.setCategorie();

		Log.log(Log.LOG_DEBUG, "Ville::Ville() [end]");
	}

	public Ville(String pNom, int pNbre, String pPays) throws NombreHabitantException, NomVilleException {
		Log.log(Log.LOG_DEBUG, "Ville::Ville(String pNom, int pNbre, String pPays) [begin]");

		Log.log(Log.LOG_TRACE, "Ville::Ville(String pNom, int pNbre, String pPays) Création d'une ville avec des paramètres !");
		if (pNbre < 0) {
			Log.log(Log.LOG_TRACE, "Ville::Ville(String pNom, int pNbre, String pPays) pNbre < 0");
			throw new NombreHabitantException(pNbre);
		} else if (pNom.length() < 3) {
			Log.log(Log.LOG_TRACE, "Ville::Ville(String pNom, int pNbre, String pPays) pNom.length() < 3");
			throw new NomVilleException("le nom de la ville est inférieur à 3 caractères ! nom = " + pNom);
		} else {
			nbreInstances++;
			nbreInstancesBis++;
			nomVille = pNom;
			nomPays = pPays;
			nbreHabitants = pNbre;
			this.setCategorie();
		}

		Log.log(Log.LOG_DEBUG, "Ville::Ville(String pNom, int pNbre, String pPays) [end]");
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

	public String comparer(Ville pVille) {
		Log.log(Log.LOG_DEBUG, "Ville::comparer() [begin]");

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

		Log.log(Log.LOG_DEBUG, "Ville::comparer() [end]");

		return reponse;		
	}

	/* ============================================================
    	@Override private methods
	   ============================================================ */

	/* ============================================================
		Non @Override private methods
	   ============================================================ */

	private void setCategorie() {
		Log.log(Log.LOG_DEBUG, "Ville::setCategorie() [begin]");

		int bornesSuperieures[] = {0, 1_000, 10_000, 100_000, 500_000, 1_000_000, 5_000_000, 1_000_0000};
		char categories[] = {'?', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H'};

		int i = 0;
		while (i < bornesSuperieures.length && this.nbreHabitants > bornesSuperieures[i])
			i++;

		this.categorie = categories[i];

		Log.log(Log.LOG_DEBUG, "Ville::setCategorie() [end]");
	}

}
