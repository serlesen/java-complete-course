package com.sergio.javacourse.two.constructor;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.lang.reflect.Parameter;

import org.junit.jupiter.api.Test;

public class GameTest {

	@Test
	public void testConstructor() {
		assertEquals(1, Game.class.getConstructors().length, "Missing constructor");
	}
	
	@Test
	public void testPublicConstructor() {
		Constructor<?>[] constructors = Game.class.getConstructors();
		for (Constructor<?> constructor : constructors) {
			assertTrue(Modifier.isPublic(constructor.getModifiers()), "Constructor must be public");
		}
	}
	
	@Test
	public void testInputFieldsConstructor() {
		Constructor<?>[] constructors = Game.class.getConstructors();
		for (Constructor<?> constructor : constructors) {
			if (constructor.getParameterCount() != 0) {
				Parameter[] parameters = constructor.getParameters();
				for (Parameter parameter : parameters) {
					if (!parameter.getType().equals(Float.TYPE) && !parameter.getType().equals(String.class)) {
						fail("Unknown input parameter type " + parameter.getClass());
					}
				}
			}
		}
	}
}
