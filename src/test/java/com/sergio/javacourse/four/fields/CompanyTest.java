package com.sergio.javacourse.four.fields;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.junit.jupiter.api.Test;

public class CompanyTest {
	
	@Test
	public void testConstructor() {
		Constructor<?>[] constructors = Company.class.getConstructors();
		
		assertEquals(1, constructors.length, "Missing additional contructor");
		
		for (Constructor<?> constructor : constructors) {
			if (constructor.getParameterCount() != 0) {
				assertEquals(1, constructor.getParameterCount(), "Additional constructor must have one input parameter");
				assertEquals(Integer.TYPE, constructor.getParameters()[0].getType(), "Additional constructor must have an integer as input parameter");
				
			}
		}
	}
	
	@Test
	public void testMethod() {
		Method[] methods = Company.class.getMethods();
		for (Method method : methods) {
			if (method.getName().equals("buy")) {
				assertEquals(1, method.getParameterCount(), "Buy method must take one input parameter");
				assertEquals(Integer.TYPE, method.getParameters()[0].getType(), "Buy method must take an integer input parameter");
				return;
			}
		}
		
		fail("Missing buy method");
	}

}
