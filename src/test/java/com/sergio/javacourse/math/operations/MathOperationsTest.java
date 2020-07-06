package com.sergio.javacourse.math.operations;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class MathOperationsTest {

	@Test
	public void testOne() {
		assertEquals(20, MathOperations.one());
	}
	
	@Test
	public void testTwo() {
		assertEquals(10, MathOperations.two());
	}
	
	@Test
	public void testThree() {
		assertEquals(1, MathOperations.three());
	}
}
