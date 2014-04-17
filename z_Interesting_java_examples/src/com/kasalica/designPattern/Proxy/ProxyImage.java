package com.kasalica.designPattern.Proxy;

public class ProxyImage implements Image {

	private String imagePath;
	private Image image;
	
	
	public ProxyImage(String imagePath) {
		this.setImagePath(imagePath);
	}


	@Override
	public void showImage() {
		if(image == null)
			image = new HighResolutionImage(imagePath);
		
		image.showImage();

	}


	public String getImagePath() {
		return imagePath;
	}


	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}


}
