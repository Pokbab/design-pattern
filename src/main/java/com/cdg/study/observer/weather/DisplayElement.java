package com.cdg.study.observer.weather;

/**
 * 디스플레이를 구현해야하는 항목에서는 해당 인터페이스만 구현하면됨
 * 
 * @author Kanghoon Choi
 */
public interface DisplayElement {

	/**
	 * 데이터를 출력한다
	 */
	public void display();
}
