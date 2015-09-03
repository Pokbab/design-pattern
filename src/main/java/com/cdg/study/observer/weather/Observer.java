package com.cdg.study.observer.weather;

/**
 * 옵저버가 될 가능성이 있는 클래스는 모두 옵저버 인터페이스를 구현해야함
 * 
 * @author Kanghoon Choi
 */
public interface Observer {

	/**
	 * 주제의 상태가 바뀌었을때 호출된다.
	 * 기상정보가 변경되었을때 옵저버에게 아래 값들이 전달됨
	 * 
	 * @param temp 온도
	 * @param humidity 습도
	 * @param pressure 기압
	 */
	public void update(float temp, float humidity, float pressure);
}
