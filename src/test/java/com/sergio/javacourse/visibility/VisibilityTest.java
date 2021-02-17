package com.sergio.javacourse.visibility;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Optional;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;

import com.sergio.javacourse.misc.Animal;
import com.sergio.javacourse.misc.Dog;

public class VisibilityTest {
	
	@Test
	public void testOne() {
		Optional<Method> methodOptional = Stream.of(Dog.class.getDeclaredMethods())
			.filter(method -> "getSize".equals(method.getName())
					&& method.getReturnType().equals(Integer.class)
					&& method.getParameterCount() == 0
					&& (method.getModifiers() & Modifier.PUBLIC) == Modifier.PUBLIC)
			.findFirst();
		assertTrue(methodOptional.isPresent());
	}
	
	@Test
	public void testTwo() {
		Optional<Method> methodOptional = Stream.of(Dog.class.getDeclaredMethods())
			.filter(method -> "walk".equals(method.getName())
					&& method.getReturnType().equals(Void.TYPE)
					&& method.getParameterCount() == 0
					&& (method.getModifiers() & Modifier.PRIVATE) == Modifier.PRIVATE)
			.findFirst();
		assertTrue(methodOptional.isPresent());
	}
	
	@Test
	public void testThree() {
		Optional<Method> methodOptional = Stream.of(Animal.class.getDeclaredMethods())
			.filter(method -> "breath".equals(method.getName())
					&& method.getReturnType().equals(Void.TYPE)
					&& method.getParameterCount() == 0
					&& (method.getModifiers() & Modifier.PROTECTED) == Modifier.PROTECTED)
			.findFirst();
		assertTrue(methodOptional.isPresent());
	}

}
