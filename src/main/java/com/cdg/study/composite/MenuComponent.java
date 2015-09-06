package com.cdg.study.composite;


/**
 * 메뉴/메뉴항목 구조를 만들기위한 추상컴포넌트.
 * 어떤건 메뉴에서만 쓰이고, 어떤건 메뉴항목에서만 쓰이기때문에 기본적으로 UnsupportedOperationException를 발생시킴
 * 
 * @author Kanghoon Choi
 */
public abstract class MenuComponent {

	public void add(MenuComponent menuComponent) {
		throw new UnsupportedOperationException();
	}

	public void remove(MenuComponent menuComponent) {
		throw new UnsupportedOperationException();
	}

	public MenuComponent getChild(int i) {
		throw new UnsupportedOperationException();
	}

	public String getName() {
		throw new UnsupportedOperationException();
	}

	public String getDescription() {
		throw new UnsupportedOperationException();
	}

	public double getPrice() {
		throw new UnsupportedOperationException();
	}

	public boolean isVegetarian() {
		throw new UnsupportedOperationException();
	}

	public void print() {
		throw new UnsupportedOperationException();
	}
}
