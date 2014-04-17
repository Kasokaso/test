package com.kasalica.designPattern.Decorator3;

public class ColorDecorator extends RoomDecorator {

	public ColorDecorator(Room specialRoom) {
		super(specialRoom);
	}

	@Override
	public String showRoom() {
		return specialRoom.showRoom() + addColors();
	}

	private String addColors() {
		return " + Blue Color";
	}
}
