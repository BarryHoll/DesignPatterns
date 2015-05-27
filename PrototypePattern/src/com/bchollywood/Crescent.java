package com.bchollywood;

public class Crescent extends Shape {
	
	public Crescent() {
		type = "Crescent";
	}

	@Override
	void draw() {
		System.out.println("In Crescent's draw() method.");
	}

}
