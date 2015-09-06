package com.cdg.study.iterator;

import java.util.Iterator;


/**
 * 종업원 입장에서는 각 메뉴에 대해서 반복문을 돌려야함
 * 
 * @author Kanghoon Choi
 */
public class Waitress {
	private Menu pancakeHouseMenu;
	private Menu dinerMenu;
 
	public Waitress(Menu pancakeHouseMenu, Menu dinerMenu) {
		this.pancakeHouseMenu = pancakeHouseMenu;
		this.dinerMenu = dinerMenu;
	}
 
	public void printMenu() {
		Iterator<MenuItem> breakfastIterator = pancakeHouseMenu.createIterator();
		Iterator<MenuItem> dinerIterator = dinerMenu.createIterator();
		
		System.out.println("MENU\n----\nBREAKFAST");
		printMenu(breakfastIterator);
		System.out.println("\nLUNCH");
		printMenu(dinerIterator);
	}
	
	private void printMenu(Iterator<MenuItem> iterator) {
		while (iterator.hasNext()) {
			MenuItem menuItem = (MenuItem)iterator.next();
			System.out.print(menuItem.getName() + ", ");
			System.out.print(menuItem.getPrice() + " -- ");
			System.out.println(menuItem.getDescription());
		}
	}
}
