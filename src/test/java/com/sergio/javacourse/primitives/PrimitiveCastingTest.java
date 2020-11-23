package com.sergio.javacourse.primitives;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class PrimitiveCastingTest {
	
	@Test
	public void testOne() {
		Object result = PrimitiveCasting.one(15);
		assertEquals(result, 15);
		assertTrue(result instanceof Integer);
	}
	
	@Test
	public void testTwo() {
		Object result = PrimitiveCasting.two(15l);
		assertEquals(result, 15);
		assertTrue(result instanceof Integer);
	}
	
	@Test
	public void testThree() {
		Object result = PrimitiveCasting.three(15);
		assertEquals(result, 15);
		assertTrue(result instanceof Integer);
		
		assertEquals(PrimitiveCasting.three(null), -1);
	}

}
