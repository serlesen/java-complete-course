package com.sergio.javacourse.abstracts;

import com.sergio.javacourse.abstracts.misc.AbstractClass;
import com.sergio.javacourse.abstracts.misc.ExtendedClass;
import com.sergio.javacourse.abstracts.misc.SecondExtendedClass;

public class AbstractCasting {
	
	public static void main(String[] args) {
		
	}
	
	/**
	 * Create an object of type ExtendedClass, store it in an object of class type AbstractClass and return id.
	 */
	public static AbstractClass one() {
		AbstractClass o = new ExtendedClass();
		return o;
	}
	
	/**
	 * Create an object of type SecondExtendedClass, store it in an object of class type AbstractClass and return id.
	 */
	public static AbstractClass two() {
		AbstractClass o = new SecondExtendedClass();
		return o;
	}
	
	/**
	 * Check the class type of the incoming parameter; if it's an ExtendedClass, return it;
	 * otherwise return null.
	 */
	public static ExtendedClass three(AbstractClass input) {
		if (input instanceof ExtendedClass) {
			return (ExtendedClass) input;
		}
		return null;
	}

}
