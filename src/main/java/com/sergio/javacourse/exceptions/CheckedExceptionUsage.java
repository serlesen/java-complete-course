package com.sergio.javacourse.exceptions;

import java.io.IOException;

public class CheckedExceptionUsage {

    public static void main(String[] args) {

    }

    /**
     * Uncomment the line inside the method and surround the line (which may throw an exception) with a try/catch.
     * In the catch block, return true
     */
    public static boolean catchACheckedException() {
        // uncomment this line for the assignment
        // MiscExceptionUsage.methodWithACheckedException();
        return false;
    }

    /**
     * Uncomment the line inside the method and change the method declaration to indicate that this method
     * may throw an exception.
     */
    public static void declareACheckedException() {
        // uncomment this line for the assignment
        // MiscExceptionUsage.methodWithACheckedException();
    }

    /**
     * In the following code, add a finally block which will set the value 3 to the variable 'result‘.
     * Let the rest of the code as it is.
     */
    public static int finallyBlock() {
        var result = 0;
        try {
            MiscExceptionUsage.methodWithACheckedException();
            result = 1;
        } catch (Exception e) {
            result = 2;
        }

        return result;
    }

    /**
     * Uncomment the line inside the method and surround the line with a try/catch.
     * The try/catch must have multiple catch clauses and a finally block.
     * Catch an ArrayIndexOutOfBoundsException and return 1
     * Catch an IOException and return 2
     * Catch an Exception and return 3
     * If not exception is thrown, return 4
     */
    public static int catchMultipleExceptions(Exception exception) {
        // uncomment this line for the assignment
        // MiscExceptionUsage.methodWithAGivenException(exception);
        return -1;
    }
}
