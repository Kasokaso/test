package com.kasalica.example.allInOne.items;

import com.kasalica.example.allInOne.visitor.ItemVisitor;

public class Cosmetics extends Goods {

	private final boolean isTaxed = true;
	private boolean isImported = false;

	public Cosmetics(String description, int qty, double price) {
		super(description, qty, price);
	}

	@Override
	public boolean isTaxed() {
		return isTaxed;
	}

	@Override
	public boolean isImported() {
		return isImported;
	}

	@Override
	public void setImported(boolean b) {
		isImported = b;
	}

	@Override
	public void accept(ItemVisitor visitor) {
		// TODO Auto-generated method stub
		visitor.visit(this);

	}

	@Override
	public void addToStock() {
		// database call logic to store the cosmetic in stock table.
		System.out
				.println("Cosmetic added to stock : " + this.getDescription());

	}

	@Override
	public void applyBarcode() {
		// logic to print and apply the barcode to cosmetic.
		System.out.println("Bar code applied to cosmetic : "
				+ this.getDescription());

	}

	@Override
	public void markRetailPrice() {
		// logic to read retail price from the cosmetic table and apply the
		// retail price.
		System.out.println("Mark retail price for the cosmetic : "
				+ this.getDescription());

	}
}
