package com.kasalica.designPattern.Bridge;

public class Bike extends Vehicle {

	public Bike(Workshop workshop1, Workshop workshop2) {
		super(workshop1, workshop2);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void manufacture() {
		System.out.print("Bike");
		workshop1.work();
		workshop2.work();
		
	}

}
