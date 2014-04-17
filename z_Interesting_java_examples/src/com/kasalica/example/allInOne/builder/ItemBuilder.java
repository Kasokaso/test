package com.kasalica.example.allInOne.builder;

import java.util.Iterator;

import com.kasalica.example.allInOne.ItemException;
import com.kasalica.example.allInOne.items.Item;

public interface ItemBuilder {

	public void buildBasket(int itemType, String description, int qty,
			double unit_price) throws ItemException;

	public double calculateTotalTax() throws ItemException;

	public double calculateTotal() throws ItemException;

	public void printExtendedTaxedPrice() throws ItemException;

	public Iterator<Item> getIterator();

	public com.kasalica.example.allInOne.Iterator.Iterator getItemIterator();

}
