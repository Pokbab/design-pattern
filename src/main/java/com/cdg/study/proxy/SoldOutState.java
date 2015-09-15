package com.cdg.study.proxy;

public class SoldOutState implements State {

	private GumballMachine gumballMachine;

	public SoldOutState(GumballMachine gumballMachine) {
		this.gumballMachine = gumballMachine;
	}

	@Override
	public void insertQuarter() {
		System.out.println("캡슐이 매진되었습니다.");
	}

	@Override
	public void ejectQuarter() {
		System.out.println("캡슐이 매진되었습니다.");
	}

	@Override
	public void turnCrank() {
		System.out.println("캡슐이 매진되었습니다.");
	}

	@Override
	public void dispense() {
		System.out.println("캡슐이 매진되었습니다.");
	}

	@Override
	public String toString() {
		return "매진";
	}
}
