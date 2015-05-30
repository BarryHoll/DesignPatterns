package com.bchollywood;

public class Bungalo implements BuildAPI {

	@Override
	public void buildHouse(int bedrooms, int bathrooms) {
		System.out.println("Building a bungalo with " + bedrooms + " bedrooms and " + bathrooms + " bathrooms.");
	}

}
