package com.bchollywood;

import java.util.ArrayList;

public class PriceGrabber implements Subject {
	
	private ArrayList<Observer> observers;
	public double itemOnePrice;
	public double itemTwoPrice;
	public double itemThreePrice;
	
	public PriceGrabber() {
		this.observers = new ArrayList<Observer>();
	}

	public void setItemOnePrice(double itemOnePrice) {
		this.itemOnePrice = itemOnePrice;
		notifyObservers();
	}

	public void setItemTwoPrice(double itemTwoPrice) {
		this.itemTwoPrice = itemTwoPrice;
		notifyObservers();
	}

	public void setItemThreePrice(double itemThreePrice) {
		this.itemThreePrice = itemThreePrice;
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
			o.update(itemOnePrice, itemTwoPrice, itemThreePrice);
		}
	}

}
