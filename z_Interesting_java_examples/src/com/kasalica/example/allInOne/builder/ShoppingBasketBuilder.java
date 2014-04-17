package com.kasalica.example.allInOne.builder;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.kasalica.example.allInOne.ItemException;
import com.kasalica.example.allInOne.factory.ItemFactory;
import com.kasalica.example.allInOne.factory.ItemFactorySelector;
import com.kasalica.example.allInOne.items.Item;

/**
 * Builder pattern: To simplify complex object creation by defining a class
 * whose purpose is to build instances of another class. There is a subtle
 * difference between a builder pattern and the factory pattern is that in
 * builder pattern, the user is given the choice to create the type of object
 * he/she wants but the construction process is the same. But with the factory
 * method pattern the factory decides how to create one of several possible
 * classes based on data provided to it.
 */
public class ShoppingBasketBuilder implements ItemBuilder {

	private List<Item> listItems = null;

	private void addItem(Item item) {
		if (listItems == null) {
			listItems = new ArrayList<>(20);
		}
		listItems.add(item);
	}

	/**
	 * builds a shopping basket
	 */
	@Override
	public void buildBasket(int itemType, String description, int qty,
			double unit_price) throws ItemException {
		// get the single instance of GoodsFactory using the singleton pattern
		// no matter how many times you call getInstance() you get access to the
		// same instance.
		ItemFactory factory = ItemFactorySelector.getItemFactory();
		// use factory method pattern to create item objects, based on itemType
		// supplied to it.
		Item item = factory.getItem(itemType, description, qty, unit_price);
		this.addItem(item); // adds the item to the basket
	}

	/**
	 * calculates total tax on the items in the built basket
	 */
	@Override
	public double calculateTotalTax() throws ItemException {
		if (listItems == null) {
			throw new ItemException("No items in the basket");
		}
		double totalTax = 0.0;
		Iterator<Item> it = listItems.iterator();
		while (it.hasNext()) {
			Item item = it.next();
			totalTax += item.getExtendedTax();
		}
		return totalTax;
	}

	/**
	 * calculates total price on the items in the built basket
	 */
	@Override
	public double calculateTotal() throws ItemException {
		if (listItems == null) {
			throw new ItemException("No items in the basket");
		}
		double total = 0.0;
		Iterator<Item> it = listItems.iterator();
		while (it.hasNext()) {
			Item item = it.next();
			total += item.getExtendedTaxPrice();
		}
		return total;
	}

	/**
	 * prints individual prices of the items in the built basket
	 */
	@Override
	public void printExtendedTaxedPrice() throws ItemException {
		if (listItems == null) {
			throw new ItemException("No items in the basket");
		}
		// double totalTax = 0.0;
		Iterator<Item> it = listItems.iterator();
		while (it.hasNext()) {
			Item item = it.next();
			System.out.println(item + "" + item.getExtendedTaxPrice());
		}
	}

	@Override
	public Iterator<Item> getIterator() {
		return listItems.iterator();
	}

	@Override
	public com.kasalica.example.allInOne.Iterator.Iterator getItemIterator() {
		// TODO Auto-generated method stub
		return new ItemsIterator();
	}

	/**
	 * inner class which iterates over basket of items
	 */
	class ItemsIterator implements
			com.kasalica.example.allInOne.Iterator.Iterator {

		private int current = 0;
		private int step = 1;

		@Override
		public Item nextItem() {
			Item item = null;
			current += step;
			if (!isDone()) {
				item = listItems.get(current);
			}
			return item;
		}

		@Override
		public Item previousItem() {
			Item item = null;
			current -= step;
			if (!isDone()) {
				item = listItems.get(current);
			}
			return item;
		}

		@Override
		public Item firstItem() {
			current = 0;
			return listItems.get(current);
		}

		@Override
		public Item lastItem() {
			current = listItems.size() - 1;
			return listItems.get(current);
		}

		@Override
		public boolean isDone() {
			return current >= listItems.size() ? true : false;
		}

		@Override
		public Item currentItem() {
			if (!isDone()) {
				return listItems.get(current);
			} else {
				return null;
			}
		}

		@Override
		public void setStep(int step) {
			this.step = step;
		}
	}

}
