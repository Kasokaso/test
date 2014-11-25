package head.first.design.patterns.duck.impl;

import head.first.design.patterns.duck.Duck;
import head.first.design.patterns.duck.fly.behavior.impl.FlyNoWay;
import head.first.design.patterns.duck.quack.behavior.impl.Quack;

public class ModelDuck extends Duck {

	public ModelDuck() {
		quackBehaviour = new Quack();
		flyBehaviour = new FlyNoWay();
	}

	@Override
	public void display() {
		System.out.println("Display model duck");

	}

}
