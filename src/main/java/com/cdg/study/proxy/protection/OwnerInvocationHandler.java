package com.cdg.study.proxy.protection;

import java.lang.reflect.*;

/**
 * 본인을 위한 호출핸들러
 * 
 * InvocationHandler : 프록시의 행동을 구현
 * 
 * @author Kanghoon Choi
 */
public class OwnerInvocationHandler implements InvocationHandler {

	private Person person;

	public OwnerInvocationHandler(Person person) {
		this.person = person;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws IllegalAccessException {

		try {
			if (method.getName().startsWith("get")) {
				return method.invoke(person, args);
			} else if (method.getName().equals("setHotOrNotRating")) {
				throw new IllegalAccessException();
			} else if (method.getName().startsWith("set")) {
				return method.invoke(person, args);
			}
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}
		return null;
	}
}
