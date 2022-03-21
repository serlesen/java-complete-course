package com.sergio.javacourse.files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class FilesOption {

    public static void main(String[] args) {

    }

    /**
     * Read the content of a file, with the file path passed as argument, using the Files implementation.
     * Return only the first line.
     */
    public static String readFile(String filepath) {
        try {
            List<String> lines = Files.readAllLines(Paths.get(filepath));
            return lines.get(0);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }

    }

    /**
     * Create a file, with the file path passed as argument, using the Files implementation.
     * The file must contain 3 lines: "first line", "second", "last line".
     */
    public static void writeFile(String filepath) {
        List<String> lines = Arrays.asList("first line", "second", "last line");
        try {
            Files.write(Paths.get(filepath), lines);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
