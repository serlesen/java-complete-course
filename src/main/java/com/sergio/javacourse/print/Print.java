package com.sergio.javacourse.print;

public class Print {
	
	public static void print() {
		
	}
	
	/**
	 * This method should print in the console the following text in a new line: Hello!
	 */
	public static void one() {
		System.out.println("Hello!");
	}
	
	/**
	 * This method should print in the console the following number without a new line at the end: 987654321
	 */
	public static void two() {
		System.out.print(987654321);
	}

	/**
	 * This method should print in the console the following text (replace <tab> with tabulations) 
	 * in a new line: Hello<tab>World
	 */
	public static void three() {
		System.out.println("Hello\tWorld");
	}

}
