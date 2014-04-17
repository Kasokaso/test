package com.kasalica.example.allInOne.items;

import com.kasalica.example.allInOne.ItemException;
import com.kasalica.example.allInOne.visitor.ItemVisitor;

public interface Item {

	public static final int TYPE_BOOK = 1;
	public static final int TYPE_CD = 2;
	public static final int TYPE_COSMETICS = 3;
	public static final int TYPE_CD_IMPORTED = 4;

	public double getExtendedTax();

	public double getExtendedTaxPrice() throws ItemException;

	public void setImported(boolean b);

	public String getDescription();

	public void accept(ItemVisitor visitor);

	public void prepareItemForRetail();

}
