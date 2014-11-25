package head.first.design.patterns.duck.fly.behavior.impl;

import head.first.design.patterns.duck.fly.behavior.FlyBehaviour;

public class FlyNoWay implements FlyBehaviour {

	@Override
	public void fly() {
		System.out.println("Fly no way!");

	}

}
