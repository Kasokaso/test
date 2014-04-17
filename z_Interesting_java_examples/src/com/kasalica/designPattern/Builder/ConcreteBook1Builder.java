package com.kasalica.designPattern.Builder;

public class ConcreteBook1Builder implements BookBuilder {

	private Book book;
	
	public ConcreteBook1Builder(){
		book = new Book();
	}
	@Override
	public void buildTableOfContent() {
		book.setTableOfContent("table of content");

	}

	@Override
	public void buildPreface() {
		// TODO Auto-generated method stub
		book.setPrefaces("preface");

	}

	@Override
	public void buildIntroduction() {
		// TODO Auto-generated method stub
		book.setIntroduction("introduction");

	}

	@Override
	public void buildChapters() {
		// TODO Auto-generated method stub
		book.setChapters("chapters");

	}

	@Override
	public void buildGlossary() {
		// TODO Auto-generated method stub
		book.setGlossary("glossary");

	}

	@Override
	public Book getBook() {
		// TODO Auto-generated method stub
		return book;
	}

}
