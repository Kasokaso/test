package head.first.design.patterns.duck.impl;

import head.first.design.patterns.duck.Duck;
import head.first.design.patterns.duck.fly.behavior.impl.FlyWithWings;
import head.first.design.patterns.duck.quack.behavior.impl.Quack;

public class MallardDuck extends Duck {

	public MallardDuck() {
		flyBehaviour = new FlyWithWings();
		quackBehaviour = new Quack();
	}

	@Override
	public void display() {
		System.out.println("Display mallard duck.");

	}

}
