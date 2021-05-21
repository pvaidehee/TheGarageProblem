package com.qa.garageproblem.vehicle;

public class Motorcycle extends Vehicle {
	
	private boolean hasHelmet;
	
	public Motorcycle(String make, String model, int wheels, String fuel, boolean hasHelmet) {
		super(make, model, wheels, fuel);
		this.hasHelmet = hasHelmet;
	}
	
	public boolean isHasHelmet() {
		return hasHelmet;
	}
	
	public void setHasHelmet(boolean hasHelmet) {
		this.hasHelmet = hasHelmet;
	}
	
	
	@Override
	public void travel() {
		System.out.println("I'm off roads");
	}
	
	@Override
	public String toString() {
		return "Motorcycle [hasHelmet=" + hasHelmet + ", getId()=" + getId() + ", getMake()=" + getMake()
				+ ", getModel()=" + getModel() + ", getWheels()=" + getWheels() + ", getFuel()=" + getFuel() + "]";
	}
}
