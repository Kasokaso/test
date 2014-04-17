package com.kasalica.designPattern.Decorator3;

public class Test {

	public static void main(String args[]) {

		Room room = new CurtainDecorator(new ColorDecorator(new SimpleRoom()));
		System.out.println(room.showRoom());
	}

}
