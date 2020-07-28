package com.sergio.javacourse.str;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class StrTest {

	@Test
	public void testOne() {
		assertEquals(22, Str.one());
	}
	
	@Test
	public void testTwo() {
		assertEquals(35, Str.two());
	}
	
	@Test
	public void testThree() {
		assertTrue(Str.three().indexOf("->\"<-") > 0);
	}
}
