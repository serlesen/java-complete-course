package com.sergio.javacourse.lists;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

public class ListsTest {

	@Test
	public void testOne() {
		assertEquals(3, Lists.one().size());
	}
	
	@Test
	public void testTwo() {
		var list = Lists.two();
		assertEquals(3, list.size());
		assertNotEquals(20, list.get(1));
	}
	
	@Test
	public void testThree() {
		var list = new ArrayList<Integer>();
		
		list.add(10);
		list.add(20);
		list.add(15);
		list.add(35);
		list.add(65);
		list.add(12);
		list.add(30);
		list.add(5);
		list.add(18);
		list.add(32);
		list.add(76);
		list.add(70);
		
		assertEquals(7, Lists.three(list));
	}
}
