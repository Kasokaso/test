package com.kasalica.designPattern.Decorator3;

public class CurtainDecorator extends RoomDecorator {

	public CurtainDecorator(Room specialRoom) {
		super(specialRoom);
	}

	@Override
	public String showRoom() {
		return specialRoom.showRoom() + addCurtains();
	}

	private String addCurtains() {
		return " + Red Curtains";
	}
}
