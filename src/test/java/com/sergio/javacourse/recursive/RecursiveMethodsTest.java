package com.sergio.javacourse.recursive;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

public class RecursiveMethodsTest {
	
	
	@Test
	public void testOne() {
		var p1 = new Person();
		p1.maried = true;
		
		var p2 = new Person();
		p2.maried = false;
		
		var p3 = new Person();
		p3.maried = true;
		
		
		p1.children = Arrays.asList(p2, p3);
		
		assertEquals(RecursiveMethods.amountInFamily(p1), 5);
	}
	
	@Test
	public void testTwo() {
		var p1 = new Person();
		p1.maried = true;
		
		var p2 = new Person();
		p2.maried = false;
		
		var p21 = new Person();
		p21.maried = true;
		
		var p22 = new Person();
		p22.maried = true;
		
		var p23 = new Person();
		p23.maried = true;
		
		p2.children = Arrays.asList(p21, p22, p23);
		
		var p3 = new Person();
		p3.maried = true;
		
		var p31 = new Person();
		p31.maried = false;
		
		p3.children = Arrays.asList(p31);
		
		
		p1.children = Arrays.asList(p2, p3);
		
		assertEquals(RecursiveMethods.amountInFamily(p1), 12);
	}

}
