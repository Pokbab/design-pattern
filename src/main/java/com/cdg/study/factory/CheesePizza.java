/*
 * @(#)PizzaHutCheesePizza.java $version 2015. 9. 5.
 *
 * Copyright 2015 NHN Ent. All rights Reserved. 
 * NHN PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */

package com.cdg.study.factory;

/**
 * 치즈피자. 원재료 공장이 어디냐에 따라 다른 스타일의 피자가 만들어진다.
 * 
 * @author Kanghoon Choi
 */
public class CheesePizza extends Pizza {

	private PizzaIngredientFactory ingredientFactory;
	
	public CheesePizza(PizzaIngredientFactory ingredientFactory) {
		this.ingredientFactory = ingredientFactory;
	}

	@Override
	public void prepare() {
		System.out.println("준비 " + name);
		
		dough = ingredientFactory.createDough();
		sauce = ingredientFactory.createSauce();
		cheese = ingredientFactory.createCheese();
	}
}
