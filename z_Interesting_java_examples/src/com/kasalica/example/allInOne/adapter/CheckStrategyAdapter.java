package com.kasalica.example.allInOne.adapter;

import com.kasalica.example.allInOne.strategy.CheckStrategy;

/**
 * This is an adapter class which provides default implementations to be
 * extended not to be used and facilitates its subclasses to be adapted to each
 * other. Throws an unchecked exception to indicate improper use.
 */
public class CheckStrategyAdapter implements CheckStrategy {

	@Override
	public boolean check(String word) {
		throw new RuntimeException(
				"Improper use of CheckStrategyAdapter class method check(String word)");
	}

	@Override
	public int count() {
		throw new RuntimeException(
				"Improper use of CheckStrategyAdapter class method count()");
	}

	@Override
	public void reset() {
		throw new RuntimeException(
				"Improper use of CheckStrategyAdapter class method reset()");
	}
}
