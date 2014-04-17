package com.kasalica.example.allInOne.strategy;

public class StartsWithCD implements CheckStrategy {

	public static final String STARTS_WITH = "cd";

	@Override
	public boolean check(String description) {
		String s = description.toLowerCase();
		if (description == null || description.length() == 0) {
			return false;
		} else {
			return s.startsWith(STARTS_WITH);
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
