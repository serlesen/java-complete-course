package com.sergio.javacourse.references;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class ReferencesTest {

	@Test
	public void testOne() {
		assertEquals("one two", References.one());
	}
	
	@Test
	public void testTwo() {
		assertTrue(References.two());
	}
	
	@Test
	public void testThree() {
		assertTrue(References.three());
	}
}
