package com.bchollywood;

public class Bird extends Creature {
	
	public Bird() {
		super();
		setSound("Tweet");
		flyingSkills = new CanFly();
	}

}
