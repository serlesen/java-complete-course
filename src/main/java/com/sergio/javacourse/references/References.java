package com.sergio.javacourse.references;

import com.sergio.javacourse.user.User;

public class References {
	
	public static void main(String[] args) {
		
	}
	
	/**
	 * Concat to the existing String another string with the content " two".
	 * Ensure to have the white space between both
	 */
	public static String one() {
		return "one" + " two";
	}
	
	/**
	 * Compare both string and return the result.
	 * You can compare them directly after the result keyword. 
	 */
	public static boolean two() {
		String first = "Joe";
		String second = new String("Joe");
		
		
		return first.equals(second);
	}
	
	/**
	 * Compare both objects and return the result.
	 * You can compare them directly after the result keyword.
	 */
	public static boolean three() {
		User first = new User("Joe", 15, 1000);
		User second = new User("Joe", 15, 1000);
		
		return first.equals(second);
	}
	

}
