package com.qa.garageproblem;

public class PersonTraits extends Person{
	public String hairColor;
	public double height;
	public int weightLb;
	
	public PersonTraits(String name, int age, String gender, String hairColor, double height, int weightLb) {
		super(name, age, gender);
		this.hairColor = hairColor;
		this.height = height;
		this.weightLb =  weightLb;
	}
	
	// Setters n Getters
	public String getHairColor() {
		return hairColor;
	}
	
	public void setHairColor(String hairColor) {
		this.hairColor = hairColor;
	}
	
	public double getHeight() {
		return height;
	}
	
	public void setHeight(double height) {
		this.height = height;
	}
	
	public int getWeightLb() {
		return weightLb;
	}
	
	public void setWeightLb(int weightLb) {
		this.weightLb = weightLb;
	}

}
