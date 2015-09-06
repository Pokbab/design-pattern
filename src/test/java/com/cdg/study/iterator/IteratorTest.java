package com.cdg.study.iterator;

import org.junit.Test;



public class IteratorTest {

	@Test
	public void test() throws Exception {
		PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        DinerMenu dinerMenu = new DinerMenu();
 
		Waitress waitress = new Waitress(pancakeHouseMenu, dinerMenu);
 
		waitress.printMenu();
	}
}
