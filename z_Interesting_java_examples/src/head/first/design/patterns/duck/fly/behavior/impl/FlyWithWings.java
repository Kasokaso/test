package head.first.design.patterns.duck.fly.behavior.impl;

import head.first.design.patterns.duck.fly.behavior.FlyBehaviour;

public class FlyWithWings implements FlyBehaviour {

	@Override
	public void fly() {
		System.out.println("Fly with wings");
	}

}
