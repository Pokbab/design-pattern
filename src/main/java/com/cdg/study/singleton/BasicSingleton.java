/*
 * @(#)BasicSingleton.java $version 2015. 8. 14.
 *
 * Copyright 2015 NHN Ent. All rights Reserved. 
 * NHN PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */

package com.cdg.study.singleton;


/**
 * 싱글스레드인 경우 사용할수 있는 싱글턴 기본패턴
 * 
 * @author Kanghoon Choi
 */
public class BasicSingleton {
	/**
	 * 유일한 객체를 저장하기 위한 정적변수
	 */
	private static BasicSingleton instance;
	
	/**
	 * private 생성자로 new를 통한 객체생성을 봉쇄
	 */
	private BasicSingleton() {
		
	}
	
	/**
	 * 어디에서든 접근이 가능하다.
	 * 늦은초기화(필요할때 객체생성)
	 * 
	 * @return
	 */
	public static BasicSingleton getInstance() {
		if (instance == null) {
			instance = new BasicSingleton();
		}
		return instance;
	}
}
