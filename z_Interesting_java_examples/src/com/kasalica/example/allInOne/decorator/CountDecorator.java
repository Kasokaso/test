package com.kasalica.example.allInOne.decorator;

import com.kasalica.example.allInOne.strategy.CheckStrategy;

public class CountDecorator implements CheckStrategy {

	private CheckStrategy cs = null;
	private int count = 0;

	public CountDecorator(CheckStrategy cs) {
		this.cs = cs;
	}

	@Override
	public boolean check(String description) {

		boolean isFound = cs.check(description);
		if (isFound) {
			this.count++;

		}
		return isFound;
	}

	@Override
	public int count() {

		return this.count;

	}

	@Override
	public void reset() {
		this.count = 0;
	}
}
