package com.cdg.study.observer.weather;

/**
 * 관찰대상자
 * 옵저버로의 등록, 제거, 안내를 담당한다.
 * 
 * @author Kanghoon Choi
 */
public interface Subject {

	/**
	 * 옵저버를 등록한다
	 * 
	 * @param observer
	 */
	public void registerObserver(Observer observer);

	/**
	 * 옵저버를 제거한다
	 * 
	 * @param observer
	 */
	public void removeObserver(Observer observer);

	/**
	 * 옵저버들에게 통지한다
	 */
	public void notifyObservers();
}
