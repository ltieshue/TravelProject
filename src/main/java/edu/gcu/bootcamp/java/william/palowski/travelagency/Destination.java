package edu.gcu.bootcamp.java.william.palowski.travelagency;

public class Destination {
	

	public double calculateAirPrice(double miles, double pricePerMile) {
		
		double priceByAir = miles * pricePerMile;
		return priceByAir;
		
	}
	
	public double calculateGroundPrice(double miles, double pricePerMile) {
		double priceByGround = miles * pricePerMile;
		return priceByGround;
	}
	
	public double calculateNauticalPrice(double miles, double pricePerMile) {
		double nauticalPrice = miles * pricePerMile;
		return nauticalPrice;
	}

	public double totalPrice(double price) {
		
		return price;
	}
	
	public double totalPrice(double price, double price2) {
		double totalPrice = price + price2;
		return totalPrice;
	}
	
	public void displayTotalPrice(double totalPrice) {
		System.out.println("The total price for your trip is " + totalPrice);
	}
}
