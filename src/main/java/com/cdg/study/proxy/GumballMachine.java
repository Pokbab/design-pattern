package com.cdg.study.proxy;

public class GumballMachine {

	private State soldOutState;
	private State noQuarterState;
	private State hasQuarterState;
	private State soldState;
	private State winnerState;

	private State state = soldOutState;
	private int count = 0;
	private String location;
	
	public GumballMachine(String location, int numberGumballs) {
		this.soldOutState = new SoldOutState(this);
		this.noQuarterState = new NoQuarterState(this);
		this.hasQuarterState = new HasQuarterState(this);
		this.soldState = new SoldState(this);
		this.winnerState = new WinnerState(this);

		this.count = numberGumballs;
		if (numberGumballs > 0) {
			this.state = noQuarterState;
		}
		this.location = location;
	}

	/**
	 * 동전 투입
	 */
	public void insertQuarter() {
		this.state.insertQuarter();
	}

	/**
	 * 동전 반환
	 */
	public void ejectQuarter() {
		this.state.ejectQuarter();
	}

	/**
	 * 손잡이 돌리기
	 */
	public void turnCrank() {
		this.state.turnCrank();
		this.state.dispense();
	}

	void setState(State state) {
		this.state = state;
	}

	/**
	 * 캡슐 배출
	 */
	void releaseBall() {
		System.out.println("캡슐을 내보냈습니다...");
		if (count != 0) {
			count = count - 1;
		}
	}

	int getCount() {
		return count;
	}

	/**
	 * 충전
	 * 
	 * @param count
	 */
	void refill(int count) {
		this.count = count;
		this.state = noQuarterState;
	}

	public State getState() {
		return state;
	}

	public State getSoldOutState() {
		return soldOutState;
	}

	public State getNoQuarterState() {
		return noQuarterState;
	}

	public State getHasQuarterState() {
		return hasQuarterState;
	}

	public State getSoldState() {
		return soldState;
	}
	
	public State getWinnerState() {
		return winnerState;
	}
	
	public String getLocation() {
		return location;
	}

	public String toString() {
		StringBuffer result = new StringBuffer();
		result.append("\n마이티 캡슐, Inc.");
		result.append("\nJava-enabled Standing Gumball Model #2015");
		result.append("\n목록 : " + count + "개");
		result.append("\n뽑기기계 상태 : " + state + "\n");
		return result.toString();
	}
}
