/*
 * @(#)PizzaHutCheesePizza.java $version 2015. 9. 5.
 *
 * Copyright 2015 NHN Ent. All rights Reserved. 
 * NHN PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */

package com.cdg.study.factory;

/**
 * @author Kanghoon Choi
 */
public class PizzaHutCheesePizza extends Pizza {

	public PizzaHutCheesePizza() {
		name = "피자헛 치즈 피자";
		dough = "얇은 크러스트 도우";
		sauce = "Marinara Sauce";

		toppings.add("Grated Reggiano Cheese");
	}
}
