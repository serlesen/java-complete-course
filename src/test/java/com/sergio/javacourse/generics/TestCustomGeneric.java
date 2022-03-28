package com.sergio.javacourse.generics;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TestCustomGeneric {

    @Test
    public void testCreateStringList() {
        List list = CustomGeneric.createStringList("hi");
        assertEquals(1, list.size(), "The list doesn't contain the given element");
    }

    @Test
    public void testInvalidStringList() {
        assertThrows(ClassCastException.class,
                () -> CustomGeneric.createStringList(1),
                "Given a number, the list shouldn't accept it");
    }

    @Test
    public void testCreateIntList() {
        List list = CustomGeneric.createIntegerList(42);
        assertEquals(1, list.size(), "The list doesn't contain the given element");
    }

    @Test
    public void testInvalidIntList() {
        assertThrows(ClassCastException.class,
                () -> CustomGeneric.createIntegerList("bye"),
                "Given a number, the list shouldn't accept it");
    }

    @Test
    public void testCreateGenericClass() {
        MyGenericClass myGenericClass = CustomGeneric.editCustomGenericClass("hello");
        assertEquals("hello", myGenericClass.returns(), "Stored object isn't the given element");
    }

    @Test
    public void testInvalidGenericClass() {
        assertThrows(ClassCastException.class,
                () -> CustomGeneric.editCustomGenericClass(99),
                "Given a number, MyGenericClass shouldn't accept it");
    }
}
