package com.sergio.javacourse.input;

import java.util.Scanner;

public class KeyboardInput {

    public static void main(String[] args) {

    }

    /**
     * Write the necessary to read a string from the console. The read value must be returned to the method.
     */
    public static String readAString() {
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNext()) {
            return scanner.next();
        }
        return null;
    }

    /**
     * Write the necessary to read a complete line of strings from the console. The read value must be returned to the method.
     */
    public static String readALine() {
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextLine()) {
            return scanner.nextLine();
        }
        return null;
    }

    /**
     * Write the necessary to read a string which match the pattern 'hello'. The read value must be returned to the method.
     * If the input doesn't match the pattern 'hello', return null.
     */
    public static String readTheString() {
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNext("hello")) {
            return scanner.next("hello");
        }
        return null;
    }
}
