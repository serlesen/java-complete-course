package com.sergio.javacourse.arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ArraysTest {

	@Test
	public void testOne() {
		assertEquals(3, Arrays.one().length);
	}
	
	@Test
	public void testTwo() {
		assertEquals(37, Arrays.two());
	}
	
	@Test
	public void testThree() {
		var array = Arrays.three();
		assertEquals(5, array.length);
		assertEquals(23, array[0]);
		assertEquals(45, array[1]);
		assertEquals(3, array[2]);
		assertEquals(98, array[3]);
		assertEquals(27, array[4]);
	}
}
