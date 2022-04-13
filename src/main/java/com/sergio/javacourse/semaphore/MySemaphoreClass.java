package com.sergio.javacourse.semaphore;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Semaphore;

public class MySemaphoreClass {

    protected static List<String> myList = new ArrayList<>();
    protected static Semaphore semaphore = new Semaphore(1);

    public static void main(String[] args) {

    }

    /**
     * Create a Semaphore at the class level MySemaphoreClass. Add the input parameter to the list myList but
     * protect the list access with the previously created Semaphore.
     */
    public static void semaphoreOnList(String item) {
        try {
            semaphore.acquire();
            myList.add(item);
            semaphore.release();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
