package com.sergio.javacourse.bitwise.operations;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class BitwiseOperationsTest {
	
	@Test
	public void testOne() {
		assertEquals(16, BitwiseOperations.one());
	}
	
	@Test
	public void testTwo() {
		assertEquals(4, BitwiseOperations.two());
	}
	
	@Test
	public void testThree() {
		assertEquals(26, BitwiseOperations.three());
	}

}
