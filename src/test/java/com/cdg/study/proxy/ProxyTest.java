package com.cdg.study.proxy;

import static org.junit.Assert.*;

import org.junit.Test;

public class ProxyTest {

	@Test
	public void test() throws Exception {
		String location = "인천";
		int count = 100;
		
		GumballMachine gumballMachine = new GumballMachine(location, count);
		GumballMonitor monitor = new GumballMonitor(gumballMachine);
		
		monitor.report();
	}
}
