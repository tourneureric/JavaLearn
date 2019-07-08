package com.tourneureric.javalearn002;

public class X implements I1, I2 {

	@Override
	public void A() {
		Log.log(Log.LOG_DEBUG, "X::A() [begin]");

		Log.log(Log.LOG_DEBUG, "X::A() [end]");
	}

	@Override
	public String B() {
		Log.log(Log.LOG_DEBUG, "X::B() [begin]");

		Log.log(Log.LOG_DEBUG, "X::B() [end]");
		return null;
	}

	@Override
	public void C() {
		Log.log(Log.LOG_DEBUG, "X::C() [begin]");

		Log.log(Log.LOG_DEBUG, "X::C() [end]");
	}

	@Override
	public String D() {
		Log.log(Log.LOG_DEBUG, "X::D() [begin]");

		Log.log(Log.LOG_DEBUG, "X::D() [end]");
		return null;
	}


}
