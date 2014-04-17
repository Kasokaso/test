package com.kasalica.example.allInOne.composite;

/**
 * Base employee class
 */
public abstract class Employee {

	private final String name;
	private final double salary;

	public Employee(String name, double salary) {
		this.name = name;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public double getSalaries() {
		return salary;
	}

	public abstract boolean addEmployee(Employee emp);

	public abstract boolean removeEmployee(Employee emp);

	protected abstract boolean hasSubordinates();

}
