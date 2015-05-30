package com.bchollywood;

public class BridgePatternDemo {

	public static void main(String[] args) {

		Building bungalo = new House(3,2, new Bungalo());
		Building twoStory = new House(4, 4, new TwoStory());
		
		bungalo.build();
		twoStory.build();

	}

}
