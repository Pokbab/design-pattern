package com.cdg.study.proxy;


public class GumballMonitor {

	private GumballMachine machine;

	public GumballMonitor(GumballMachine machine) {
		this.machine = machine;
	}

	public void report() {
		System.out.println("뽑기 기계 : " + machine.getLocation());
		System.out.println("현재 목록 : " + machine.getCount() + "개");
		System.out.println("현재 상태 : " + machine.getState());
	}
}
