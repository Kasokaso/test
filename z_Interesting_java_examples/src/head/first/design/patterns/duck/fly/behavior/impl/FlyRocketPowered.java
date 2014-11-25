package head.first.design.patterns.duck.fly.behavior.impl;

import head.first.design.patterns.duck.fly.behavior.FlyBehaviour;

public class FlyRocketPowered implements FlyBehaviour {

	@Override
	public void fly() {
		System.out.println("Fly rocket powered ----->");

	}

}
