package com.sergio.javacourse.interfaces;

import com.sergio.javacourse.interfaces.misc.ImplementationClass;
import com.sergio.javacourse.interfaces.misc.InterfacedClass;
import com.sergio.javacourse.interfaces.misc.SecondImplementationClass;

public class InterfaceCasting {
	
	public static void main(String[] args) {
		
	}
	
	/**
	 * Create an object of type ImplementationClass and return it.
	 */
	public static InterfacedClass one() {
		InterfacedClass o = new ImplementationClass();
		return o;
	}
	
	/**
	 * Create an object of type SecondImplementationClass and return it.
	 */
	public static InterfacedClass two() {
		InterfacedClass o = new SecondImplementationClass();
		return o;
	}
	
	/**
	 * Check the class type of the incoming parameter; if it's an ImplementationClass, return it;
	 * otherwise return null.
	 */
	public static ImplementationClass three(InterfacedClass input) {
		if (input instanceof ImplementationClass) {
			return (ImplementationClass) input;
		}
		return null;
	}

}
