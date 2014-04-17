package com.kasalica.designPattern.Flyweight3Moje;

class Order {
	private final int tableNumber;
	private final Product product;

	Order(int tableNumber, Product product) {
		this.tableNumber = tableNumber;
		this.product = product;
	}

	void serve() {
		System.out.println("Serving " + product.getProductName() + " to table "
				+ tableNumber);
	}
}