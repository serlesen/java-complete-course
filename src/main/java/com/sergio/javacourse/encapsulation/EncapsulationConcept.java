package com.sergio.javacourse.encapsulation;

import java.util.ArrayList;
import java.util.List;

public class EncapsulationConcept {
	
	public static void main(String[] args) {
		
	}
	
	/**
	 * Create 3 extensions (Car, Moto, Plane) of the Vehicle abstract classes. 
	 * Add an instantiation of each extension in the list "vehicles".
	 */
	public static List<Vehicle> one() {
		var vehicles = new ArrayList<Vehicle>();
		
		// add an instantiation of each vehicle in the list as follows:
		// vehicles.add(new SomeKindOfVehicle());
		
		return vehicles;
	}
	
	/**
	 * Create a method signature in the Vehicle abstract class.
	 * The method must be called getCapacity() and return an int.
	 * Implement the method in the 3 implementations of the previous exercise.
	 */
	public static List<Vehicle> two() {
		var vehicles = new ArrayList<Vehicle>();
		
		// add an instantiation of each vehicle in the list as follows:
		// vehicles.add(new SomeKindOfVehicle());
		
		return vehicles;
	}
	
	/**
	 * Create a method in the Vehicle abstract class.
	 * The method must be called hasEngine() and return a boolean.
	 * The method must only defined in the interface.
	 */
	public static List<Vehicle> three() {
		var vehicles = new ArrayList<Vehicle>();
		
		// add an instantiation of each vehicle in the list as follows:
		// vehicles.add(new SomeKindOfVehicle());
		
		return vehicles;
	}

}
