package com.sergio.javacourse.files;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class TestFilesOption {

    @Test
    public void testReadFile() {
        try {
            String filepath = "src/test/resources/third.txt";
            Files.write(Paths.get(filepath), Arrays.asList("first", "second", "third", "fourth"));
            String line = FilesOption.readFile(filepath);
            assertEquals("first", line, "This is not the content of the first line");
            Files.delete(Paths.get(filepath));
        } catch (IOException e) {
            fail();
        }
    }

    @Test
    public void testWriteFile() {
        String filepath = "src/test/resources/fourth.txt";
        FilesOption.writeFile(filepath);
        try {
            List<String> lines = Files.readAllLines(Paths.get(filepath));
            assertEquals(3, lines.size(), "Only two lines must be written in the file");
            assertEquals("first line", lines.get(0), "Content of the first line is incorrect");
            assertEquals("second", lines.get(1), "Content of the second line is incorrect");
            assertEquals("last line", lines.get(2), "Content of the last line is incorrect");
            Files.delete(Paths.get(filepath));
        } catch (IOException e) {
            fail();
        }
    }
}
