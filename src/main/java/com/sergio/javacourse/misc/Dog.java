package com.sergio.javacourse.misc;

public class Dog extends Animal {
	
	public Dog(String name) {
		super.name = name;
	}
	
	public String getName() {
		return super.name;
	}
	
	public static int getAmountOfPaws() {
		return 4;
	}
	
	public String getColor() {
		return "blue";
	}
	
	public static Boolean hasNose() {
		return true;
	}
	
	public Integer getSize() {
		return 10;
	}
	
	private void walk() {}
	
}
