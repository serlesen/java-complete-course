package com.sergio.javacourse.print;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class PrintTest {

	@Test
	public void testOne() {
		java.io.ByteArrayOutputStream out = new java.io.ByteArrayOutputStream();    
		System.setOut(new java.io.PrintStream(out));
	
		Print.one();
		
		assertEquals("Hello!\n", out.toString());
	}
	
	@Test
	public void testTwo() {
		java.io.ByteArrayOutputStream out = new java.io.ByteArrayOutputStream();    
		System.setOut(new java.io.PrintStream(out));
		
		Print.two();
		
		assertEquals("987654321", out.toString());
	}
	
	@Test
	public void testThree() {
		java.io.ByteArrayOutputStream out = new java.io.ByteArrayOutputStream();    
		System.setOut(new java.io.PrintStream(out));
		
		Print.three();
		
		assertEquals("Hello\tWorld\n", out.toString());
	}
	
}
