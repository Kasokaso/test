package com.kasalica.designPattern.Proxy;

public class Test {

	/**
	 * @param args
	 * 
	 * Show link : http://en.wikipedia.org/wiki/Proxy_pattern
	 */
	public static void main(String[] args) {
	
		Image image1 = new ProxyImage("/usr/kaso/Download/slika1.jpg");
		Image image2 = new ProxyImage("/usr/kaso/Download/slika2.jpg");
		Image image3 = new ProxyImage("/usr/kaso/Download/slika3.jpg");
		
		image1.showImage();
		
		System.out.println("********************************************************************");
		Image image1HighResolution = new HighResolutionImage("/user/kaso/Download/slika1.jpg");
		Image image2HighResolution = new HighResolutionImage("/user/kaso/Download/slika2.jpg");
		Image image3HighResolution = new HighResolutionImage("/user/kaso/Download/slika3.jpg");
		
		image1HighResolution.showImage();
		

	}

}
