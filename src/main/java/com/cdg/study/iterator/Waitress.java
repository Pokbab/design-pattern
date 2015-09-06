package com.cdg.study.iterator;

import java.util.List;

/**
 * 종업원 입장에서는 각 메뉴에 대해서 반복문을 돌려야함
 * 
 * @author Kanghoon Choi
 */
public class Waitress {
	private PancakeHouseMenu pancakeHouseMenu;
	private DinerMenu dinerMenu;
 
	public Waitress(PancakeHouseMenu pancakeHouseMenu, DinerMenu dinerMenu) {
		this.pancakeHouseMenu = pancakeHouseMenu;
		this.dinerMenu = dinerMenu;
	}
 
	public void printMenu() {
		List<MenuItem> breakfastItems = pancakeHouseMenu.getMenuItems();
		System.out.println("MENU\n----\nBREAKFAST");
		for (int i = 0; i < breakfastItems.size(); i++) {
			MenuItem menuItem = breakfastItems.get(i);
			System.out.print(menuItem.getName() + ", ");
			System.out.print(menuItem.getPrice() + " -- ");
			System.out.println(menuItem.getDescription());
		}
		
		MenuItem[] lunchItems = dinerMenu.getMenuItems();
		System.out.println("\nLUNCH");
		for (int i = 0; i < lunchItems.length; i++) {
			MenuItem menuItem = lunchItems[i];
			System.out.print(menuItem.getName() + ", ");
			System.out.print(menuItem.getPrice() + " -- ");
			System.out.println(menuItem.getDescription());
		}
	}
}
