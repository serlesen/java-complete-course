package com.sergio.javacourse.nulls;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Test;

import com.sergio.javacourse.misc.Price;

public class NullReferenceTest {
	
	@Test
	public void testOne() {
		assertNotNull(NullReference.one("Harry Potter"));
		assertNull(NullReference.one("Shining"));
		
	}
	
	@Test
	public void testTwo() {
		assertEquals(22f, NullReference.two(new Price(10f, 1.1f, 2, "EUR")));
		assertNull(NullReference.two(new Price(null, 1.1f, 2, "EUR")));
		assertNull(NullReference.two(new Price(10f, null, 2, "EUR")));
		assertNull(NullReference.two(new Price(10f, 1.1f, null, "EUR")));
	}
	
	@Test
	public void testThree() {
		assertNotNull(NullReference.three(10f, 1.1f, 2, "EUR"));
		assertNull(NullReference.three(null, 1.1f, 2, "EUR"));
		assertNull(NullReference.three(10f, null, 2, "EUR"));
		assertNull(NullReference.three(10f, 1.1f, null, "EUR"));
		assertNull(NullReference.three(10f, 1.1f, 2, null));
	}

}
