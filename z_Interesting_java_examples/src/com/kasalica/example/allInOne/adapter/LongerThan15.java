package com.kasalica.example.allInOne.adapter;

public class LongerThan15 extends CheckStrategyAdapter {

	public static final int LENGTH = 15;

	@Override
	public boolean check(String description) {
		if (description == null) {
			return false;
		} else {
			return description.length() > LENGTH;
		}
	}
}
