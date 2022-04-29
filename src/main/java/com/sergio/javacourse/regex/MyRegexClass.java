package com.sergio.javacourse.regex;

public class MyRegexClass {

    public static void main(String[] args) {

    }

    /**
     * Write a regex to find if the input parameter contains the word 'hello' on it.
     * The word must match the case (upper cases are not allowed).
     * Return true if the input parameter contains the word 'hello', or false if not.
     */
    public static boolean searchWord(String str) {
        return false;
    }

    /**
     * Write a regex to find if the input parameter contains the following structure: 'Now, the time is 2022-05-04T03:02:01. Bye!'.
     * The date and time is a variable, but it must follow the following pattern:
     * - 4 numbers for the year, followed by a hyphen
     * - 2 numbers for the month, followed by a hyphen
     * - 2 numbers for the month, followed by a T
     * - 2 numbers for the hour, followed by :
     * - 2 numbers for the minutes, followed by :
     * - 2 numbers for the seconds
     * The rest of the str must remains constant.
     * Returns true if the input parameter follows this pattern, or else return false.
     */
    public static boolean searchStructure(String str) {
        return false;
    }

    /**
     * If the input parameter match the following pattern: 'Now, the time is 2022-05-04T03:02:01. Bye!', replace it
     * by 'Now the date is 04/05/2022. See you soon!'
     * If the input parameter doesn't match it, returns it as it is.
     */
    public static String replaceStructure(String str) {
        return null;
    }
}
