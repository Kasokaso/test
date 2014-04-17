package com.kasalica.designPattern.Composite;
public class Rectangle implements Shape{

	// List of shapes forming the rectangle
	// rectangle is centered around origin
	Shape[] rectangleEdges = {new Line(-1,-1,1,-1),new Line(-1,1,1,1),new Line(-1,-1,-1,1),new Line(1,-1,1,1)};
	
	

	@Override
	public Shape[] explodeShape() {
		
		return rectangleEdges;
	
	}

	/**
	 * this method is implemented directly in basic shapes 
	 * in complex shapes this method is implemented using delegation
	 */
	public void renderShapeToScreen() {

		System.out.println("Rectangle is rendered...");

		System.out.println("Rectangle edges start....");
		for(Shape s : rectangleEdges){
		
	           // delegate to child objects
			s.renderShapeToScreen();
			
		}
		
		System.out.println("Rectangle edges end...");
	}

}