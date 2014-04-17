package com.kasalica.example.allInOne.observer;

import com.kasalica.example.allInOne.items.Item;

/**
 * This is an observer (aka subscriber) interface. This gets notified through
 * its update method.
 */
public interface Department {

	public void update(Item item, int qty);
}
