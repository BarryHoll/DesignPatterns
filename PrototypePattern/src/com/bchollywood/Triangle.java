package com.bchollywood;

public class Triangle extends Shape {
	
	public Triangle() {
		type = "Triangle";
	}

	@Override
	void draw() {
		System.out.println("In Triangle's draw() method.");
	}

}
