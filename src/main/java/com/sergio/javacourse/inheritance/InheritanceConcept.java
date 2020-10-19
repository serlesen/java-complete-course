package com.sergio.javacourse.inheritance;

import java.util.ArrayList;
import java.util.List;


public class InheritanceConcept {
	
	public static void main(String[] args) {
		
	}
	
	/**
	 * Create 3 classes (Car, Moto, Plane) which extend the Vehicle classes. 
	 * Add an instantiation of each class in the list "vehicles".
	 */
	public static List<Vehicle> one() {
		var vehicles = new ArrayList<Vehicle>();
		
		// add an instantiation of each vehicle in the list as follows:
		// vehicles.add(new SomeKindOfVehicle());
		vehicles.add(new Moto());
		vehicles.add(new Car());
		vehicles.add(new Plane());
		
		return vehicles;
	}
	
	/**
	 * Create a method signature in the Vehicle class.
	 * The method must be called getCapacity() and return an int.
	 * Implement the method in the 3 class of the previous exercise and call the super method.
	 */
	public static List<Vehicle> two() {
		var vehicles = new ArrayList<Vehicle>();
		
		// add an instantiation of each vehicle in the list as follows:
		// vehicles.add(new SomeKindOfVehicle());
		vehicles.add(new Moto());
		vehicles.add(new Car());
		vehicles.add(new Plane());
		
		return vehicles;
	}
	
	/**
	 * Create a method in the Vehicle class.
	 * The method must be called hasEngine() and return a boolean.
	 * The method must only defined in the interface.
	 */
	public static List<Vehicle> three() {
		var vehicles = new ArrayList<Vehicle>();
		
		// add an instantiation of each vehicle in the list as follows:
		// vehicles.add(new SomeKindOfVehicle());
		vehicles.add(new Moto());
		vehicles.add(new Car());
		vehicles.add(new Plane());
		
		return vehicles;
	}

}
