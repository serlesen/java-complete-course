package com.sergio.javacourse.maps;

import java.util.HashMap;

import com.sergio.javacourse.common.User;

public class Maps {

	public static void main(String[] args) {
		
	}
	
	/**
	 * Create a map with:
	 * - the keys will be String
	 * - the values will be User
	 */
	public static HashMap<String, User> one() {
		
		HashMap<String, User> map = new HashMap();
		
		return map;
	}
	
	/**
	 * Create a map with:
	 * - the keys will be String
	 * - the values will be User
	 * - put a User named "Mike" with the key "first"
	 */
	public static HashMap<String, User> two() {
		
		HashMap<String, User> map = new HashMap();
		map.put("first", new User("Mike"));
		
		return map;
	}
	
	/**
	 * Replace the value of the key "third" with a User named "Bob". 
	 */
	public static HashMap<String, User> three(HashMap<String, User> map) {
		
		map.put("third", new User("Bob"));
		
		return map;
	}
}
