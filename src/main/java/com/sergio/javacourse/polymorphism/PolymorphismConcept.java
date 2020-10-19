package com.sergio.javacourse.polymorphism;

import java.util.ArrayList;
import java.util.List;



public class PolymorphismConcept {
	
	public static void main(String[] args) {
		
	}

	/**
	 * Create 3 implementations (Car, Moto, Plane) of the Vehicle interface. 
	 * Add an instantiation of each implementation in the list "vehicles".
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
	 * Create a method signature in the Vehicle interface.
	 * The method must be called getCapacity() and return an int.
	 * Implement the method in the 3 implementations of the previous exercise.
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
	 * Create a default method in the Vehicle interface.
	 * The method must be called hasEngine() and return a boolean.
	 * The method must be a default one and only defined in the interface.
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
