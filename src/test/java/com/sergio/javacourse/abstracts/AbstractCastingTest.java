package com.sergio.javacourse.abstracts;

import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import com.sergio.javacourse.abstracts.misc.AbstractClass;
import com.sergio.javacourse.abstracts.misc.ExtendedClass;
import com.sergio.javacourse.abstracts.misc.SecondExtendedClass;

public class AbstractCastingTest {
	
	@Test
	public void testOne() {
		AbstractClass result = AbstractCasting.one();
		assertTrue(result instanceof ExtendedClass);
;	}

	
	@Test
	public void testTwo() {
		AbstractClass result = AbstractCasting.two();
		assertTrue(result instanceof SecondExtendedClass);
	}

	
	@Test
	public void testThree() {
		assertTrue(AbstractCasting.three(new ExtendedClass()) instanceof ExtendedClass);
		assertNull(AbstractCasting.three(new SecondExtendedClass()));
	}

}
