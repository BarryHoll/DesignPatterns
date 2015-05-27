package com.bchollywood;

import java.util.Hashtable;

public class ShapeCache {
	
	private static Hashtable<String, Shape> shapeMap = new Hashtable<String, Shape>();
	
	public static Shape getShape(String shapeId) {
		Shape cachedShape = shapeMap.get(shapeId);
		return (Shape) cachedShape.clone();
	}
	
	// Do some expensive shape creation operation,
	// then put the shape into shapeMap.
	public static void loadCache() {
		Star star = new Star();
		star.setId("01");
		shapeMap.put(star.getId(), star);
		
		Crescent crescent = new Crescent();
		crescent.setId("02");
		shapeMap.put(crescent.getId(), crescent);
		
		Triangle triangle = new Triangle();
		triangle.setId("03");
		shapeMap.put(triangle.getId(), triangle);
	}

}
