package com.kasalica.designPattern.Flyweight2;

public class Test {

	public static void main(String[] args) {
		CoffeeShop shop = new CoffeeShop();

		shop.takeOrder("Cappuccino", 2).takeOrder("Frappe", 1)
				.takeOrder("Espresso", 1).takeOrder("Frappe", 897)
				.takeOrder("Cappuccino", 97).takeOrder("Frappe", 3)
				.takeOrder("Espresso", 3).takeOrder("Cappuccino", 3)
				.takeOrder("Espresso", 96).takeOrder("Frappe", 552)
				.takeOrder("Cappuccino", 121).takeOrder("Espresso", 121);

		shop.service();
		System.out.println(shop.report());
	}
}
