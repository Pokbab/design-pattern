package com.cdg.study.factory;

import java.util.ArrayList;
import java.util.List;

import com.cdg.study.factory.ingredient.Cheese;
import com.cdg.study.factory.ingredient.Clams;
import com.cdg.study.factory.ingredient.Dough;
import com.cdg.study.factory.ingredient.Pepperoni;
import com.cdg.study.factory.ingredient.Sauce;
import com.cdg.study.factory.ingredient.Veggies;

/**
 * 제품 클래스.
 * 
 * @author Kanghoon Choi
 */
public abstract class Pizza {

	protected String name;	// 피자이름
	protected Dough dough;	// 도우
	protected Sauce sauce;	// 소스
	protected Veggies veggies[];
	protected Cheese cheese;
	protected Pepperoni pepperoni;
	protected Clams clams;
	protected List<String> toppings = new ArrayList<>();

	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public abstract void prepare();

	public void bake() {
		System.out.println("굽는중 " + name);
	}

	public void cut() {
		System.out.println("커팅 " + name);
	}

	public void box() {
		System.out.println("포장 " + name);
	}

	public String toString() {
		StringBuffer display = new StringBuffer();
		display.append("---- " + name + " ----\n");
		display.append(dough + "\n");
		display.append(sauce + "\n");
		for (String topping : toppings) {
			display.append(topping + "\n");
		}
		
		return display.toString();
	}
}
