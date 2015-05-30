package com.bchollywood;

public class BridgePatternDemo {

	public static void main(String[] args) {

		Building bungalow = new House(3,2, new Bungalow());
		Building twoStory = new House(4, 4, new TwoStory());
		
		bungalow.build();
		twoStory.build();

	}

}
