package com.cdg.study.decorator;

public class DarkRoast extends Beverage {

	public DarkRoast() {
		super.description = "Dark Roast Coffee";
	}

	public double cost() {
		return .99;
	}
}
