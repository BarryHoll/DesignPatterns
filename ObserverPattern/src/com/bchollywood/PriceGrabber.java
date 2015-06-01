package com.bchollywood;

import java.util.ArrayList;

public class PriceGrabber implements Subject {
	
	private ArrayList<Observer> observers;
	public double itemPrice;
	
	public PriceGrabber() {
		this.observers = new ArrayList<Observer>();
	}

	public void setItemPrice(Observer o, double itemPrice) {
		this.itemPrice = itemPrice;
		notifyObservers(o);
	}
	
	public void printAllItemPrices() {
		System.out.println("Printing all items...");
		for (Observer o : observers) {
			System.out.println(o.toString());
		}
	}

	@Override
	public void register(Observer o) {
		observers.add(o);
		System.out.println("Adding...\n" + o.toString());
	}

	@Override
	public void unregister(Observer o) {
		int index = observers.indexOf(o);
		observers.remove(index);
		System.out.println("Removing...\n" + o.toString());
	}

	@Override
	public void notifyObservers(Observer o) {
		for (Observer ob : observers) {
			if(o==ob)
				o.update(itemPrice);
		}
	}

}
