package com.sergio.javacourse.enums;

public enum DaysOfWeek {
	
	MONDAY("MON"),
	TUESDAY("TUE"),
	WEDNESDAY("WED"),
	THURSDAY("THU"),
	FRIDAY("FRI"),
	SATURDAY("SAT"),
	SUNDAY("SUN");
	
	private final String abbreviation;

	private DaysOfWeek(String abbreviation) {
		this.abbreviation = abbreviation;
	}
	
	public String getAbbreviation() {
		return this.abbreviation;
	}
	
	public static DaysOfWeek findDaysOfWeek(String abbreviation) {
		for (DaysOfWeek day : DaysOfWeek.values()) {
			if (day.abbreviation.equals(abbreviation)) {
				return day;
			}
		}
		return null;
	}
}
