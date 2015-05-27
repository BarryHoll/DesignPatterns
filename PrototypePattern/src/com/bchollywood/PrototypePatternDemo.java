package com.bchollywood;

public class PrototypePatternDemo {

	public static void main(String[] args) {
		ShapeCache.loadCache();
		
		Shape clonedShape01 = (Shape) ShapeCache.getShape("01");
		System.out.println("Shape is a " + clonedShape01.getType());
		
		Shape clonedShape02 = (Shape) ShapeCache.getShape("02");
		System.out.println("Shape is a " + clonedShape01.getType());
		
		Shape clonedShape03 = (Shape) ShapeCache.getShape("03");
		System.out.println("Shape is a " + clonedShape01.getType());
	}

}
