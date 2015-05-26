package com.bchollywood;

public class BuilderPatternDemo {

	public static void main(String[] args) {

		MealBuilder mealBuilder = new MealBuilder();
		
		Meal cheeseMeal = mealBuilder.prepareCheeseMeal();
		System.out.println("Cheese Meal");
		cheeseMeal.showItems();
		System.out.println("Total cost: " + cheeseMeal.getCost());
		
		Meal hamMeal = mealBuilder.prepareHamMeal();
		System.out.println("Ham Meal");
		hamMeal.showItems();
		System.out.println("Total cost: " + hamMeal.getCost());
	}

}
