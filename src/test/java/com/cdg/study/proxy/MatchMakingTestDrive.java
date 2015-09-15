package com.cdg.study.proxy;

import java.lang.reflect.Proxy;
import java.util.Hashtable;

import com.cdg.study.proxy.protection.NonOwnerInvocationHandler;
import com.cdg.study.proxy.protection.OwnerInvocationHandler;
import com.cdg.study.proxy.protection.Person;
import com.cdg.study.proxy.protection.PersonImpl;

/**
 * java.lang.reflect.Proxy를 사용한 동적프록시(dynamic proxy)를 활용한 보호프록시 예제코드
 * 
 * @author Kanghoon Choi
 */
public class MatchMakingTestDrive {

	private Hashtable<String, Person> datingDB = new Hashtable<>();

	public static void main(String[] args) {
		new MatchMakingTestDrive().drive();
	}

	public MatchMakingTestDrive() {
		initializeDatabase();
	}
	
	/**
	 * DB 초기화
	 */
	private void initializeDatabase() {
		Person hong = new PersonImpl();
		hong.setName("홍길동");
		hong.setInterests("자동차, 컴퓨터, 음악");
		hong.setHotOrNotRating(7);
		datingDB.put(hong.getName(), hong);

		Person young = new PersonImpl();
		young.setName("영희");
		young.setInterests("요리, 영화, 음악");
		young.setHotOrNotRating(6);
		datingDB.put(young.getName(), young);
	}

	public void drive() {
		Person hong = getPersonFromDatabase("홍길동");
		Person ownerProxy = getOwnerProxy(hong);
		System.out.println("이름 : " + ownerProxy.getName());
		ownerProxy.setInterests("볼링");
		System.out.println("관심분야 세팅 from 본인프록시");
		try {
			ownerProxy.setHotOrNotRating(10);
		} catch (Exception e) {
			System.out.println("본인 프록시에서는 선호도를 세팅할 수 없습니다.");
		}
		System.out.println("선호도 :  " + ownerProxy.getHotOrNotRating());

		Person nonOwnerProxy = getNonOwnerProxy(hong);
		System.out.println("이름 : " + nonOwnerProxy.getName());
		try {
			nonOwnerProxy.setInterests("볼링");
		} catch (Exception e) {
			System.out.println("타인 프록시에서는 관심분야를 세팅할 수 없습니다.");
		}
		nonOwnerProxy.setHotOrNotRating(3);
		System.out.println("선호도 세팅 from 타인프록시");
		System.out.println("선호도 :  " + nonOwnerProxy.getHotOrNotRating());
	}

	private Person getOwnerProxy(Person person) {

		return (Person)Proxy.newProxyInstance(person.getClass().getClassLoader(), person.getClass().getInterfaces(), new OwnerInvocationHandler(person));
	}

	private Person getNonOwnerProxy(Person person) {

		return (Person)Proxy.newProxyInstance(person.getClass().getClassLoader(), person.getClass().getInterfaces(), new NonOwnerInvocationHandler(person));
	}

	private Person getPersonFromDatabase(String name) {
		return (Person)datingDB.get(name);
	}
}
