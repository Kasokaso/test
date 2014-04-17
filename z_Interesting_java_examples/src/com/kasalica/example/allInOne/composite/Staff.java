package com.kasalica.example.allInOne.composite;

import java.util.ArrayList;
import java.util.List;

import com.kasalica.example.allInOne.command.Calculator;
import com.kasalica.example.allInOne.command.CalculatorCommand;
import com.kasalica.example.allInOne.command.Command;

/**
 * This is the leaf staff employee object. staff do not have any subordinates.
 */
public class Staff extends Employee {

	private final Calculator calc = new Calculator();
	private final List<Command> listCommands = new ArrayList<>(15);
	private int current = 0;

	public Staff(String name, double salary) {
		super(name, salary);
	}

	@Override
	public boolean addEmployee(Employee emp) {
		throw new RuntimeException("Improper use of Staff class");
	}

	@Override
	public boolean removeEmployee(Employee emp) {
		throw new RuntimeException("Improper use of Staff class");
	}

	@Override
	protected boolean hasSubordinates() {
		return false;
	}

	/**
	 * make use of command.
	 */
	public void compute(char operator, int operand) {
		Command command = new CalculatorCommand(calc, operator, operand);// initialise
																			// the
																			// calculator
		command.execute();
		// add commands to the list so that undo operation can be performed
		listCommands.add(command);
		current++;
	}

	/**
	 * perform redo operations
	 */
	public void redo(int noOfLevels) {
		int noOfCommands = listCommands.size();
		for (int i = 0; i < noOfLevels; i++) {
			if (current < noOfCommands) {
				listCommands.get(current++).execute();
			}
		}
	}

	/**
	 * perform undo operations
	 */
	public void undo(int noOfLevels) {
		for (int i = 0; i < noOfLevels; i++) {
			if (current > 0) {
				listCommands.get(--current).unexecute();
			}
		}
	}

}
