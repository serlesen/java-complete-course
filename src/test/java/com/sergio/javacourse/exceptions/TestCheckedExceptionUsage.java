package com.sergio.javacourse.exceptions;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.lang.reflect.Method;

import static org.junit.jupiter.api.Assertions.*;

public class TestCheckedExceptionUsage {

    @Test
    public void testCatchACheckedException() {
        try {
            boolean result = CheckedExceptionUsage.catchACheckedException();
            assertTrue(result, "Method output should be true");
        } catch(Exception ex) {
            fail("Catch an unexpected Exception");
        }
    }

    @Test
    public void testDeclareACheckedException() {
        for (Method method : CheckedExceptionUsage.class.getMethods()) {
            if ("declareACheckedException".equals(method.getName())) {
                Class<?>[] exceptionTypes = method.getExceptionTypes();
                assertEquals(1, exceptionTypes.length, "Incorrect Exception declaration in the method");
            }
        }
    }

    @Test
    public void testFinallyBlock() {
        assertEquals(3,
                CheckedExceptionUsage.finallyBlock(),
                "Missing the finally block where the result is updated to 3");
    }

    @Test
    public void testCatchMultipleExceptions() {
        var result = CheckedExceptionUsage.catchMultipleExceptions(new ArrayIndexOutOfBoundsException());
        assertEquals(1, result, "When catching ArrayIndexOutOfBoundsException, should return 1");
        result = CheckedExceptionUsage.catchMultipleExceptions(new IOException());
        assertEquals(2, result, "When catching IOException, should return 2");
        result = CheckedExceptionUsage.catchMultipleExceptions(new Exception());
        assertEquals(3, result, "When catching NullPointerException, should return 3");
        result = CheckedExceptionUsage.catchMultipleExceptions(null);
        assertEquals(4, result, "When no exception is thrown, should return 4");
    }
}
