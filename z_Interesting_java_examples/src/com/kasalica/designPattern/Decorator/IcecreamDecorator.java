package com.kasalica.designPattern.Decorator;

public class IcecreamDecorator implements Icecream {

	protected Icecream specialIcecream;

	public IcecreamDecorator(Icecream specialIcecream) {
		this.specialIcecream = specialIcecream;
	}

	@Override
	public String makeIcecream() {
		// TODO Auto-generated method stub
		return specialIcecream.makeIcecream();
	}

}
