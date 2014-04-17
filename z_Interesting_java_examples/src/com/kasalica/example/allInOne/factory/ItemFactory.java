package com.kasalica.example.allInOne.factory;

import com.kasalica.example.allInOne.ItemException;
import com.kasalica.example.allInOne.items.Item;

/**
 * ItemFactory is responsible for creating Item objects like CD, Book, and
 * Cosmetics etc
 */
public abstract class ItemFactory {

	public abstract Item getItem(int itemType, String description, int qty,
			double price) throws ItemException;
}
