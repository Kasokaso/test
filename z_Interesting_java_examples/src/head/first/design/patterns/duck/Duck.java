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
		if (quackBehaviour != null) {
			quackBehaviour.quack();
		} else {
			throw new NullPointerException("Quack behaviour is null");
		}
	}

	public void performFly() {
		if (flyBehaviour != null) {
			flyBehaviour.fly();
		} else {
			throw new NullPointerException("Fly behaviour is null");
		}
	}

	public void setQuackBehaviour(QuackBehaviour quackBehaviour) {
		this.quackBehaviour = quackBehaviour;
	}

	public void setFlyBehaviour(FlyBehaviour flyBehaviour) {
		this.flyBehaviour = flyBehaviour;
	}

}
