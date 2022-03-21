package com.sergio.javacourse.buffered;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class TestBufferedOption {

    @Test
    public void testReadFile() {
        try {
            String filepath = "src/test/resources/first.txt";
            Files.write(Paths.get(filepath), Arrays.asList("first", "second", "third", "fourth"));
            String line = BufferedOption.readFile(filepath);
            assertEquals("second", line, "This is not the content of the second line");
            Files.delete(Paths.get(filepath));
        } catch (IOException e) {
            fail();
        }
    }

    @Test
    public void testWriteFile() {
        String filepath = "src/test/resources/second.txt";
        BufferedOption.writeFile(filepath);
        try {
            List<String> lines = Files.readAllLines(Paths.get(filepath));
            assertEquals(2, lines.size(), "Only two lines must be written in the file");
            assertEquals("first line", lines.get(0), "Content of the first line is incorrect");
            assertEquals("last line", lines.get(1), "Content of the last line is incorrect");
            Files.delete(Paths.get(filepath));
        } catch (IOException e) {
            fail();
        }
    }
}
