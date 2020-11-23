package com.sergio.javacourse.interfaces.misc;

public class ImplementationClass implements InterfacedClass {

	@Override
	public void emptyMethodFromInterface() {
		System.out.println("First implementation");
	}
	
	public void emptyMethodFromFirstImplementation() {
		System.out.println("Own method from first implementation");
	}


}
