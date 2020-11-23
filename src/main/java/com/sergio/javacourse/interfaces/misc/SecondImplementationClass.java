package com.sergio.javacourse.interfaces.misc;

public class SecondImplementationClass implements InterfacedClass {

	@Override
	public void emptyMethodFromInterface() {
		System.out.println("Second implementation");
	}
	
	public void emptyMethodFromSecondImplementation() {
		System.out.println("Own method from second implementation");
	}

}
