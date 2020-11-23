package com.sergio.javacourse.abstracts.misc;

public class SecondExtendedClass extends AbstractClass {

	@Override
	public void emptyMethodFromAbstractClass() {
		System.out.println("Second extension");
	}
	
	public void emptyMethodFromSecondExtension() {
		System.out.println("Own method from second extension");
	}

}
