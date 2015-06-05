package com.bchollywood;

import java.util.Scanner;

public class MonsterApp {

	public static void main(String[] args) {
		
		MonsterFactory monsterFactory = new MonsterFactory();
		String monsterType = "";
		Monster yourMonster = null;
		Scanner userInput = new Scanner(System.in);
		System.out.println("So you want a Monster, eh?");
		
		do {
			System.out.println("Choose'W', 'V', or 'Z'. (X to Exit)");
			monsterType = userInput.nextLine();
			yourMonster = monsterFactory.makeMonster(monsterType);
			if(monsterType.equalsIgnoreCase("X")){
				System.out.println("Fare thee well!");
			} else if (yourMonster==null) {
				System.out.println("Please choose 'W', 'V', or 'Z' next time.");
				System.out.println("");
			} else {
				doMonsterMoves(yourMonster);
				System.out.println("");
			}
		} while (!monsterType.equalsIgnoreCase("X"));

	}
	
	private static void doMonsterMoves(Monster aMonster) {
		aMonster.stalk();
		aMonster.attack();
		aMonster.party();
	}

}
