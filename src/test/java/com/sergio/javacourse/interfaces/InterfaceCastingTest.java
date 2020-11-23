package com.sergio.javacourse.interfaces;

import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import com.sergio.javacourse.interfaces.misc.ImplementationClass;
import com.sergio.javacourse.interfaces.misc.InterfacedClass;
import com.sergio.javacourse.interfaces.misc.SecondImplementationClass;

public class InterfaceCastingTest {
	
	@Test
	public void testOne() {
		InterfacedClass result = InterfaceCasting.one();
		assertTrue(result instanceof ImplementationClass);
;	}

	
	@Test
	public void testTwo() {
		InterfacedClass result = InterfaceCasting.two();
		assertTrue(result instanceof SecondImplementationClass);
	}

	
	@Test
	public void testThree() {
		assertTrue(InterfaceCasting.three(new ImplementationClass()) instanceof ImplementationClass);
		assertNull(InterfaceCasting.three(new SecondImplementationClass()));
	}

}
