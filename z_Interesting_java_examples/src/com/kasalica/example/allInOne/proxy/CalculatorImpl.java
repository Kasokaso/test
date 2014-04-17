package com.kasalica.example.allInOne.proxy;

public class CalculatorImpl implements Calculator {

	@Override
	public int add(int i1, int i2) {
		final int sum = i1 + i2;
		System.out.println("Sum is : " + sum);
		return sum;
	}
}
