package com.sergio.javacourse.switchcases;

public class SwitchCases {
	
	public static void main(String[] args) {
		
	}

	
	/**
	 * Write a switch-case with the incoming parameter as input.
	 * In the case "incoming" is 1, set the value 10 to "result".
	 * In the case "incoming" is 10, set the value 20 to "result".  
	 */
	public static int one(int incoming) {
		int result = -1;
		
		switch(incoming) {
			case 1:
				result = 10;
				break;
			case 10:
				result = 20;
				break;
		}
		
		return result;
	}
	
	/**
	 * Write a switch-case with the incoming parameter as input.
	 * In the case "incoming" is "hello", set the value 10 to "result".
	 * In the case "incoming" is "bye", set the value 20 to "result".
	 * For the rest, set the value 30 to "result".
	 */
	public static int two(String incoming) {
		int result = -1;
		
		switch(incoming) {
			case "hello":
				result = 10;
				break;
			case "bye":
				result = 20;
				break;
			default:
				result = 30;
				break;
		}
		
		return result;
	}

	/**
	 * Write a switch-case with the incoming parameter as input.
	 * In the case "incoming" is 1 or 2, set the value of 10 to "result".
	 * In the case "incoming" is 3 or 4, set the value of 20 to "result".
	 * For the rest, set the value of 30 to "result".
	 */
	public static int three(int incoming) {
		int result = -1;
		
		switch(incoming) {
			case 1: case 2:
				result = 10;
				break;
			case 3: case 4:
				result = 20;
				break;
			default:
				result = 30;
				break;
		}
		
		return result;
	}
}
