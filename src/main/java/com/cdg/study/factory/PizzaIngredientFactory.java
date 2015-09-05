package com.cdg.study.factory;

import com.cdg.study.factory.ingredient.Cheese;
import com.cdg.study.factory.ingredient.Clams;
import com.cdg.study.factory.ingredient.Dough;
import com.cdg.study.factory.ingredient.Pepperoni;
import com.cdg.study.factory.ingredient.Sauce;
import com.cdg.study.factory.ingredient.Veggies;

/**
 * 피자 원재료 공장
 * 
 * @author Kanghoon Choi
 */
public interface PizzaIngredientFactory {
 
	public Dough createDough();
	public Sauce createSauce();
	public Cheese createCheese();
	public Veggies[] createVeggies();
	public Pepperoni createPepperoni();
	public Clams createClam();
 
}
