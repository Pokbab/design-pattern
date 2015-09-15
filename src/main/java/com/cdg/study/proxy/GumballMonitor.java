package com.cdg.study.proxy;

import java.rmi.RemoteException;


public class GumballMonitor {

	private GumballMachineRemote machine;

	public GumballMonitor(GumballMachineRemote machine) {
		this.machine = machine;
	}

	public void report() {
		try {
			System.out.println("뽑기 기계 : " + machine.getLocation());
			System.out.println("현재 목록 : " + machine.getCount() + "개");
			System.out.println("현재 상태 : " + machine.getState());
		} catch(RemoteException e) {
			e.printStackTrace();
		}
	}
}
