package com.sergio.javacourse.futures;

import org.junit.jupiter.api.Test;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

import static org.junit.jupiter.api.Assertions.*;

class MyFutureClassTest {

    @Test
    public void testFutures() throws ExecutionException, InterruptedException {
        Future<String> future = MyFutureClass.multipleFutures();
        assertEquals("How are you? I'm fine.", future.get());
    }

}