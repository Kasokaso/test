package com.kasalica.designPattern.Flyweight3Moje;

public class Beer implements Product {

	private String name;

	public Beer(String productName) {
		this.name = productName;
	}

	@Override
	public String getProductName() {
		return name;
	}
}
