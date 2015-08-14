package com.cdg.study.facade;

import static org.junit.Assert.*;

import org.junit.Test;



public class FacadeTest {
	@Test
	public void test() throws Exception {
		Car car = new Car();
		car.start(new Key());
	}
}
