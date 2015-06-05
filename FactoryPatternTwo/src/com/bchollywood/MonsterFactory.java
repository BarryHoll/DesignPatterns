package com.bchollywood;

public class MonsterFactory {
	
	public Monster makeMonster(String monsterType) {
		
		if(monsterType.equalsIgnoreCase("V")){
			return new Wamphryi();
		} else if (monsterType.equalsIgnoreCase("W")) {
			return new Wolfen();
		} else if (monsterType.equalsIgnoreCase("Z")) {
			return new WalkingDead();
		} else return null;
		
	}

}
