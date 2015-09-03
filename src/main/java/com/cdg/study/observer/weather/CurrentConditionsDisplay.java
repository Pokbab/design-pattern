package com.cdg.study.observer.weather;

/**
 * 현재 조건을 표시하는 디스플레이
 * 
 * @author Kanghoon Choi
 */
public class CurrentConditionsDisplay implements Observer, DisplayElement {

	private float temperature;
	private float humidity;
	private Subject weatherData;

	/**
	 * 디스플레이를 옵저버로 등록한다
	 * 
	 * @param weatherData
	 */
	public CurrentConditionsDisplay(Subject weatherData) {
		this.weatherData = weatherData;
		this.weatherData.registerObserver(this);
	}

	@Override
	public void update(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		display();
	}

	@Override
	public void display() {
		System.out.println("Current conditions: " + temperature + "F degrees and " + humidity + "% humidity");
	}
}
