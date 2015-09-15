package com.cdg.study.proxy;
import java.rmi.*;

/**
 * 테스트를 위한 RMI 레지스트리 등록
 * rmiregistry를 콘솔에서 실행 후 돌려야함
 * 
 * @author Kanghoon Choi
 */
public class GumballMachineTestDrive {
 
	public static void main(String[] args) {
		try {
			String location = "127.0.0.1";
			int count = 100;
			
			GumballMachine gumballMachine = new GumballMachine(location, count);
			Naming.rebind("//" + location + "/gumballmachine", gumballMachine);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
