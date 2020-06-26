package com.sergio.javacourse.main;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

import org.junit.jupiter.api.Test;

public class MainTest {
	
	@Test
	public void testMethodName() {
		Method method = findMethod();
		assertEquals("main", method.getName());
	}
	
	@Test
	public void testMethodParametersNumber() {
		Method method = findMethod();
		assertEquals(1, method.getParameterCount());
	}
	
	@Test
	public void testMethodParametersType() {
		Method method = findMethod();
		assertEquals(String[].class, method.getParameterTypes()[0]);
	}
	
	@Test
	public void testStaticMethod() {
		Method method = findMethod();
		assertTrue(Modifier.isStatic(method.getModifiers()));
	}
	
	@Test
	public void testPublicMethod() {
		Method method = findMethod();
		assertTrue(Modifier.isPublic(method.getModifiers()));
	}
	
	@Test
	public void testReturnVoid() {
		Method method = findMethod();
		assertEquals(Void.TYPE, method.getReturnType());
	}
	
	private Method findMethod() {
		Method[] methods = Main.class.getMethods();
		for (Method method : methods) {
			if ("main".equals(method.getName())) {
				return method;
			}
		}
		fail("Missing main method");
		return methods[0];
	}

}
