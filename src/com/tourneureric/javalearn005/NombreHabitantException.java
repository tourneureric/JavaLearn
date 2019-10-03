package com.tourneureric.javalearn005;

@SuppressWarnings("serial")
class NombreHabitantException extends Exception {

	public NombreHabitantException() {
		Log.log(Log.LOG_DEBUG, "NombreHabitantException::NombreHabitantException() [begin]");

		Log.log(Log.LOG_TRACE, "NombreHabitantException::NombreHabitantException() Vous essayez d'instancier une classe Ville avec un nombre d'habitants négatif !");

		Log.log(Log.LOG_DEBUG, "NombreHabitantException::NombreHabitantException() [end]");
	}

	public NombreHabitantException(int nbre) {
		super (nbre + " < 0");
		Log.log(Log.LOG_DEBUG, "NombreHabitantException::NombreHabitantException(int nbre) [begin]");

		Log.log(Log.LOG_TRACE, "NombreHabitantException::NombreHabitantException(int nbre) Instanciation avec un nombre d'habitants négatif.");
		Log.log(Log.LOG_TRACE, "NombreHabitantException::NombreHabitantException(int nbre) \t => " + nbre);

		Log.log(Log.LOG_DEBUG, "NombreHabitantException::NombreHabitantException(int nbre) [end]");
	}

}
