package com.bchollywood;

public class SingletonPatternDemo {

	public static void main(String[] args) {

		SingleObject lonely = SingleObject.getInstance();
		
		lonely.showMessage();
		
		SingleObject lonelyToo = SingleObject.getInstance();
		
		lonelyToo.showMessage();
		
		System.out.println("It is " + (lonely == lonelyToo) + " that lonely " +
							"and lonelyToo are one and the same object.");

	}

}
