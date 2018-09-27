package edu.gcu.bootcamp.java.william.palowski.travelagency;

public class Traveler {
	
	private String name;
	private boolean passport;
	
	public static void main(String[] args) {
		
		Vacation a = new Vacation();
		a.getPackage();
		
		
	}
	
	public Traveler(String name, boolean passport) {
		this.name = name;
		this.passport = passport;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isPassport() {
		return passport;
	}

	public void setPassport(boolean passport) {
		this.passport = passport;
	}

}
