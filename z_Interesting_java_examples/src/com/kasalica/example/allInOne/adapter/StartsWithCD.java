package com.kasalica.example.allInOne.adapter;

import com.kasalica.example.allInOne.adapter.CheckStrategyAdapter;

public class StartsWithCD extends CheckStrategyAdapter {

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
}
