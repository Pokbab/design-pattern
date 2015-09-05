package com.cdg.study.factory;


/**
 * 생산자 클래스.
 * 
 * @author Kanghoon Choi
 */
public abstract class PizzaStore {
	
	public Pizza orderPizza(String type) {
		Pizza pizza = null;

		pizza = createPizza(type);

		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();

		return pizza;
	}

	/**
	 * 피자 만드는부분은 팩토리메소드에서 처리
	 * 
	 * @param type
	 * @return
	 */
	public abstract Pizza createPizza(String type);
}
