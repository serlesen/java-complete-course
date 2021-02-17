package com.sergio.javacourse.inputparams;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.sergio.javacourse.misc.AmountAggregator;

public class InputParamsTest {

	@Test
	public void testOne() {
		assertEquals(InputParams.one(10), 11);
		assertEquals(InputParams.one(9), 10);
	}
	
	@Test
	public void testTwo() {
		var ref = new AmountAggregator(9);
		InputParams.two(ref);
		assertEquals(ref.getValue(), 10);
	}
	
	@Test
	public void testThree() {
		var ref = new AmountAggregator(9);
		assertEquals(InputParams.three(10, ref), 11);
		assertEquals(ref.getValue(), 10);
	}
}
