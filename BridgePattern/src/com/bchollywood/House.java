package com.bchollywood;

public class House extends Building {
	
	private int bedrooms, bathrooms;
	
	public House(int bedrooms, int bathrooms, BuildAPI buildAPI){
		super(buildAPI);
		this.bedrooms = bedrooms;
		this.bathrooms = bathrooms;
	}

	@Override
	public void build() {
		buildAPI.buildHouse(bedrooms, bathrooms);
	}

}
