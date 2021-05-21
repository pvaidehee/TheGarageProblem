package com.qa.garageproblem.vehicle;


import java.util.ArrayList;
import java.util.List;

public class Garage{

	private int maxVehicles = 10;
	private static List<Vehicle> allVehicles = new ArrayList<>();
	
	public Garage() {
	}
	
	public Garage(int maxVehicles) {
		this.maxVehicles = maxVehicles;
	}
	
	public static String addVehicle(Abilities v) {
		if(allVehicles.size() < 10) {
			allVehicles.add((Vehicle) v);
			return "Vehicle Added";
		}else {
			return "Garage is Full";
		}
	}
	
	public static String calculateBill() {
		double bill = 0;
		String vehicles = "";
		for(int i = 0; i < allVehicles.size(); i++) {
			if(allVehicles.get(i) instanceof Motorcycle) {
				bill = 100;
				vehicles += allVehicles.get(i) + "\n";
				vehicles += "Vehicle bill = $" + bill + "\n";
			}else if(allVehicles.get(i) instanceof Car) {
				bill = 150;
				vehicles += allVehicles.get(i) + "\n";
				vehicles += "Vehicle bill = $" + bill + "\n";
			}
		}
		return vehicles;
	}
	
	public static void removeByMake(String s) {
		for(int i = 0; i < allVehicles.size(); i++) {
			if(allVehicles.get(i).getMake() == s) {
				allVehicles.remove(i);
				break;
			}
		}
	}
	public static String removeById(int id) {
		for(int i = 0; i < allVehicles.size(); i++) {
			if(allVehicles.get(i).getId() == id) {
				allVehicles.remove(i);
				return "ID: "+ id + " was removed";
			}
		}
		return "Vehicle with id: " + id + " not found";
	}
	
	public static void removeAll() {
		allVehicles.clear();
		
	}

	public List displayVehicles() {
		return allVehicles;
	}
	
	
}