package com.kasalica.designPattern.AbstractFactory;

public class Application {
	
	public Application(GUIFactory factory){
		Button button = factory.createButton();
		button.show();
	}

}
