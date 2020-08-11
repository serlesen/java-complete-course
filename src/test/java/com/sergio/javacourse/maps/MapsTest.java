package com.sergio.javacourse.maps;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.HashMap;

import org.junit.jupiter.api.Test;

import com.sergio.javacourse.common.User;

public class MapsTest {

	@Test
	public void testOne() {
		HashMap<String, User> map = Maps.one();
		assertNotNull(map);
		assertTrue(map.isEmpty());
	}
	
	@Test
	public void testTwo() {
		HashMap<String, User> map = Maps.two();
		assertNotNull(map);
		assertEquals(1, map.size());
		assertTrue(map.containsKey("first"));
		assertEquals("Mike", map.get("first").name);
	}
	
	@Test
	public void testThree() {
		var map = new HashMap<String, User>();
		map.put("first", new User("Homer"));
		map.put("second", new User("Marge"));
		map.put("third", new User("Bart"));
		map.put("fourth", new User("Lisa"));
		map.put("fifth", new User("Maggie"));
		
		var modifiedMap = Maps.three(map);
		assertEquals(5, modifiedMap.size());
		assertTrue(modifiedMap.containsKey("third"));
		assertEquals("Bob", modifiedMap.get("third").name);
		
	}
}
