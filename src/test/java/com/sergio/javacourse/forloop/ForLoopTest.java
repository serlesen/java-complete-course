package com.sergio.javacourse.forloop;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Calendar;

import org.junit.jupiter.api.Test;

public class ForLoopTest {

	@Test
	public void testOne() {
		java.io.ByteArrayOutputStream out = new java.io.ByteArrayOutputStream();    
		System.setOut(new java.io.PrintStream(out));
		
		ForLoop.one();
		
		assertEquals("Mike\nMonica\nBob\nJoe\nRachel\nAlbert\nJohn\nMaria\n", out.toString());
	}
	
	@Test
	public void testTwo() {
		var users = ForLoop.two();
		
		var year = Calendar.getInstance().get(Calendar.YEAR);
		
		for (var user : users) {
			assertEquals(year - user.birthYear, user.age);
		}
	}
	
	@Test
	public void testThree() {
		var user = ForLoop.three();
		
		assertEquals("Bob", user.name);
	}
}
