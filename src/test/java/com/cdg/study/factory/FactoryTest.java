package com.cdg.study.factory;

import static org.junit.Assert.*;

import org.junit.Test;

public class FactoryTest {

	@Test
	public void test() throws Exception {
		PizzaStore pizzaHut = new PizzaHut();
		PizzaStore dominoPizza = new DominoPizza();

		Pizza pizza = pizzaHut.orderPizza("cheese");
		System.out.println("강훈이가 주문한 피자 : " + pizza.getName() + "\n");

		pizza = dominoPizza.orderPizza("cheese");
		System.out.println("준하가 주문한 피자 " + pizza.getName() + "\n");

		pizza = pizzaHut.orderPizza("pepperoni");
		System.out.println("강훈이가 주문한 피자 : " + pizza.getName() + "\n");

		pizza = dominoPizza.orderPizza("pepperoni");
		System.out.println("준하가 주문한 피자 " + pizza.getName() + "\n");
	}
}
