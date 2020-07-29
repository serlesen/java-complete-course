package com.sergio.javacourse.ternaryop;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TernaryOperatorTest {

	@Test
	public void testOne() {
		assertEquals(1, TernaryOperator.one(11));
		assertEquals(2, TernaryOperator.one(10));
	}
}
