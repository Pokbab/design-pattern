package com.cdg.study.proxy.protection;

import java.lang.reflect.*;

/**
 * 타인을 위한 호출핸들러 InvocationHandler : 프록시의 행동을 구현
 * 
 * @author Kanghoon Choi
 */
public class NonOwnerInvocationHandler implements InvocationHandler {

	private Person person;

	public NonOwnerInvocationHandler(Person person) {
		this.person = person;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws IllegalAccessException {

		try {
			if (method.getName().startsWith("get")) {
				return method.invoke(person, args);
			} else if (method.getName().equals("setHotOrNotRating")) {
				return method.invoke(person, args);
			} else if (method.getName().startsWith("set")) {
				throw new IllegalAccessException();
			}
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}
		return null;
	}
}
