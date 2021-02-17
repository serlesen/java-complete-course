package com.sergio.javacourse.inputparams;

import com.sergio.javacourse.misc.AmountAggregator;

public class InputParams {
	
	public static void main() {
		
	}
	
	/**
	 * The following method accepts an input parameter by value.
	 * Return the value incremented by one.
	 */
	public static int one(int value) {
		return value + 1;
	}
	
	/**
	 * The following method accepts an input parameter as reference.
	 * Modify the field "value" of the object incrementing it by one.
	 */
	public static void two(AmountAggregator ref) {
		ref.setValue(ref.getValue() + 1);
	}
	
	/**
	 * The following method accepts tow input parameters. Those parameters are
	 * incremented incorrectly in the method. Update the method signature to 
	 * make them "final" and correct the compilation errors.
	 */
	public static int three(final int value, final AmountAggregator ref) {
		ref.setValue(ref.getValue() + 1);
		return value + 1;
	}

}
