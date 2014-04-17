package com.kasalica.example.allInOne.facade;

import com.kasalica.example.allInOne.items.Item;

// This is the facade class

public class PurchaseEvaluation {

	private final StockControl stockControl = new StockControl();
	private final WholeSaler wholeSaler = new WholeSaler();
	private final Bank bank = new Bank();

	public boolean shouldWePlaceOrder(Item item) {
		if (!stockControl.isBelowReorderpoint(item)) {
			return false;
		}
		if (!wholeSaler.hasSufficientStock(item)) {
			return false;
		}
		if (!bank.hasSufficientFunds()) {
			return false;
		}
		return true;
	}
}
