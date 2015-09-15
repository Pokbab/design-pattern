package com.cdg.study.proxy;

import java.io.Serializable;

/**
 * 짐볼머신의 상태를 표현
 * 
 * @author Kanghoon Choi
 */
public interface State extends Serializable {

	/**
	 * 동전 삽입
	 */
	public void insertQuarter();

	/**
	 * 동전 반환
	 */
	public void ejectQuarter();

	/**
	 * 손잡이 돌리기
	 */
	public void turnCrank();

	/**
	 * 캡슐 배출
	 */
	public void dispense();
}
