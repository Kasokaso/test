package com.kasalica.designPattern.Flyweight2;

import java.util.ArrayList;
import java.util.List;

class CoffeeShop {
	private final List<Order> orders = new ArrayList<Order>();
	private final Menu menu = new Menu();

	/**
	 * TODO: d.kasalica I added CoffeShop as return type. Initially it is void.
	 * 
	 * @param flavourName
	 * @param table
	 * @return
	 */
	CoffeeShop takeOrder(String flavourName, int table) {
		CoffeeFlavour flavour = menu.lookup(flavourName);
		Order order = new Order(table, flavour);
		orders.add(order);
		return this;
	}

	void service() {
		for (Order order : orders)
			order.serve();
	}

	String report() {
		return "\ntotal CoffeeFlavour objects made: "
				+ menu.totalCoffeeFlavoursMade();
	}

}