package com.bchollywood;

public class Fish extends Creature {
	
	public Fish() {
		super();
		setSound("Bob<silently>");
		flyingSkills = new DefinitelyCantFly();
	}

}
