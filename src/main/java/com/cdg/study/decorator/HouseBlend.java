package com.cdg.study.decorator;

public class HouseBlend extends Beverage {

	public HouseBlend() {
		super.description = "House Blend Coffee";
	}

	public double cost() {
		return .89;
	}
}
