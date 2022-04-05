package com.sergio.javacourse.lambdas;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class LambdaClass {

    public static void main(String[] args) {

    }

    /**
     * Edit the method (the return type) to return a Consumer of Strings.
     * Inside the method, create and return a Consumer of String which just print the string in the console with
     * the following text : 'Here is a string ' + the consumed String.
     */
    public static Consumer<String> returnConsumer() {
        return s -> System.out.println("Here is a string " + s);
    }

    /**
     * Edit the method (the return type) to return a Supplier or Longs.
     * Inside the method, create and return a Supplier of Longs which returns the sum of the
     * System.currentTimeMillis() plus 42.
     */
    public static Supplier<Long> returnSupplier() {
        return () -> System.currentTimeMillis() + 42;
    }

    /**
     * Edit the method (the return type) to return a Function which consumes an Integer and returns a String.
     * Inside the method, create and return a Function which consumes an Integer and returns a String where the
     * returned String has the following text : 'The input number is ' + the consumed Integer.
     */
    public static Function<Integer, String> returnFunction() {
        return i -> "The input number is " + i;
    }
}
