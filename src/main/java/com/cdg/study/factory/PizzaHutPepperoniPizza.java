package com.cdg.study.factory;

public class PizzaHutPepperoniPizza extends Pizza {

	public PizzaHutPepperoniPizza() {
		name = "피자헛 페퍼로니 피자";
		dough = "얇은 크러스트 도우";
		sauce = "Marinara Sauce";
 
		toppings.add("Grated Reggiano Cheese");
		toppings.add("Sliced Pepperoni");
		toppings.add("Garlic");
		toppings.add("Onion");
		toppings.add("Mushrooms");
		toppings.add("Red Pepper");
	}
}
