package com.bchollywood;

public class Star extends Shape {
	
	public Star() {
		type = "Star";
	}

	@Override
	void draw() {
		System.out.println("In Star's draw() method.");
	}

}
