package com.sergio.javacourse.ifconditions;

public class IfConditions {

	public static void main(String[] args) {
		
	}
	
	/**
	 * Write an if statement which set the value of the variable "result" to 1 if the value of "incoming" is greater that 10.
	 */
	public static int one(int incoming) {
		int result = 0;
		
		if (incoming > 10) {
			result = 1;
		}
		
		return result;
		
	}
	
	/**
	 * Write an if statement which:
	 * - set the value of the variable "result" to 1 if the value of "incoming" is greater that 10.
	 * - otherwise, set the value of the variable "result" to 2.
	 */
	public static int two(int incoming) {
		int result = 0;
		
		if (incoming > 10) {
			result = 1;
		} else {
			result = 2;
		}
		
		return result;
	}

	/**
	 * Write an if statement which:
	 *  - set the value of the variable "result" to 1 if the value of "incoming" is greater that 10.
	 *  - or set the value of the variable "result" to 2 if the value of "incoming" is lower than 5.
	 *  - otherwise, set the value of the variable "result" to 3.
	 */
	public static int three(int incoming) {
		int result = 0;
		
		if (incoming > 10) {
			result = 1;
		} else if (incoming < 5) {
			result = 2;
		} else {
			result = 3;
		}
		
		return result;
	}
}
