package com.kasalica.example.allInOne.proxy;

public class PriceListUser implements Runnable {

	int itemId;
	double price;
	static int count = 0;

	public PriceListUser(int itemId) {
		this.itemId = itemId;
	}

	/**
	 * runnable code where multi-threads are executed
	 */
	@Override
	public void run() {
		String name = Thread.currentThread().getName();
		if (name.equals("accessor")) {
			price = XYZPriceListProxy.getInstance().getPrice(itemId);
		} else if (name.equals("mutator")) {
			XYZPriceListProxy.getInstance().setPrice(itemId, 15.00);
		}
	}
}
