package head.first.design.patterns.duck;

import head.first.design.patterns.duck.fly.behavior.impl.FlyRocketPowered;
import head.first.design.patterns.duck.impl.MallardDuck;
import head.first.design.patterns.duck.impl.ModelDuck;

public class MiniDuckSimulator {

	public static void main(String[] args) {
		Duck duck = new MallardDuck();
		duck.performFly();
		duck.performQuack();

		Duck model = new ModelDuck();
		model.performFly();
		model.performFly();

		model.setFlyBehaviour(new FlyRocketPowered());
		model.performFly();

	}

}
