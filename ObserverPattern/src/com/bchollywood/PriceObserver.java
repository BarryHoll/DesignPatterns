package com.bchollywood;

public class PriceObserver implements Observer {
	
	private double itemPrice;
	private String itemName;
	
	public PriceObserver(String itemName, double initialPrice) {
		this.itemName = itemName;
		this.itemPrice = initialPrice;
	}
	
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
		System.out.println("Updated price of " + itemName + " is " + itemPrice + ".\n");
	}
	
	@Override
	public String toString() {
		return "Item name: " + itemName + ",\nItem price: " + itemPrice + ".\n";
	}

}
