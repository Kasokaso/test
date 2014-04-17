package com.kasalica.designPattern.Adapter3;

//existing class does not need to be changed
public class Consultant {

	private final String name;

	public Consultant(String name) {
		this.name = name;
	}

	protected void showSmile() {
		System.out.println("Consultant " + this.name + " showed smile");
	}

}
