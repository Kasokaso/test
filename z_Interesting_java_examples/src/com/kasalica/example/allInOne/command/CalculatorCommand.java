package com.kasalica.example.allInOne.command;

/**
 * calculator command, which decouples the receiver Calculator from the invoker
 * Staff
 */
public class CalculatorCommand implements Command {

	private Calculator calc = null;
	private final char operator;
	private final int operand;

	public CalculatorCommand(Calculator calc, char operator, int operand) {
		this.calc = calc;
		this.operator = operator;
		this.operand = operand;
	}

	@Override
	public void execute() {
		calc.calculate(operator, operand);
	}

	@Override
	public void unexecute() {
		calc.calculate(undoOperand(operator), operand);
	}

	private char undoOperand(char operator) {
		char undoOperator = ' ';
		switch (operator) {
			case '+':
				undoOperator = '-';
				break;
			case '-':
				undoOperator = '+';
				break;
		}
		return undoOperator;
	}
}
