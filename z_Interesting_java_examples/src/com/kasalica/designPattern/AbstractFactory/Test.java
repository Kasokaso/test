package com.kasalica.designPattern.AbstractFactory;

public class Test {

	public static void main(String[] args) {

		GUIFactory factory = new LinuxFactory();
		factory.createButton().show();

		factory = new WindowsFactory();
		factory.createButton().show();

		// Application app = new Application(createSpecificFactory(1));

	}

	private static GUIFactory createSpecificFactory(int i) {

		if (i == 1) {
			return new LinuxFactory();
		} else {
			return new WindowsFactory();
		}

	}

}
