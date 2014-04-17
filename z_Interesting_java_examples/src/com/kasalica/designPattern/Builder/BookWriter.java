package com.kasalica.designPattern.Builder;

public class BookWriter {
	
	private BookBuilder bookBuilder;
	
	public BookWriter(BookBuilder builder) {
		this.bookBuilder = builder;
		
		
	}
	
	public void printBook(){
		bookBuilder.buildChapters();
		bookBuilder.buildGlossary();
		bookBuilder.buildIntroduction();
		bookBuilder.buildPreface();
		bookBuilder.buildTableOfContent();
		
	}
	
	public BookBuilder getBuilder(){
		
		return bookBuilder;
	}

}
