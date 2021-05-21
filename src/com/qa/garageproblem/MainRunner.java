package com.qa.garageproblem;

import com.qa.garageproblem.employment.Employee;
import com.qa.garageproblem.employment.Trainee;
import com.qa.garageproblem.vehicle.Abilities;
import com.qa.garageproblem.vehicle.Car;
import com.qa.garageproblem.vehicle.Garage;
import com.qa.garageproblem.vehicle.Motorcycle;
import com.qa.garageproblem.vehicle.Vehicle;

public class MainRunner {
	public static void main(String[] args) {
		boolean running = true;
		while(running) {
			Vehicle one = new Vehicle("Toyota", "Camry", 4, "Gas");
			Abilities a = new Car(one.getMake(), one.getModel(), one.getWheels(), one.getFuel(), 4, "Sedan");
			Abilities b = new Car("Honda", "Civic", 4, "Gas", 2, "Coupe");
			Abilities c = new Motorcycle("Kawasaki", "Ninja", 2, "Gas", true);
			
			Garage container = new Garage();
			container.addVehicle(one);
			container.addVehicle(a);
			container.addVehicle(b);
			container.addVehicle(c);
			
			System.out.println(container.removeById(5));
			System.out.println(container.displayVehicles());
			
			running = false;
		}
	}

}
