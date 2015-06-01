package com.bchollywood;

import java.util.ArrayList;

public class PriceGrabber implements Subject {
	
	private ArrayList<Observer> observers;
	public double itemPrice;
	
	public PriceGrabber() {
		this.observers = new ArrayList<Observer>();
	}

	public void setItemPrice(double itemPrice) {
		this.itemPrice = itemPrice;
		notifyObservers();
	}

	@Override
	public void register(Observer o) {
		observers.add(o);
	}

	@Override
	public void unregister(Observer o) {
		int index = observers.indexOf(o);
		observers.remove(index);
	}

	@Override
	public void notifyObservers() {
		for (Observer o : observers) {
			o.update(itemPrice);
		}
	}

}
