package com.kasalica.example.allInOne.strategy;

public interface CheckStrategy {

	public boolean check(String word);

	public int count();

	public void reset();
}
