package com.sergio.javacourse.atom;

import org.junit.jupiter.api.Test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.*;

class MyAtomicClassTest {

    @Test
    public void testAtomic() throws InterruptedException {
        ExecutorService service = Executors.newFixedThreadPool(10);
        for (int i = 0; i < 1000; i++) {
            service.submit(() -> MyAtomicClass.increment(5));
        }
        service.shutdown();
        service.awaitTermination(1, TimeUnit.MINUTES);
        assertEquals(5000, MyAtomicClass.atomicInteger.get());
    }

}