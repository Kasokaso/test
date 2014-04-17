package com.kasalica.designPattern.Flyweight3Moje;

// Menu acts as a factory and cache for CoffeeFlavour flyweight objects
public abstract class Menu {

	public abstract Product lookup(String productName);

	public abstract int totalProductsMade();

	public Product getProduct(String productName) {
		return lookup(productName);
	}
}