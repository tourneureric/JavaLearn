package com.tourneureric.javalearn002;

public abstract class Felin extends Animal {
	
	protected Felin() {
		Log.log(Log.LOG_DEBUG, "Felin::Felin() [begin]");
		
		P.print("Felin : instanciation");

		Log.log(Log.LOG_DEBUG, "Felin::Felin() [end]");	
	}

	@Override
	void deplacement() {
		Log.log(Log.LOG_DEBUG, "Felin::deplacement() [begin]");

		P.print("Felin : Je me déplace seul !");

		Log.log(Log.LOG_DEBUG, "Felin::deplacement() [end]");
	}

}
