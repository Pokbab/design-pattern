package com.cdg.study.strategy;

import static org.junit.Assert.*;

import org.junit.Test;

public class StrategyTest {

	@Test
	public void test() throws Exception {
		MallardDuck mallard = new MallardDuck();
		RubberDuck rubberDuckie = new RubberDuck();
		ModelDuck model = new ModelDuck();

		mallard.performQuack();
		rubberDuckie.performQuack();

		model.performFly();
		model.setFlyBehavior(new FlyRocketPowered());
		model.performFly();
	}
}
