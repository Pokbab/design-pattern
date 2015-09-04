package com.cdg.study.factory;

import java.util.ArrayList;
import java.util.List;

public abstract class Pizza {

	protected String name;	// 피자이름
	protected String dough;	// 도우
	protected String sauce;	// 소스
	protected List<String> toppings = new ArrayList<>();

	public String getName() {
		return name;
	}

	public void prepare() {
		System.out.println("준비 " + name);
	}

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
