package com.sergio.javacourse.binary.representation;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class BinaryRepresentationTest {
	
	@Test
	public void testOne() {
		String binaryRepresentation = BinaryRepresentation.one();
		assertEquals(3, Integer.parseInt(binaryRepresentation, 2));
	}
	
	@Test
	public void testTwo() {
		String binaryRepresentation = BinaryRepresentation.two();
		assertEquals(8, Integer.parseInt(binaryRepresentation, 2));
	}
	
	@Test
	public void testThree() {
		String binaryRepresentation = BinaryRepresentation.three();
		assertEquals(13, Integer.parseInt(binaryRepresentation, 2));
	}

}
