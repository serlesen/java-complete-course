package com.sergio.javacourse.polymorphism;

public interface Vehicle {
	
	int getCapacity();
	
	default boolean hasEngine() {
		return true;
	}
	
}
