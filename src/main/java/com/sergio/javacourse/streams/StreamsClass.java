package com.sergio.javacourse.streams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsClass {

    public static void main(String[] args) {

    }

    /**
     * Given a stream of words, filter the words longer than 10 characters, lower case each word and count how
     * many distinct words they are.
     */
    public static long countWords(Stream<String> stream) {
        return stream
                .filter(word -> word.length() > 10)
                .map(word -> word.toLowerCase())
                .distinct()
                .count();
    }

    /**
     * Given a stream of lines, filter lines with less than 16 words. Collect them into a list and return this list.
     */
    public static List<String> smallLines(Stream<String> stream) {
        return stream
                .filter(line -> line.split(" ").length < 16)
                .collect(Collectors.toList());
    }
}
