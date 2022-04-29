package com.sergio.javacourse.regex;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyRegexClassTest {

    @Test
    public void testSearchWord() {
        assertFalse(MyRegexClass.searchWord("This is a string"));
        assertFalse(MyRegexClass.searchWord("Hello world"));
        assertTrue(MyRegexClass.searchWord("hello world"));
        assertTrue(MyRegexClass.searchWord("I've said hello."));
    }

    @Test
    public void testSearchStructure() {
        assertFalse(MyRegexClass.searchStructure("this is a string"));
        assertFalse(MyRegexClass.searchStructure("Now, the time is 2022-05-04 03:02:01. Bye!"));
        assertFalse(MyRegexClass.searchStructure("Now, the time is 22-05-04T03:02:01. Bye!"));
        assertFalse(MyRegexClass.searchStructure("Now, the time is 2022-05-04T03:02:01 Bye!"));
        assertTrue(MyRegexClass.searchStructure("Now, the time is 1234-56-78T90:12:23. Bye!"));
    }

    @Test
    public void testReplace() {
        assertEquals("this is a string", MyRegexClass.replaceStructure("this is a string"));
        assertEquals("Now, the time is 2022-05-04 03:02:01. Bye!", MyRegexClass.replaceStructure("Now, the time is 2022-05-04 03:02:01. Bye!"));
        assertEquals("Now the date is 78/56/1234. See you soon!", MyRegexClass.replaceStructure("Now, the time is 1234-56-78T90:12:23. Bye!"));
    }

}