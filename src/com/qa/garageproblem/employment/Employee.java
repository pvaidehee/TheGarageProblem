package com.qa.garageproblem.employment;

import com.qa.garageproblem.Person;

public class Employee {
	
	private double annualSalary;
	private double weeklySalary;
	
	public Employee(String name, int age, String gender, double annualSalary) {
		super(name, age, gender);
		this.annualSalary = annualSalary;
		this.weeklySalary = calculateWeeklySalary();
	}
	
	public double calculateWeeklySalary() {
		return this.annualSalary/52;
	}
	
	public double getAnnualSalary() {
		return annualSalary;
	}
	
	public void setAnnualSalary(double annualSalary) {
		this.annualSalary = annualSalary;
	}
	
	public double getWeeklySalary() {
		return weeklySalary;
	}
	
	public void setWeeklySalary(double weeklySalary) {
		this.weeklySalary = weeklySalary;
	}

}
