package com.kasalica.designPattern.Builder2;

public class IglooHouseBuilder implements HouseBuilder {

	private final House house;

	public IglooHouseBuilder() {
		this.house = new House();
	}

	@Override
	public void buildBasement() {
		house.setBasement("Ice Bars");
	}

	@Override
	public void buildStructure() {
		house.setStructure("Ice Blocks");
	}

	@Override
	public void buildInterior() {
		house.setInterior("Ice Carvings");
	}

	@Override
	public void bulidRoof() {
		house.setRoof("Ice Dome");
	}

	@Override
	public House getHouse() {
		return this.house;
	}
}