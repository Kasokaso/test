package com.kasalica.example.allInOne.strategy;

public class LongerThan15 implements CheckStrategy {

	public static final int LENGTH = 15; // constant

	@Override
	public boolean check(String description) {
		if (description == null) {
			return false;
		} else {
			return description.length() > LENGTH;
		}
	}

	@Override
	public int count() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void reset() {
		// TODO Auto-generated method stub

	}

}
