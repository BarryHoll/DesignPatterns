package com.bchollywood;

public class FlyingCreatureCheck {

	public static void main(String[] args) {

		Creature cat = new Cat();
		Creature bird = new Bird();
		Creature fish = new Fish();
		
		System.out.println("Can you fly?");
		System.out.println("Cat says: " + cat.tryToFly());
		System.out.println("Bird says: " + bird.tryToFly());
		System.out.println("Fish says: " + fish.tryToFly());
		
		fish.setFlyingSkills(new CanFly());
		System.out.println("Fish says: Actually, it seems that I can " + fish.tryToFly());

	}

}
