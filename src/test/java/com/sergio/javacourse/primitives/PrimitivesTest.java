package com.sergio.javacourse.primitives;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class PrimitivesTest {
	
	@Test
	public void testOne() {
		assertTrue(Primitives.one());
	}
	
	@Test
	public void testTwo() {
		assertEquals(100, Primitives.two());
	}
	
	@Test
	public void testThree() {
		assertEquals(5.5f, Primitives.three());
	}

}
