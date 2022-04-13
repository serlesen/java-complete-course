package com.sergio.javacourse.threads;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyThreadClassTest {

    @Test
    public void testSingleThread() throws InterruptedException {
        MyThreadClass.myVar = 0;
        Thread t = MyThreadClass.singleThread();
        t.start();
        t.join();
        assertEquals(1, MyThreadClass.myVar);
    }

    @Test
    public void testRunnable() throws InterruptedException {
        MyThreadClass.myVar = 0;
        Runnable r = MyThreadClass.longRunnable();
        Thread t = new Thread(r);
        long initTime = System.currentTimeMillis();
        t.start();
        t.join();
        long finalTime = System.currentTimeMillis();
        assertEquals(10, MyThreadClass.myVar);
        assertTrue((finalTime - initTime) > 5000);
    }

}