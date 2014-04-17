package com.kasalica.designPattern.FactoryMethod;

public class VehecleFactory extends Factory {

	public Vehicle getVehicle(String type) {

		Vehicle vehicle = null;

		if (type.equals(VehicleTypes.BIKE_TYPE)) {
			vehicle = new Bike();
		} else if (type.equals(VehicleTypes.CAR_TYPE)) {
			vehicle = new Car();
		}

		return vehicle;
	}

	@Override
	protected Vehicle factoryMethod() {
		// TODO Auto-generated method stub
		return new Bike();
	}

}
