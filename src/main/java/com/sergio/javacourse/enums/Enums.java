package com.sergio.javacourse.enums;

public class Enums {
	
	public static void main(String[] args) {
		
	}
	
	/**
	 * Change the method "one" to return the ordinal of the given DaysOfWeek.
	 */
	public static int one(DaysOfWeek day) {
		return day.ordinal();
	}
	
	/**
	 * Modify the method "two" to return the abbreviation of the given DaysOfWeek.
	 * You must also change the definition of DaysOfWeek to include the abbreviation of each value.
	 */
	public static String two(DaysOfWeek day) {
		return day.getAbbreviation();
	}
	
	/**
	 * Modify the method "three" to obtain the DaysOfWeek from an abbreviation.
	 * You must also change the enum DaysOfWeek to include a method to look for the value from an abbreviation.
	 */
	public static DaysOfWeek three(String nameOfTheDay) {
		return DaysOfWeek.findDaysOfWeek(nameOfTheDay);
	}

}
