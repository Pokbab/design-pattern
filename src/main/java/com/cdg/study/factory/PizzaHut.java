package com.cdg.study.factory;

/**
 * 피자 팩토리
 * 
 * @author Kanghoon Choi
 */
public class PizzaHut extends PizzaStore {

	public Pizza createPizza(String type) {
		Pizza pizza = null;
		PizzaIngredientFactory ingredientFactory = new PizzaHutIngredientFactory();

		if ("cheese".equals(type)) {
			pizza = new CheesePizza(ingredientFactory);
			pizza.setName("피자헛 치즈피자");
		} else if ("pepperoni".equals(type)) {
			pizza = new PepperoniPizza(ingredientFactory);
			pizza.setName("피자헛 페퍼로니피자");
		}
		return pizza;
	}
}
