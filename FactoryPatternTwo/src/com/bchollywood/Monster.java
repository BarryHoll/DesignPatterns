package com.bchollywood;

public abstract class Monster {
	
	private String name;
	private String attackDescription;
	private String partyProfile;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getAttackDescription() {
		return attackDescription;
	}
	
	public void setAttackDescription(String attackDescription) {
		this.attackDescription = attackDescription;
	}
	
	public String getPartyProfile() {
		return partyProfile;
	}
	
	public void setPartyProfile(String partyProfile) {
		this.partyProfile = partyProfile;
	}
	
	public void attack() {
		System.out.println("The " + getName() + " " + getAttackDescription());
	}
	
	public void stalk() {
		System.out.println("The " + getName() + " stalks its prey.");
	}
	
	public void party() {
		System.out.println("The " + getName() + " likes to " + getPartyProfile());
	}
	

}
