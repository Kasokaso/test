package com.kasalica.designPattern.Flyweight3Moje;

import java.util.HashMap;
import java.util.Map;

public class MenuImpl extends Menu {

	private static final MenuImpl instance = new MenuImpl();

	private MenuImpl() {

	}

	public static MenuImpl getMenu() {
		return instance;
	}

	private Map<String, Product> products = new HashMap<String, Product>();

	@Override
	public Product lookup(String productName) {
		if (!products.containsKey(productName)) {
			if (productName.equals("beer")) {
				products.put(productName, new Beer(productName));
			} else {
				products.put(productName, new CoffeeFlavour(productName));
			}
		}
		return products.get(productName);
	}

	@Override
	public int totalProductsMade() {
		return products.size();
	}
}
