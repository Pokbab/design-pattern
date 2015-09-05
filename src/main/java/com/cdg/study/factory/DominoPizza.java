package com.cdg.study.factory;

public class DominoPizza extends PizzaStore {

	public Pizza createPizza(String type) {
		Pizza pizza = null;
		PizzaIngredientFactory ingredientFactory = new DominoPizzaIngredientFactory();

		if ("cheese".equals(type)) {
			pizza = new CheesePizza(ingredientFactory);
			pizza.setName("도미노 치즈피자");
		} else if ("pepperoni".equals(type)) {
			pizza = new PepperoniPizza(ingredientFactory);
			pizza.setName("도미노 페퍼로니피자");
		}
		return pizza;
	}
}
