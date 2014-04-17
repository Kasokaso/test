package com.kasalica.designPattern.Proxy;

public class HighResolutionImage implements Image {

	
	public HighResolutionImage(String imagePath){
		loadImage(imagePath);
	}
	@Override
	public void showImage() {
		System.out.println("Image has been showed");

	}
	
	private void loadImage(String imagePath) {
		System.out.println("Loading image from path: "+imagePath);
		System.out.println("Image is loaded");
	}


}
