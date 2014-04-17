package com.kasalica.designPattern.FactoryMethod;

public abstract class Factory {

	protected abstract Vehicle factoryMethod();

	public void getVehicle() {

		Vehicle v = factoryMethod();
		v.getType();
	}

}
