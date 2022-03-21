package com.sergio.javacourse.buffered;

import java.io.*;

public class BufferedOption {

    public static void main(String[] args) {

    }

    /**
     * Read the content of the file passed as input argument using the FileReader and BufferedReader implementation.
     * Return only the content of second line.
     */
    public static String readFile(String filepath) {
        try (
                FileReader fileReader = new FileReader(filepath);
                BufferedReader br = new BufferedReader(fileReader);
        ) {
            br.readLine();
            return br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
     * Create a file, with the file path passed as input argument, using the FileWriter and BufferedWriter implementation.
     * Write two lines in the file: "first line" and "last line".
     */
    public static void writeFile(String filepath) {
        try (
                FileWriter writer = new FileWriter(filepath);
                BufferedWriter br = new BufferedWriter(writer);
        ) {
            br.write("first line\n");
            br.write("last line\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
