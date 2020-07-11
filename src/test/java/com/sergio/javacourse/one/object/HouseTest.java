package com.sergio.javacourse.one.object;

import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;

public class HouseTest {
	
	@Test
	public void testClassExistance() {
		try {
			Class.forName("com.sergio.javacourse.one.object.House");
		} catch (ClassNotFoundException e) {
			fail("Missing class com.sergio.javacourse.one.object.House");
		}
	}

}
