package com.sergio.javacourse.input;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.io.ByteArrayInputStream;

public class TestKeyboardInput {

    @ParameterizedTest
    @ValueSource(strings = {"hi", "hello", "bye", "abc", "hello world"})
    public void testReadAString(String expectedResult) {
        System.setIn(new ByteArrayInputStream(expectedResult.getBytes()));
        String result = KeyboardInput.readAString();
        Assertions.assertEquals(expectedResult.split(" ")[0], result, "The System.in value is not returned");
    }

    @ParameterizedTest
    @ValueSource(strings = {"hi world", "how are you"})
    public void testReadALineString(String expectedResult) {
        System.setIn(new ByteArrayInputStream(expectedResult.getBytes()));
        String result = KeyboardInput.readALine();
        Assertions.assertEquals(expectedResult, result, "The System.in value is not returned");
    }

    @Test
    public void testReadTheString() {
        System.setIn(new ByteArrayInputStream("hello".getBytes()));
        String result = KeyboardInput.readTheString();
        Assertions.assertEquals("hello", result, "The System.in value is not returned");

        System.setIn(new ByteArrayInputStream("bye".getBytes()));
        String wrongResult = KeyboardInput.readTheString();
        Assertions.assertNull(wrongResult, "The System.in value should return null as the string doesn't match the pattern");
    }
}
