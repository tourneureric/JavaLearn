package com.tourneureric.javalearn007;

public class Notice {

	private String langue ;

	public Notice() {
		this.langue = "Français";
	}

	public Notice(String lang) {
		this.langue = lang;
	}

	public String toString() {
		return "\t Langue de la notice : " + this.langue + "\n";
	}

}
