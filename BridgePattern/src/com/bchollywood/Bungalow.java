package com.bchollywood;

public class Bungalow implements BuildAPI {

	@Override
	public void buildHouse(int bedrooms, int bathrooms) {
		System.out.println("Building a bungalow with " + bedrooms + " bedrooms and " + bathrooms + " bathrooms.");
	}

}
