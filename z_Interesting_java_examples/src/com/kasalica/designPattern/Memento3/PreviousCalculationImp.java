package com.kasalica.designPattern.Memento3;

/**
 * Memento Object Implementation
 * 
 * Note that this object implements both interfaces to Originator and CareTaker
 */
public class PreviousCalculationImp implements PreviousCalculationToCareTaker,
		PreviousCalculationToOriginator {

	private final int firstNumber;
	private final int secondNumber;

	public PreviousCalculationImp(int firstNumber, int secondNumber) {

		this.firstNumber = firstNumber;
		this.secondNumber = secondNumber;
	}

	@Override
	public int getFirstNumber() {

		return firstNumber;
	}

	@Override
	public int getSecondNumber() {

		return secondNumber;
	}
}