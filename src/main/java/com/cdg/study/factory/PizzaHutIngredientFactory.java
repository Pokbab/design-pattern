package com.cdg.study.factory;

import com.cdg.study.factory.ingredient.Cheese;
import com.cdg.study.factory.ingredient.Clams;
import com.cdg.study.factory.ingredient.Dough;
import com.cdg.study.factory.ingredient.FreshClams;
import com.cdg.study.factory.ingredient.Garlic;
import com.cdg.study.factory.ingredient.MarinaraSauce;
import com.cdg.study.factory.ingredient.Mushroom;
import com.cdg.study.factory.ingredient.Onion;
import com.cdg.study.factory.ingredient.Pepperoni;
import com.cdg.study.factory.ingredient.RedPepper;
import com.cdg.study.factory.ingredient.ReggianoCheese;
import com.cdg.study.factory.ingredient.Sauce;
import com.cdg.study.factory.ingredient.SlicedPepperoni;
import com.cdg.study.factory.ingredient.ThinCrustDough;
import com.cdg.study.factory.ingredient.Veggies;

/**
 * 피자헛 원재료 공장
 * 
 * @author Kanghoon Choi
 */
public class PizzaHutIngredientFactory implements PizzaIngredientFactory {
 
	public Dough createDough() {
		return new ThinCrustDough();
	}
 
	public Sauce createSauce() {
		return new MarinaraSauce();
	}
 
	public Cheese createCheese() {
		return new ReggianoCheese();
	}
 
	public Veggies[] createVeggies() {
		Veggies veggies[] = { new Garlic(), new Onion(), new Mushroom(), new RedPepper() };
		return veggies;
	}
 
	public Pepperoni createPepperoni() {
		return new SlicedPepperoni();
	}

	public Clams createClam() {
		return new FreshClams();
	}
}
