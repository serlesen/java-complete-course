package com.sergio.javacourse.bool.operations;

public class BoolOperations {
	
	public static void bool() {
		
	}
	
	/**
	 * Return the result of the AND operation between the variables 'a' and 'b'.
	 */
	public static boolean one() {
		boolean a = false;
		boolean b = true;
		return a && b;
	}
	
	/**
	 * Return the result of the comparison of 'a' being smaller than 'b'.
	 */
	public static boolean two() {
		int a = 3;
		int b = 5;
		return a < b;
	}
	
	/**
	 * Return the negate value (NOT operation) of the variable 'a'. 
	 */
	public static boolean three() {
		boolean a = false;
		return !a;
	}

}
