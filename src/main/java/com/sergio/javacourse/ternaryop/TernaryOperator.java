package com.sergio.javacourse.ternaryop;

public class TernaryOperator {
	
	public static void main(String[] args) {
		
	}
	
	/**
	 * Write a if-condition with the ternary operator to set the value to result:
	 * - 1 if "incoming" is greater than 10.
	 * - 2 otherwise
	 */
	public static int one(int incoming) {
		int result = -1;
		
		result = incoming > 10 ? 1 : 2;
		
		return result;
	}

}
