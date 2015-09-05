package com.cdg.study.factory;

public class DominoPizza extends PizzaStore {

	public Pizza createPizza(String type) {
		Pizza pizza = null;

		if ("cheese".equals(type)) {
			pizza = new DominoCheesePizza();
		} else if ("pepperoni".equals(type)) {
			pizza = new DominoPepperoniPizza();
		}
		return pizza;
	}
}
