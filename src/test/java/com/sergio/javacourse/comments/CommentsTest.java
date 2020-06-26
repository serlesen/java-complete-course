package com.sergio.javacourse.comments;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CommentsTest {
	
	@Test
	public void testOne() {
		assertEquals(2, Comments.one());
	}
	
	@Test
	public void testTwo() {
		assertEquals(5, Comments.two());
	}
	
	@Test
	public void testThree() {
		assertEquals(2, Comments.three());
	}

}
