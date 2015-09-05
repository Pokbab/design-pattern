package com.cdg.study.adapter;

/**
 * 야생 칠면조
 * 
 * @author Kanghoon Choi
 */
public class WildTurkey implements Turkey {
	public void gobble() {
		System.out.println("구룩구룩!!");
	}
 
	public void fly() {
		System.out.println("푸드득!(살짝 날수있음)");
	}
}
