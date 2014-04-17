package com.kasalica.example.allInOne.Iterator;

import com.kasalica.example.allInOne.items.Item;

public interface Iterator {

	public Item nextItem();

	public Item previousItem();

	public Item currentItem();

	public Item firstItem();

	public Item lastItem();

	public boolean isDone();

	public void setStep(int step);
}
