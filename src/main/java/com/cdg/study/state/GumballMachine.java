package com.cdg.study.state;

public class GumballMachine {

	private State soldOutState;
	private State noQuarterState;
	private State hasQuarterState;
	private State soldState;
	private State winnerState;

	private State state = soldOutState;
	int count = 0;

	public GumballMachine(int numberGumballs) {
		soldOutState = new SoldOutState(this);
		noQuarterState = new NoQuarterState(this);
		hasQuarterState = new HasQuarterState(this);
		soldState = new SoldState(this);
		winnerState = new WinnerState(this);

		this.count = numberGumballs;
		if (numberGumballs > 0) {
			state = noQuarterState;
		}
	}

	/**
	 * 동전 투입
	 */
	public void insertQuarter() {
		state.insertQuarter();
	}

	/**
	 * 동전 반환
	 */
	public void ejectQuarter() {
		state.ejectQuarter();
	}

	/**
	 * 손잡이 돌리기
	 */
	public void turnCrank() {
		state.turnCrank();
		state.dispense();
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
		state = noQuarterState;
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

	public String toString() {
		StringBuffer result = new StringBuffer();
		result.append("\n마이티 캡슐, Inc.");
		result.append("\nJava-enabled Standing Gumball Model #2015");
		result.append("\n목록 : " + count + "개");
		result.append("\n뽑기기계 상태 : " + state + "\n");
		return result.toString();
	}
}
