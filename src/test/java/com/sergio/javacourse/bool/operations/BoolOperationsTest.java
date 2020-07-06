package com.sergio.javacourse.bool.operations;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;


public class BoolOperationsTest {
	
	@Test
	public void testOne() {
		assertFalse(BoolOperations.one());
	}
	
	@Test
	public void testTwo() {
		assertTrue(BoolOperations.two());
	}
	
	@Test
	public void testThree() {
		assertTrue(BoolOperations.three());
	}

}
