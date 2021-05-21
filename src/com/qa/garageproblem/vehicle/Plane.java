package com.qa.garageproblem.vehicle;

public class Plane extends Vehicle {
	
	private boolean isflying;
	
	public Plane(String make, String model, int wheels, String fuel, boolean isflying) {
		super(make, model, wheels, fuel);
		this.isflying = isflying;
	}

}
