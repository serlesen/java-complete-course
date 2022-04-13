package com.sergio.javacourse.futures;

import java.util.concurrent.Future;

public class MyFutureClass {

    public static void main(String[] args) {

    }

    /**
     * Create a CompletableFuture which supplies a String value to second CompletableFuture. The two CompletableFutures
     * must be chained. The second CompletableFuture will be returned.
     *
     * The first CompletableFuture must the string "How are you?"
     * The second CompletableFuture must concat the following string " I'm fine."
     */
    public static Future<String> multipleFutures() {
        return null;
    }
}
