package com.kasalica.designPattern.Strategy;

public class Substract implements Operation {

	@Override
	public int execute(int a, int b) {
		
		int x = a - b;
		System.out.println("Result is: "+x);
		return x;
	}

}
