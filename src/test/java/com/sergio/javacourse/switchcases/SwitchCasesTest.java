package com.sergio.javacourse.switchcases;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class SwitchCasesTest {

	@Test
	public void testOne() {
		assertEquals(10, SwitchCases.one(1));
		assertEquals(20, SwitchCases.one(10));
		assertEquals(-1, SwitchCases.one(2));
	}
	
	@Test
	public void testTwo() {
		assertEquals(10, SwitchCases.two("hello"));
		assertEquals(20, SwitchCases.two("bye"));
		assertEquals(30, SwitchCases.two("other"));
	}
	
	@Test
	public void testThree() {
		assertEquals(10, SwitchCases.three(1));
		assertEquals(10, SwitchCases.three(2));
		assertEquals(20, SwitchCases.three(3));
		assertEquals(20, SwitchCases.three(4));
		assertEquals(30, SwitchCases.three(5));
	}
}
