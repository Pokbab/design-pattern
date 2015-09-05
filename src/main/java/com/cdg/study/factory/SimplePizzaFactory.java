package com.cdg.study.factory;

public class SimplePizzaFactory {

	public Pizza createPizza(String type) {
		Pizza pizza = null;

		if ("cheese".equals(type)) {
			pizza = new CheesePizza();
		} else if ("pepperoni".equals(type)) {
			pizza = new PepperoniPizza();
		} else if ("veggie".equals(type)) {
			pizza = new VeggiePizza();
		}
		return pizza;
	}
}
