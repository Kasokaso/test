package com.kasalica.example.allInOne.observer;

import com.kasalica.example.allInOne.items.Item;

public class LogisticsDepartment implements Department {

	public void update(Item item, int qty) {
		// logic to update department's stock goes here
		System.out.println("Logistics has updated its stock for "
				+ item.getDescription() + " with qty=" + qty);
	}
}
