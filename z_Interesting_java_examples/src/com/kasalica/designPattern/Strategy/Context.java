package com.kasalica.designPattern.Strategy;

public class Context {

	Operation operation;
	
	public void setOperation (Operation operation){
		
		this.operation = operation;
	}

	public void executeOperation (int a, int b){
		
		operation.execute(a, b);

	}
}
