package com.sergio.javacourse.three.methods;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import java.lang.reflect.Method;

import org.junit.jupiter.api.Test;

public class ComputerTest {
	
	@Test
	public void testTurnOnMethod() {
		Method[] methods = Computer.class.getMethods();
		for (Method method : methods) {
			if (method.getName().contentEquals("turnOn")) {
				assertEquals(0, method.getParameterCount(), "turnOn method must have no input parameters");
				return;	
			}
		}
		
		fail("Missing method turnOn");
	}
	
	@Test
	public void testTurnOffMethod() {
		Method[] methods = Computer.class.getMethods();
		for (Method method : methods) {
			if (method.getName().contentEquals("turnOff")) {
				assertEquals(0, method.getParameterCount(), "turnOff method must have no input parameters");
				return;	
			}
		}
		
		fail("Missing method turnOff");
	}
	
	@Test
	public void testOpenAppMethod() {
		Method[] methods = Computer.class.getMethods();
		for (Method method : methods) {
			if (method.getName().contentEquals("openApp")) {
				assertEquals(1, method.getParameterCount(), "openApp method must have one input parameter");
				assertEquals(String.class, method.getParameters()[0].getType(), "Input parameter for openApp method must be a String");
				return;	
			}
		}
		
		fail("Missing method openApp");
	}

}
