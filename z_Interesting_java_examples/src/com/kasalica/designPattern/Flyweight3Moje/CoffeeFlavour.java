package com.kasalica.designPattern.Flyweight3Moje;

// Instances of CoffeeFlavour will be the Flyweights
class CoffeeFlavour implements Product {
	private final String name;

	CoffeeFlavour(String newFlavor) {
		this.name = newFlavor;
	}

	@Override
	public String getProductName() {
		return name;
	}
}