package com.tourneureric.javalearn003;

@FunctionalInterface
public interface Soin {
	public void soigner();
	public default String toto(int i) {
		return "Tout est OK !";
	};
}
