package com.sergio.javacourse.polymorphism;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.lang.reflect.Method;

import org.junit.jupiter.api.Test;

public class PolymorphismConceptTest {

	@Test
	public void testOne() {
		var vehicles = PolymorphismConcept.one();
		assertEquals(vehicles.size(), 3);
		for (var vehicle : vehicles) {
			assertTrue(vehicle instanceof Vehicle);
		}
	}

	@Test
	public void testTwo() {
		Method[] methods = Vehicle.class.getMethods();
		
		boolean found = false;
		for (var method : methods) {
			if (method.getName().equals("getCapacity")) {
				assertEquals(method.getReturnType(), int.class);
				found = true;
			}
		}
		assertTrue(found);
		
		
		var vehicles = PolymorphismConcept.two();
		assertEquals(vehicles.size(), 3);
		for (var vehicle : vehicles) {
			assertTrue(vehicle instanceof Vehicle);
		}
	}
	
	@Test
	public void testThree() {
		Method[] methods = Vehicle.class.getMethods();
		
		boolean found = false;
		for (var method : methods) {
			if (method.getName().equals("hasEngine")) {
				assertEquals(method.getReturnType(), boolean.class);
				assertTrue(method.isDefault());
				found = true;
			}
		}
		assertTrue(found);
		
		
		var vehicles = PolymorphismConcept.three();
		assertEquals(vehicles.size(), 3);
		for (var vehicle : vehicles) {
			assertTrue(vehicle instanceof Vehicle);
		}
	}
	
}
