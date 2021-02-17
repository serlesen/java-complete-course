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
	
}
