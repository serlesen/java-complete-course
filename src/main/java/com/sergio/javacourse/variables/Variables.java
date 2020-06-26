package com.sergio.javacourse.variables;

public class Variables {
	
	public static void variables() {
		
	}
	
	/**
	 * Create another line/statement assigning the value 3 to the variable 'a'.
	 */
	public static int one() {
		int a = 0;
		a = 3;
		return a;
	}
	
	/**
	 * Create a variable, name it as you want, with the initial value of 2.
	 * Return the created variable.
	 */
	public static int two() {
		int x = 2;
		return x;
	}

	/**
	 * Create another variable, name it as you want, with the initial value of 5.
	 * Assign the value of the new variable to 'a'.
	 */
	public static int three() {
		
		// create a new variable ⬇ with the initial value of 5
		int x = 5;
		// create a new variable ⬆ with the initial value of 5
		
		int a = x; // assign the new variable to 'a' instead of 0
		
		return a;
	}
}
