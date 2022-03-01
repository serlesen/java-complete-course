package com.sergio.javacourse.exceptions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TestRuntimeExceptionUsage {

    @Test
    public void testThrowAnException() {
        RuntimeException ex = assertThrows(RuntimeException.class,
                RuntimeExceptionUsage::throwAnException,
                "Incorrect exception type");
        assertEquals("I'm an exception", ex.getMessage(), "Incorrect exception message");
    }
}
