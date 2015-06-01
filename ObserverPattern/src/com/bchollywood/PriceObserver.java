package com.bchollywood;

public class PriceObserver implements Observer {
	
	private double itemPrice;
	private String itemName;
	
	public PriceObserver(Subject priceGrabber, String itemName, double initialPrice) {
		this.itemName = itemName;
		this.itemPrice = initialPrice;
		priceGrabber.register(this);
	}

	@Override
	public void update(double itemPrice) {
		this.itemPrice = itemPrice;
		printItemPrice();
	}

	private void printItemPrice() {
		System.out.println("Current price of " + itemName + " is " + itemPrice + ".\n");
	}

}
