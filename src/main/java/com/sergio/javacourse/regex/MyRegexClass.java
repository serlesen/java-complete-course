package com.sergio.javacourse.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MyRegexClass {

    public static void main(String[] args) {

    }

    /**
     * Write a regex to find if the input parameter contains the word 'hello' on it.
     * The word must match the case (upper cases are not allowed).
     * Return true if the input parameter contains the word 'hello', or false if not.
     */
    public static boolean searchWord(String str) {
        Pattern pattern = Pattern.compile(".*hello.*");
        Matcher matcher = pattern.matcher(str);
        return matcher.matches();
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
        Pattern pattern = Pattern.compile("Now, the time is [0-9]{4}-[0-9]{2}-[0-9]{2}T[0-9]{2}:[0-9]{2}:[0-9]{2}. Bye!");
        Matcher matcher = pattern.matcher(str);
        return matcher.matches();
    }

    /**
     * If the input parameter match the following pattern: 'Now, the time is 2022-05-04T03:02:01. Bye!', replace it
     * by 'Now the date is 04/05/2022. See you soon!'
     * If the input parameter doesn't match it, returns it as it is.
     */
    public static String replaceStructure(String str) {
        Pattern pattern = Pattern.compile("Now, the time is ([0-9]{4})-([0-9]{2})-([0-9]{2})T([0-9]{2}):([0-9]{2}):([0-9]{2}). Bye!");
        Matcher matcher = pattern.matcher(str);

        if (matcher.matches()) {
            return matcher.replaceAll("Now the date is $3/$2/$1. See you soon!");
        }

        return str;
    }
}
