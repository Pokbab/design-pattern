/*
 * @(#)BasicSingleton.java $version 2015. 8. 14.
 *
 * Copyright 2015 NHN Ent. All rights Reserved. 
 * NHN PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */

package com.cdg.study.singleton;


/**
 * 멀티스레드인 경우 사용할수 있는 싱글턴 패턴
 * 
 * @author Kanghoon Choi
 */
public class MultiThreadSingleton {
	/**
	 * private 생성자로 new를 통한 객체생성을 봉쇄
	 */
	private MultiThreadSingleton() {
	}
	
/*	
	// 1. 동기화하면 성능이 100배정도 저하됨. 속도가 중요하지 않으면 사용할만함.

	private static MultiThreadSingleton instance;

	public synchronized static MultiThreadSingleton getInstance() {
		if (instance == null) {
			instance = new MultiThreadSingleton();
		}
		return instance;
	}
*/
	
/*	
	// 2. 늦은초기화를 안해도 된다면 이방법을 사용.

	private static MultiThreadSingleton instance = new MultiThreadSingleton();

	public static MultiThreadSingleton getInstance() {
		return instance;
	}
*/	
	
	// 3. DCL(Double-checking Locking)을 써서 동기화되는 부분을 줄임. JDK1.4이상버전만 사용가능.
	/**
	 * volatile : 동기화를 변수접근에 한정해서 적용
	 */
	private volatile static MultiThreadSingleton instance;
	
	/**
	 * 늦은초기화(필요할때 객체생성)를 쓰면서 동기화에 대한 성능문제를 개선한 버전
	 * 
	 * @return
	 */
	public static MultiThreadSingleton getInstance() {
		if (instance == null) {
			synchronized (MultiThreadSingleton.class) {
				if (instance == null) {
					instance = new MultiThreadSingleton();
				}
			}
		}
		return instance;
	}
}
