package com.sergio.javacourse.staticmethods;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Optional;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;

import com.sergio.javacourse.misc.Dog;

public class StaticMethodsTest {

	
	@Test
	public void testOne() {
		Optional<Method> methodOptional = Stream.of(Dog.class.getDeclaredMethods())
			.filter(method -> "getColor".equals(method.getName())
					&& method.getReturnType().equals(String.class)
					&& method.getParameterCount() == 0
					&& (method.getModifiers() & Modifier.STATIC) == 0)
			.findFirst();
		assertTrue(methodOptional.isPresent());
	}
	
	@Test
	public void testTwo() {
		Optional<Method> methodOptional = Stream.of(Dog.class.getDeclaredMethods())
			.filter(method -> "hasNose".equals(method.getName())
					&& method.getReturnType().equals(Boolean.class)
					&& method.getParameterCount() == 0
					&& (method.getModifiers() & Modifier.STATIC) == Modifier.STATIC)
			.findFirst();
		assertTrue(methodOptional.isPresent());
	}
}
