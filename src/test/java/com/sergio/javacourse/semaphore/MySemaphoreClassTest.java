package com.sergio.javacourse.semaphore;

import org.junit.jupiter.api.Test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.*;

class MySemaphoreClassTest {

    @Test
    public void testSemaphore() throws InterruptedException {
        ExecutorService service = Executors.newFixedThreadPool(10);
        for (int i = 0; i < 1000; i++) {
            service.submit(() -> MySemaphoreClass.semaphoreOnList("Item"));
        }
        service.shutdown();
        service.awaitTermination(1, TimeUnit.MINUTES);
        assertEquals(1000, MySemaphoreClass.myList.size());
    }

}