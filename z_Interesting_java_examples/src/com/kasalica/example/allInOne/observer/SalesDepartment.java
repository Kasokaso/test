package com.kasalica.example.allInOne.observer;

import com.kasalica.example.allInOne.items.Item;

public class SalesDepartment implements Department {

	@Override
	public void update(Item item, int qty) {
		// logic to update department's stock goes here
		System.out.println("Sales has updated its stock for "
				+ item.getDescription() + " with qty=" + qty);
	}
}
