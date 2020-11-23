package com.sergio.javacourse.abstracts.misc;

public class ExtendedClass extends AbstractClass {

	@Override
	public void emptyMethodFromAbstractClass() {
		System.out.println("First extension");
	}
	
	public void emptyMethodFromFirstExtension() {
		System.out.println("Own method from first extension");
	}

}
