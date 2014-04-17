package com.kasalica.designPattern.Builder2;

public class Test {

	public static void main(String[] args) {

		HouseBuilder iglooBuilder = new IglooHouseBuilder();

		CivilEngineer engineer = new CivilEngineer(iglooBuilder);

		engineer.constructHouse();

		House house = engineer.getHouse();

		System.out.println("Builder constructed: " + house);
	}
}