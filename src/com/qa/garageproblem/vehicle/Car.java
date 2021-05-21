package com.qa.garageproblem.vehicle;

public class Car extends Vehicle{
	
	private int doors;
	private String style;
	
	public Car(String make, String model, int wheels, String fuel, int doors, String style) {
		super(make, model, wheels, fuel);
		this.doors = doors;
		this.style = style;
	}
	
	public int getDoors() {
		return doors;
	}
	
	public void setDoors(int doors) {
		this.doors = doors;
	}
	
	public String getStyle() {
		return style;
	}
	
	public void setStyle(String style) {
		this.style = style;
	}
	
	@Override
	public String toString() {
		return "Car [doors=" + doors + ", style=" + style + ", getId()=" + getId() + ", getMake()=" + getMake()
	+ ", getModel()=" + getModel() + ", getWheels()=" + getWheels() + ", getFuel()=" + getFuel() + "]";

	}
	

}
