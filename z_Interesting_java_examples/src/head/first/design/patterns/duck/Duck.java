package head.first.design.patterns.duck;

import head.first.design.patterns.duck.fly.behavior.FlyBehaviour;
import head.first.design.patterns.duck.quack.behavior.QuackBehaviour;

public abstract class Duck {
	protected QuackBehaviour quackBehaviour;
	protected FlyBehaviour flyBehaviour;

	public abstract void display();

	public void swim() {
		System.out.println("All ducks can swim.");
	}

	public void performQuack() {
		quackBehaviour.quack();
	}

	public void performFly() {
		flyBehaviour.fly();
	}

	public void setQuackBehaviour(QuackBehaviour quackBehaviour) {
		this.quackBehaviour = quackBehaviour;
	}

	public void setFlyBehaviour(FlyBehaviour flyBehaviour) {
		this.flyBehaviour = flyBehaviour;
	}

}
