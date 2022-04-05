package com.sergio.javacourse.streams;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestStreamsClass {

    @Test
    public void testCount() {
        String line = "The authors made an exhaustive study on publication related to application of IA algorithms to Supply Chain regarding SCORM level affected, last years tendencies, future forecast of their use.  I would highly recommend:  1. use of color for better graphics understanding 2. mention names of authors or books, to not begin with references.  I miss a comparison table of efficiency, advantages, disadvantages and uses for all AI algorithms used.";
        long count = StreamsClass.countWords(Arrays.stream(line.split(" ")));

        assertEquals(8, count);
    }

    @Test
    public void testSmallLines() throws IOException {
        Stream<String> stream = Files.lines(Paths.get("src/main/resources/reviews.txt"));
        List<String> lines = StreamsClass.smallLines(stream);

        assertEquals(7, lines.size());
    }
}
