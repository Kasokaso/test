package com.kasalica.designPattern.Strategy;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Context context = new Context();
		
		Operation add = new Add();
		Operation sub = new Substract();
		Operation mul = new Multiply();
		
		context.setOperation(add);
		context.executeOperation(1, 2);
		
		context.setOperation(sub);
		context.executeOperation(2, 1);
		
		context.setOperation(mul);
		context.executeOperation(1, 2);

	}

}
