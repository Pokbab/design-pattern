package com.cdg.study.factory;

public class DominoPepperoniPizza extends Pizza {
	public DominoPepperoniPizza() {
		name = "도미노 페퍼로니 피자";
		dough = "두꺼운 크러스트 도우";
		sauce = "Plum Tomato Sauce";
 
		toppings.add("Shredded Mozzarella Cheese");
		toppings.add("Black Olives");
		toppings.add("Spinach");
		toppings.add("Eggplant");
		toppings.add("Sliced Pepperoni");
	}
 
	@Override
	public void cut() {
		System.out.println("8조각으로 커팅 " + name);
	}
}
