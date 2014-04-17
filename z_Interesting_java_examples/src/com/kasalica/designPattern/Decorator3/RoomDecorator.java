package com.kasalica.designPattern.Decorator3;

abstract class RoomDecorator implements Room {

	protected Room specialRoom;

	public RoomDecorator(Room specialRoom) {
		this.specialRoom = specialRoom;
	}

	@Override
	public String showRoom() {
		return specialRoom.showRoom();
	}
}
