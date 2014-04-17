package com.kasalica.designPattern.Builder;

public class Book {
	
	private String introduction;
	private String tableOfContent;
	private String prefaces;
	private String chapters;
	private String glossary;
	
	
	public String getIntroduction() {
		return introduction;
	}
	public void setIntroduction(String introduction) {
		this.introduction = introduction;
	}
	public String getTableOfContent() {
		return tableOfContent;
	}
	public void setTableOfContent(String tableOfContent) {
		this.tableOfContent = tableOfContent;
	}
	public String getPrefaces() {
		return prefaces;
	}
	public void setPrefaces(String prefaces) {
		this.prefaces = prefaces;
	}
	public String getChapters() {
		return chapters;
	}
	public void setChapters(String chapters) {
		this.chapters = chapters;
	}
	public String getGlossary() {
		return glossary;
	}
	public void setGlossary(String glossary) {
		this.glossary = glossary;
	}
	
	@Override
	public String toString() {
		 String s = "[ "+ getChapters()	    +", "+
	                      getGlossary()	    +", "+
				          getIntroduction()	+", "+
	                      getPrefaces()		+ ", "+
				          getTableOfContent()	+" ]";
		return s;
	}
	

}
