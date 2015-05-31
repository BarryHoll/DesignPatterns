package com.bchollywood;

public class Creature {
	
	private String name;
	private int weight;
	private String sound;
	public Flys flyingSkills;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getWeight() {
		return weight;
	}
	
	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	public String getSound() {
		return sound;
	}
	
	public void setSound(String sound) {
		this.sound = sound;
	}
	
	public String tryToFly() {
		return flyingSkills.fly();
	}
	
	public void setFlyingSkills(Flys newFlyingSkills) {
		flyingSkills = newFlyingSkills;
	}

}
