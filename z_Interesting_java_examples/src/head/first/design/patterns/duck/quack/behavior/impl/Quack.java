package head.first.design.patterns.duck.quack.behavior.impl;

import head.first.design.patterns.duck.quack.behavior.QuackBehaviour;

public class Quack implements QuackBehaviour {

	@Override
	public void quack() {
		System.out.println("Real duck quack.");

	}

}
