package com.kasalica.designPattern.FactoryMethod;

public class Test {

	public static void main(String[] args) {

		VehecleFactory factory = new VehecleFactory();
		String s = factory.getVehicle(VehicleTypes.CAR_TYPE).getType();
		System.out.println(s);
	}

}
