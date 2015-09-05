package com.cdg.study.factory;

/**
 * 피자 팩토리
 * 
 * @author Kanghoon Choi
 */
public class PizzaHut extends PizzaStore {

	public Pizza createPizza(String type) {
		Pizza pizza = null;

		if ("cheese".equals(type)) {
			pizza = new PizzaHutCheesePizza();
		} else if ("pepperoni".equals(type)) {
			pizza = new PizzaHutPepperoniPizza();
		}
		return pizza;
	}
}
