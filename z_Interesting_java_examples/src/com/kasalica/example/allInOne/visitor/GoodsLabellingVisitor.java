package com.kasalica.example.allInOne.visitor;

import com.kasalica.example.allInOne.items.Book;
import com.kasalica.example.allInOne.items.CD;
import com.kasalica.example.allInOne.items.Cosmetics;

/**
 * visitor class which calls different methods depending on type of item.
 */
public class GoodsLabellingVisitor implements ItemVisitor {

	@Override
	public void visit(CD cd) {
		markWithCatalogNumber(cd);
	}

	@Override
	public void visit(Cosmetics cosmetics) {
		markWithColorNumber(cosmetics);
	}

	@Override
	public void visit(Book book) {
		markWithISBNNumber(book);
	}

	private void markWithCatalogNumber(CD cd) {
		System.out.println("Catalog number for : " + cd.getDescription());
	}

	private void markWithColorNumber(Cosmetics cosmetics) {
		System.out.println("Color number for : " + cosmetics.getDescription());
	}

	public void markWithISBNNumber(Book book) {
		System.out.println("ISBN number for : " + book.getDescription());
	}
}
