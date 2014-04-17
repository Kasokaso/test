package com.kasalica.example.allInOne.observer;

import java.util.ArrayList;
import java.util.List;

import com.kasalica.example.allInOne.items.Item;

/**
 * publisher (observable) class: when stock is updated notifies all the
 * subscribers.
 */
public class XYZStockControl implements StockControl {

	List<Department> listSubscribers = new ArrayList<>(10);

	@Override
	public boolean addSubscribers(Department dept) {
		return listSubscribers.add(dept);
	}

	@Override
	public boolean removeSubscribers(Department dept) {
		return listSubscribers.remove(dept);
	}

	/**
	 * writes updated stock qty into databases
	 */
	@Override
	public void updateStock(Item item, int qty) {
		// logic to update an item's stock goes here
		notify(item, qty); // notify subscribers that with the updated stock
							// info.
	}

	@Override
	public void notify(Item item, int qty) {
		int noOfsubscribers = listSubscribers.size();
		for (int i = 0; i < noOfsubscribers; i++) {
			Department dept = listSubscribers.get(i);
			dept.update(item, qty);
		}
	}
}
