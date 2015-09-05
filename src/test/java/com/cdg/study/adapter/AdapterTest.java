/*
 * @(#)AdapterTest.java $version 2015. 8. 14.
 *
 * Copyright 2015 NHN Ent. All rights Reserved. 
 * NHN PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */

package com.cdg.study.adapter;

import org.junit.Test;

/**
 * @author Kanghoon Choi
 */
public class AdapterTest {

	@Test
	public void test() throws Exception {
		MallardDuck duck = new MallardDuck();

		WildTurkey turkey = new WildTurkey();
		Duck turkeyAdapter = new TurkeyAdapter(turkey);

		System.out.println("The Turkey says...");
		turkey.gobble();
		turkey.fly();

		System.out.println("\nThe Duck says...");
		duck.quack();
		duck.fly();

		System.out.println("\nThe TurkeyAdapter says...");
		turkeyAdapter.quack();
		turkeyAdapter.fly();

		Turkey duckAdapter = new DuckAdapter(duck);

		for (int i = 0; i < 10; i++) {
			System.out.println("The DuckAdapter says...");
			duckAdapter.gobble();
			duckAdapter.fly();
		}
	}
}
