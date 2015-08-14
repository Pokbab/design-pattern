/*
 * @(#)Car.java $version 2015. 8. 14.
 *
 * Copyright 2015 NHN Ent. All rights Reserved. 
 * NHN PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */

package com.cdg.study.facade;


/**
 * @author Kanghoon Choi
 */
public class Car {
	private Engine engine;
	
	private Door[] doors = new Door[2];
	
	public Car() {
		this.engine = new Engine();
		this.doors[0] = new Door();
		this.doors[1] = new Door();
	}
	
	public void start(Key key) {
		boolean authorized = key.turn();
		
		if (authorized) {
			engine.start();
			doors[0].lock();
		}
	}
}
