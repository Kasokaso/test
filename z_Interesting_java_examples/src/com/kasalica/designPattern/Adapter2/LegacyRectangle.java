package com.kasalica.designPattern.Adapter2;

class LegacyRectangle {

	public void draw(int x, int y, int w, int h) {
		System.out.println("rectangle at (" + x + ',' + y + ") with width " + w
				+ " and height " + h);
	}
}