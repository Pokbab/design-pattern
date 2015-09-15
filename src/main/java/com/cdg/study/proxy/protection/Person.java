package com.cdg.study.proxy.protection;

public interface Person {

	String getName();

	String getGender();

	String getInterests();

	int getHotOrNotRating();

	void setName(String name);

	void setGender(String gender);

	/**
	 * 관심분야를 세팅한다
	 * 
	 * @param interests
	 */
	void setInterests(String interests);

	/**
	 * 선호도를 계산한다
	 * 
	 * @param rating
	 */
	void setHotOrNotRating(int rating);

}
