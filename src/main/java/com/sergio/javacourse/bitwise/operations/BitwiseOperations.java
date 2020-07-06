package com.sergio.javacourse.bitwise.operations;

public class BitwiseOperations {
	
	public static void bitwise() {
		
	}
	
	/**
     * Apply to the initialValue variable the following bitwise operations and return the result:
     *  - apply a XOR mask 3
     *  - shift to the left 3 times
     */
    public static int one() {
        int initialValue = 1;
        int res = initialValue ^ 3;
        res = res << 3;
        return res;
    }
    
    /**
     * Apply to the initialValue variable the following bitwise operations and return the result:
     *  - apply a OR mask 8
     *  - shift to the right 1 times
     *  - apply the AND mask 5
     */
    public static int two() {
        int initialValue = 1;
        int res = initialValue| 8;
        res = res >> 1;
        res = res & 5;
        return res;
    }
    
    /**
     * Apply to the initialValue variable the following bitwise operations and return the result:
     *  - apply a XOR mask 7
     *  - shift to the left 3 times
     *  - apply a OR mask 1
     *  - shift to the right 1 times
     *  - apply a XOR mask 2
     */
    public static int three() {
        int initialValue = 1;
        int res = initialValue ^ 7;
        res = res << 3;
        res = res| 1;
        res = res >> 1;
        res = res ^ 2;
        return res;
    }

}
