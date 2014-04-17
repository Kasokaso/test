package com.kasalica.example.allInOne.proxy;

import java.util.HashMap;
import java.util.Map;

public class XYZPriceList implements PriceList {

	private static final Map<Integer, Double> mapPrices = new HashMap<>(30,
			.075f);
	public static PriceList singleInstance = new XYZPriceList();// only one
																// instance
	/**
	 * static initializer block
	 */
	static {
		// only one item is added to keep it simple
		mapPrices.put(new Integer(1), new Double(12.00));// Book - IT
		// ... add more items to price list
	}

	public static PriceList getInstance() {
		return singleInstance;
	}

	@Override
	public double getPrice(int itemId) {
		double price = mapPrices.get(new Integer(itemId)).doubleValue();
		System.out.println("The price of the itemId " + itemId + " = " + price);
		return price;
	}

	@Override
	public void setPrice(int itemId, double newPrice) {
		System.out
				.println("wait while mutating price from 12.0 to 15.00 ...........");
		try {
			// transient value while updating with a proper value, just to
			// illustrate the effect
			// of concurrent access
			mapPrices.put(new Integer(itemId), new Double(-1));
			Thread.sleep(1000);// assume update/set operation takes 1 second
			mapPrices.put(new Integer(itemId), new Double(newPrice));
		} catch (InterruptedException ie) {
		}
	}
}
