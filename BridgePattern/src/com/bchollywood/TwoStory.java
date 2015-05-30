package com.bchollywood;

public class TwoStory implements BuildAPI {

	@Override
	public void buildHouse(int bedrooms, int bathrooms) {
		System.out.println("Building a two story house with " + bedrooms + " bedrooms and " + bathrooms + " bathrooms.");
	}

}
