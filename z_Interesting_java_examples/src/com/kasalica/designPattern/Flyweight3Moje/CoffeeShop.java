package com.kasalica.designPattern.Flyweight3Moje;

import java.util.ArrayList;
import java.util.List;

class CoffeeShop implements Shop {
	private final List<Order> orders = new ArrayList<Order>();
	private final Menu menu = MenuImpl.getMenu();

	/**
	 * TODO: d.kasalica I added Shop as return type. Initially it is void.
	 * 
	 * @param flavourName
	 * @param table
	 * @return
	 */
	@Override
	public Shop takeOrder(String flavourName, int table) {
		Product product = menu.getProduct(flavourName);
		Order order = new Order(table, product);
		orders.add(order);
		return this;
	}

	@Override
	public void service() {
		for (Order order : orders)
			order.serve();
	}

	@Override
	public String report() {
		return "\ntotal CoffeeFlavour objects made: "
				+ menu.totalProductsMade();
	}

}