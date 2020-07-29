package com.sergio.javacourse.ifconditions;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class IfConditionsTest {
	
	@Test
	public void testOne() {
		assertEquals(0, IfConditions.one(10));
		assertEquals(1, IfConditions.one(11));
	}
	
	@Test
	public void testTwo() {
		assertEquals(2, IfConditions.two(10));
		assertEquals(1, IfConditions.two(11));
	}
	
	@Test
	public void testThree() {
		assertEquals(2, IfConditions.three(4));
		assertEquals(3, IfConditions.three(5));
		assertEquals(3, IfConditions.three(10));
		assertEquals(1, IfConditions.three(11));
	}

}
