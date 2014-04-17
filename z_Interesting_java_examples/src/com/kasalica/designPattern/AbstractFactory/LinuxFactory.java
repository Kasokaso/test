package com.kasalica.designPattern.AbstractFactory;

public class LinuxFactory implements GUIFactory {

	public Button createButton() {
		
		return (new LinuxButton());
	}

}
