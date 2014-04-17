package com.kasalica.example.allInOne.composite;

import java.util.ArrayList;
import java.util.List;

// package & import statements
/**
 * This is the Employee composite class having subordinates.
 */
public class Manager extends Employee {

	List<Employee> subordinates = null;

	public Manager(String name, double salary) {
		super(name, salary);
	}

	@Override
	public boolean addEmployee(Employee emp) {
		if (subordinates == null) {
			subordinates = new ArrayList<>(10);
		}
		return subordinates.add(emp);
	}

	@Override
	public boolean removeEmployee(Employee emp) {
		if (subordinates == null) {
			subordinates = new ArrayList<>(10);
		}
		return subordinates.remove(emp);
	}

	/**
	 * Recursive method call to calculate the sum of salary of a manager and his
	 * subordinates, which means sum of salary of a manager on whom this method
	 * was invoked and any employees who themselves will have any subordinates
	 * and so on.
	 */
	@Override
	public double getSalaries() {
		double sum = super.getSalaries(); // this one's salary
		if (this.hasSubordinates()) {
			for (int i = 0; i < subordinates.size(); i++) {
				sum += subordinates.get(i).getSalaries();
			}
		}
		return sum;
	}

	@Override
	public boolean hasSubordinates() {
		// recursive method call
		boolean hasSubOrdinates = false;
		if (subordinates != null && subordinates.size() > 0) {
			hasSubOrdinates = true;
		}
		return hasSubOrdinates;
	}
}
