package com.cdg.study.factory;

import com.cdg.study.factory.ingredient.BlackOlives;
import com.cdg.study.factory.ingredient.Cheese;
import com.cdg.study.factory.ingredient.Clams;
import com.cdg.study.factory.ingredient.Dough;
import com.cdg.study.factory.ingredient.Eggplant;
import com.cdg.study.factory.ingredient.FrozenClams;
import com.cdg.study.factory.ingredient.MozzarellaCheese;
import com.cdg.study.factory.ingredient.Pepperoni;
import com.cdg.study.factory.ingredient.PlumTomatoSauce;
import com.cdg.study.factory.ingredient.Sauce;
import com.cdg.study.factory.ingredient.SlicedPepperoni;
import com.cdg.study.factory.ingredient.Spinach;
import com.cdg.study.factory.ingredient.ThickCrustDough;
import com.cdg.study.factory.ingredient.Veggies;

/**
 * 피자헛 원재료 공장
 * 
 * @author Kanghoon Choi
 */
public class DominoPizzaIngredientFactory implements PizzaIngredientFactory {

	public Dough createDough() {
		return new ThickCrustDough();
	}

	public Sauce createSauce() {
		return new PlumTomatoSauce();
	}

	public Cheese createCheese() {
		return new MozzarellaCheese();
	}

	public Veggies[] createVeggies() {
		Veggies veggies[] = {new BlackOlives(), new Spinach(), new Eggplant()};
		return veggies;
	}

	public Pepperoni createPepperoni() {
		return new SlicedPepperoni();
	}

	public Clams createClam() {
		return new FrozenClams();
	}
}
