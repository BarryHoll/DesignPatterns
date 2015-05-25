package com.bchollywood;

public class ShapeFactory extends AbstractFactory {

	@Override
	Color getColor(String color) {
		return null;
	}

	@Override
	Shape getShape(String shape) {
		if(shape==null) {
			return null;
		}
		
		if(shape.equalsIgnoreCase("CIRCLE")) {
			return new Circle();
		}
		
		if(shape.equalsIgnoreCase("SQUARE")) {
			return new Square();
		}
		
		if(shape.equalsIgnoreCase("RECTANGLE")) {
			return new Rectangle();
		}
		
		return null;
	}

}
