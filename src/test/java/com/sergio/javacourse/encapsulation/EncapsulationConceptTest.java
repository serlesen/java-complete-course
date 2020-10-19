package com.sergio.javacourse.encapsulation;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.lang.reflect.Method;

import org.junit.jupiter.api.Test;


public class EncapsulationConceptTest {
	
	@Test
	public void testOne() {
		var vehicles = EncapsulationConcept.one();
		assertEquals(vehicles.size(), 3);
		for (var vehicle : vehicles) {
			assertTrue(vehicle instanceof Vehicle);
		}
	}

	@Test
	public void testTwo() {
		Method[] methods = Vehicle.class.getDeclaredMethods();
		
		boolean found = false;
		for (var method : methods) {
			if (method.getName().equals("getCapacity")) {
				assertEquals(method.getReturnType(), int.class);
				found = true;
			}
		}
		assertTrue(found);
		
		var vehicles = EncapsulationConcept.two();
		assertEquals(vehicles.size(), 3);
		for (var vehicle : vehicles) {
			assertTrue(vehicle instanceof Vehicle);
		}
	}
	
	@Test
	public void testThree() {
		Method[] methods = Vehicle.class.getDeclaredMethods();
		
		boolean found = false;
		for (var method : methods) {
			if (method.getName().equals("hasEngine")) {
				assertEquals(method.getReturnType(), boolean.class);
				found = true;
			}
		}
		assertTrue(found);
		
		
		var vehicles = EncapsulationConcept.three();
		assertEquals(vehicles.size(), 3);
		for (var vehicle : vehicles) {
			assertTrue(vehicle instanceof Vehicle);
		}
	}
}
