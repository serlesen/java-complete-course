package com.sergio.javacourse.lambdas;

import org.junit.jupiter.api.Test;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestLambdaClass {

    @Test
    public void testConsumer() {
        Object consumer = LambdaClass.returnConsumer();
        assertTrue(consumer instanceof Consumer);

        ((Consumer<String>) consumer).accept("hi");
    }

    @Test
    public void testSupplier() {
        Object supplier = LambdaClass.returnSupplier();
        assertTrue(supplier instanceof Supplier);

        Long value = ((Supplier<Long>) supplier).get();

        assertTrue(System.currentTimeMillis() < value);
    }

    @Test
    public void testFunction() {
        Object function = LambdaClass.returnFunction();
        assertTrue(function instanceof Function);

        assertEquals("The input number is 42", ((Function<Integer, String>) function).apply(42));
    }
}
