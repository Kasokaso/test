package com.kasalica.designPattern.AbstractFactory;

public class WindowsFactory implements GUIFactory {

	@Override
	public Button createButton() {
		
		return (new WindowsButton());
	}

}
