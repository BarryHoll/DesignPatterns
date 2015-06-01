package com.bchollywood;

public class PriceChecker {

	public static void main(String[] args) {

		PriceGrabber priceGrabber = new PriceGrabber();
		
		PriceObserver carPrice = new PriceObserver(priceGrabber, "car", 40000.00);
		PriceObserver phonePrice = new PriceObserver(priceGrabber, "phone", 650.00);
		PriceObserver laptopPrice = new PriceObserver(priceGrabber, "laptop", 1400.00);
		
		priceGrabber.setItemPrice(phonePrice, 300.00);
		
		priceGrabber.printAllItemPrices();
		
		priceGrabber.setItemPrice(carPrice, 30000.00);
		
		priceGrabber.printAllItemPrices();
		
		priceGrabber.setItemPrice(laptopPrice, 2000.00);
		
		priceGrabber.printAllItemPrices();
		
		priceGrabber.unregister(phonePrice);
		
		priceGrabber.printAllItemPrices();
		
		PriceObserver housePrice = new PriceObserver("house", 250000.00);
		priceGrabber.register(housePrice);
		
		priceGrabber.printAllItemPrices();
	}

}
