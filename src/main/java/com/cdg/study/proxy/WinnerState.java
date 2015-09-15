package com.cdg.study.proxy;

public class WinnerState implements State {

	private GumballMachine gumballMachine;

	public WinnerState(GumballMachine gumballMachine) {
		this.gumballMachine = gumballMachine;
	}

	@Override
	public void insertQuarter() {
		System.out.println("기다려주세요, 캡슐이 나오는중입니다.");
	}

	@Override
	public void ejectQuarter() {
		System.out.println("기다려주세요, 캡슐이 나오는중입니다.");
	}

	@Override
	public void turnCrank() {
		System.out.println("돌려도 다른 캡슐이 나오지 않습니다.");
	}

	@Override
	public void dispense() {
		System.out.println("축하드립니다! 1+1 당첨! 캡슐을 1개 더 꺼내주세요!");
		gumballMachine.releaseBall();
		if (gumballMachine.getCount() == 0) {
			gumballMachine.setState(gumballMachine.getSoldOutState());
		} else {
			gumballMachine.releaseBall();
			if (gumballMachine.getCount() > 0) {
				gumballMachine.setState(gumballMachine.getNoQuarterState());
			} else {
				System.out.println("캡슐이 없습니다..!");
				gumballMachine.setState(gumballMachine.getSoldOutState());
			}
		}
	}

	@Override
	public String toString() {
		return "despensing two gumballs for your quarter, because YOU'RE A WINNER!";
	}
}
