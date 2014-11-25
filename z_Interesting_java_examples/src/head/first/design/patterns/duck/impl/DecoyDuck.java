package head.first.design.patterns.duck.impl;

import head.first.design.patterns.duck.Duck;

public class DecoyDuck extends Duck {

	@Override
	public void display() {
		System.out.println("Decoy duck.");

	}

}
