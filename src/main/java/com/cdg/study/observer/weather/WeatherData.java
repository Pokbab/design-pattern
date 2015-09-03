package com.cdg.study.observer.weather;

import java.util.*;

/**
 * 기상스테이션의 데이터를 나타냄
 * 
 * @author Kanghoon Choi
 */
public class WeatherData extends Observable {
	private float temperature;	// 온도
	private float humidity;		// 습도
	private float pressure;		// 기압

	/**
	 * 기상스테이션으로부터 갱신된 측정치를 받으면 옵저버들에게 알린다.
	 */
	public void measurementsChanged() {
		setChanged();
		notifyObservers();
	}

	public void setMeasurements(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		measurementsChanged();
	}

	public float getTemperature() {
		return temperature;
	}

	public float getHumidity() {
		return humidity;
	}

	public float getPressure() {
		return pressure;
	}
}
