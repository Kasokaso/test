package com.kasalica.example.allInOne.visitor;

import com.kasalica.example.allInOne.items.Book;
import com.kasalica.example.allInOne.items.CD;
import com.kasalica.example.allInOne.items.Cosmetics;

public interface ItemVisitor {

	public void visit(CD cd);

	public void visit(Cosmetics cosmetics);

	public void visit(Book book);

}
