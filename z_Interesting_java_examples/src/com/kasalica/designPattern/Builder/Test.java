package com.kasalica.designPattern.Builder;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		BookBuilder bookBuilder = new ConcreteBook1Builder();
		BookWriter writer = new BookWriter(bookBuilder);
		writer.printBook();
		
		Book book = writer.getBuilder().getBook();
		System.out.println(book.toString());

	}

}
