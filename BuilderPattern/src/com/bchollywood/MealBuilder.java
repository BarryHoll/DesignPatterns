package com.bchollywood;

public class MealBuilder {
	
	public Meal prepareCheeseMeal() {
		Meal meal = new Meal();
		meal.addItem(new CheeseSandwich());
		meal.addItem(new Tea());
		return meal;
	}

	public Meal prepareHamMeal() {
		Meal meal = new Meal();
		meal.addItem(new HamSandwich());
		meal.addItem(new Coffee());
		return meal;
	}
}
