package com.cdg.study.factory;


public class PizzaStore {

	public Pizza orderPizza(String type) {
		Pizza pizza = null;

		if ("cheese".equals(type)) {
			pizza = new CheesePizza();
		} else if ("pepperoni".equals(type)) {
			pizza = new PepperoniPizza();
		} else if ("veggie".equals(type)) {
			pizza = new VeggiePizza();
		}

		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();

		return pizza;
	}

}
