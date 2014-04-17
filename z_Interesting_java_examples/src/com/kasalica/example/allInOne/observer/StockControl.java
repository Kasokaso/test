package com.kasalica.example.allInOne.observer;

import com.kasalica.example.allInOne.items.Item;

/**
 * Subject (publisher) class: when stock is updated, notifies all the
 * subscribers.
 */
public interface StockControl {

	public void notify(Item item, int qty);

	public void updateStock(Item item, int qty);

	public boolean addSubscribers(Department dept);

	public boolean removeSubscribers(Department dept);
}
