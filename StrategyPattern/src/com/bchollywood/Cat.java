package com.bchollywood;

public class Cat extends Creature {
	
	public Cat() {
		super();
		setSound("Meow");
		flyingSkills = new CantFly();
	}

}
