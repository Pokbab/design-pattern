package com.cdg.study.iterator;

/**
 * 반복문을 캡슐화하기 위한 이터레이터
 * 
 * @author Kanghoon Choi
 */
public interface Iterator {

	boolean hasNext();

	Object next();
}
