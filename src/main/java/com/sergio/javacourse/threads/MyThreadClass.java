package com.sergio.javacourse.threads;

public class MyThreadClass {

    protected static int myVar = 0;

    public static void main(String[] args) {

    }

    /**
     * Create and return a thread that modifies the value of the variable myVar to 1.
     */
    public static Thread singleThread() {
        return null;
    }

    /**
     * Create and return a runnable that modifies the value of the variable myVar to 10.
     * The thread must first wait 5 seconds before modifying the value of the variable.
     */
    public static Runnable longRunnable() {
        return null;
    }

}


