package com.cdg.study.proxy;

public class SoldState implements State {
 
	private GumballMachine gumballMachine;
 
    public SoldState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }
      
    @Override
	public void insertQuarter() {
		System.out.println("기다려주세요. 캡슐이 나가고있습니다.");
	}
 
    @Override
	public void ejectQuarter() {
		System.out.println("이미 캡슐을 뽑으셨습니다.");
	}
 
    @Override
	public void turnCrank() {
		System.out.println("손잡이는 한번만 돌려주세요.");
	}
 
    @Override
	public void dispense() {
		gumballMachine.releaseBall();
		if (gumballMachine.getCount() > 0) {
			gumballMachine.setState(gumballMachine.getNoQuarterState());
		} else {
			System.out.println("캡슐이 없습니다..!");
			gumballMachine.setState(gumballMachine.getSoldOutState());
		}
	}
 
    @Override
	public String toString() {
		return "캡슐 반환";
	}
}


