package com.cdg.study.factory;

public class DominoCheesePizza extends Pizza {

	public DominoCheesePizza() { 
		name = "도미노 치즈 피자";
		dough = "두꺼운 크러스트 도우";
		sauce = "Plum Tomato Sauce";
 
		toppings.add("Shredded Mozzarella Cheese");
	}
 
	@Override
	public void cut() {
		System.out.println("8조각으로 커팅 " + name);
	}
}
