package com.sergio.javacourse.exceptions;

public class MiscExceptionUsage {

    public static void methodWithACheckedException() throws Exception {
        throw new Exception("This is an exception");
    }

    public static void methodWithAGivenException(Exception exception) throws Exception {
        if (exception != null) {
            throw exception;
        }
    }
}
