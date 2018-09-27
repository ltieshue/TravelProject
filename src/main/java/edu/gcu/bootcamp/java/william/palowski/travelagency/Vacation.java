package edu.gcu.bootcamp.java.william.palowski.travelagency;

import java.util.Scanner;
import java.util.concurrent.SynchronousQueue;

public class Vacation extends Destination{
	
	private double airPrice = .30;
	private double groundPrice = .10;
	private double nauticalPrice = 2.00;
	private double miles;
	private double price, price2, totalPrice;
	private double nauticalMiles;
	
	private Scanner sc = new Scanner(System.in);
	
	public void getPackage() {

		System.out.println("=====================================================");
		System.out.println("       BI-LO Travel: CHOOSE YOUR TRAVEL PACKAGE      ");
		System.out.println("=====================================================");
		System.out.println();
		System.out.println("=====================================================");
		System.out.println("=  1: Trip to Caribbean (Nassau or Barbados)        =");
		System.out.println("=  2: Europe Escape (Amsterdam or Munich)           =");
		System.out.println("=  3: U.S Destinations (New York or Seattle)        =");
		System.out.println("=====================================================");
		System.out.println("=  0: Exit application                              =");
		System.out.println("=====================================================");
		System.out.print("Enter your choice: ");
		
		int input = sc.nextInt();
		
		switch(input) {
			case 1 : caribbeanChoice();
				break;
			case 2 : europeanEscape();
				break;
			case 3 : stateSideDestinations();
				 break;
			case 0 : System.out.println("Thankyou for visiting our site!!");// exit application
				break;
			default :
				break;
		}
	}
	
	public void caribbeanChoice() {
		
		
		System.out.println("Choose your cruise destination");
		System.out.println("1: Cruise to Nassau");
		System.out.println("2: Fly to Nassau");
		System.out.println("3: Cruise to Barbados");
		System.out.println("4: Fly to Barbados");
		System.out.print("Enter choice: ");
		
		int choice = sc.nextInt();
		
		switch(choice) {
			case 1 : miles = 1964;
					 price = calculateAirPrice(miles, airPrice);
					 nauticalMiles = 200;
					 price2 = calculateNauticalPrice(nauticalMiles, nauticalPrice);
					 totalPrice = totalPrice(price, price2);
				break;
			case 2 : miles = 2164;
					 price = calculateAirPrice(miles, airPrice);
					 totalPrice = totalPrice(price);
				break;
			case 3 : miles = 1964;
					 price = calculateAirPrice(miles, airPrice);
					 nauticalMiles = 1611;
					 price2 = calculateNauticalPrice(nauticalMiles, nauticalPrice);
					 totalPrice = totalPrice(price, price2);
				break;
			case 4 : miles = 3572;
					 price = calculateAirPrice(miles, airPrice);
					 totalPrice = totalPrice(price);
				break;
				default :
					break;
		}
		
		
		displayTotalPrice(totalPrice);
		
		
	}
	
	public void stateSideDestinations() {
		
		System.out.println("Choose your U.S. destination");
		System.out.println("1: New York, New York by air");
		System.out.println("2: New York, New York by train");
		System.out.println("3: Seattle, Washington by air");
		System.out.println("4: Seattle, Washington by train");
		System.out.print("Enter choice: ");
		
		int choice = sc.nextInt();
		
		switch(choice) {
			case 1 : miles = 2388;
					 price = calculateAirPrice(miles, airPrice);
					 totalPrice = totalPrice(price);
				break;
			case 2 : miles = 2388;
					 price = calculateGroundPrice(miles, groundPrice);
					 totalPrice = totalPrice(price);
				break;
			case 3 : miles = 1448;
					 price = calculateAirPrice(miles, airPrice);
					 totalPrice = totalPrice(price);
				break;
			case 4 : miles = 1448;
					 price = calculateGroundPrice(miles, groundPrice);
					 totalPrice = totalPrice(price);
				break;
				default :
					break;
		}
		
		displayTotalPrice(totalPrice);
	}
		
		public void europeanEscape() {
			
			System.out.println("Choose your U.S. destination");
			System.out.println("1: Amsterdam, Netherlands by air");
			System.out.println("2: Munich, Germany by air");
		
			System.out.print("Enter choice: ");
			
			int choice = sc.nextInt();
			
			switch(choice) {
				case 1 : miles = 5394;
						 price = calculateAirPrice(miles, airPrice);
						 totalPrice = totalPrice(price);
					break;
				case 2 : miles = 5827;
						 price = calculateAirPrice(miles, airPrice);
						 totalPrice = totalPrice(price);
					break;
					default :
						break;
			}
			displayTotalPrice(totalPrice);
		
	}
	
	

}
