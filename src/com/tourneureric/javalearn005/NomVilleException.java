package com.tourneureric.javalearn005;

@SuppressWarnings("serial")
public class NomVilleException extends Exception {
	
	public NomVilleException(String message) {
		super(message);
		Log.log(Log.LOG_DEBUG, "NomVilleException::NomVilleException(String message) [begin]");

		Log.log(Log.LOG_DEBUG, "NomVilleException::NomVilleException(String message) [end]");
	}
}
