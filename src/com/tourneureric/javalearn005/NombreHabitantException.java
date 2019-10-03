package com.tourneureric.javalearn005;

@SuppressWarnings("serial")
class NombreHabitantException extends Exception {

	public NombreHabitantException() {
		Log.log(Log.LOG_DEBUG, "NombreHabitantException::NombreHabitantException() [begin]");
		
		Log.log(Log.LOG_TRACE, "NombreHabitantException::NombreHabitantException() Vous essayez d'instancier une classe Ville avec un nombre d'habitants négatif !");
		
		Log.log(Log.LOG_DEBUG, "NombreHabitantException::NombreHabitantException() [end]");
	}

}
