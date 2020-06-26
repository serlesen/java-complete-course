package com.sergio.javacourse.variables;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class VariablesTest {

	@Test
	public void testOne() {
		assertEquals(3, Variables.one());
	}
	
	@Test
	public void testTwo() {
		assertEquals(2, Variables.two());
	}
	
	@Test
	public void testThree() {
		assertEquals(5, Variables.three());
	}
}
