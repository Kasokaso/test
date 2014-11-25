package head.first.design.patterns.duck.quack.behavior.impl;

import head.first.design.patterns.duck.quack.behavior.QuackBehaviour;

public class Squeak implements QuackBehaviour {

	@Override
	public void quack() {
		System.out.println("Rubber duck squeak.");

	}

}
