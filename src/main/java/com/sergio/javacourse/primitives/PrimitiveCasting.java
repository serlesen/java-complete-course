package com.sergio.javacourse.primitives;

public class PrimitiveCasting {
	
	public static void main(String[] args) {
		
	}
	
	/**
	 * Write the return statement to return the int value as an Integer. 
	 */
	public static Integer one(int i) {
		return i;
	}
	
	/**
	 * Write the return statement to return the long value as an int.
	 */
	public static int two(long l) {
		return (int) l;
	}
	
	/**
	 * Write the return statement to return the Integer value as an int.
	 * Be careful with the incoming null values. If a null value is received, return directly -1.
	 */
	public static int three(Integer i) {
		if (i == null) {
			return -1;
		}
		return (int) i;
	}

}
