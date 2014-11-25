package com.kasalica.designPattern.Adapter3Modified;

public class EmployeeImplementation implements Employee {

	private final String name;

	public EmployeeImplementation(String name) {
		this.name = name;
	}

	@Override
	public void showHappiness() {

		System.out.println("Employee " + this.name + " showed happiness");

	}

}
