package com.sergio.javacourse.enums;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class EnumsTest {
	
	@Test
	public void testOne() {
		assertEquals(0, Enums.one(DaysOfWeek.MONDAY), "Incorrect ordinal of MONDAY");
		assertEquals(2, Enums.one(DaysOfWeek.WEDNESDAY), "Incorrect ordinal of WEDNESDAY");
		assertEquals(5, Enums.one(DaysOfWeek.SATURDAY), "Incorrect ordinal of SATURDAY");
	}

	@Test
	public void testTwo() {
		assertEquals("MON", Enums.two(DaysOfWeek.MONDAY), "Incorrect abbreviation of MONDAY");
		assertEquals("WED", Enums.two(DaysOfWeek.WEDNESDAY), "Incorrect abbreviation of WEDNESDAY");
		assertEquals("SAT", Enums.two(DaysOfWeek.SATURDAY), "Incorrect abbreviation of SATURDAY");
	}
	
	@Test
	public void testThree() {
		assertEquals(DaysOfWeek.MONDAY, Enums.three("MON"), "Incorrect DaysOfWeek for abbreviation MON");
		assertEquals(DaysOfWeek.WEDNESDAY, Enums.three("WED"), "Incorrect DaysOfWeek for abbreviation WED");
		assertEquals(DaysOfWeek.SATURDAY, Enums.three("SAT"), "Incorrect DaysOfWeek for abbreviation SAT");
	}
}
