package com.arleyhoy.semillero1.counter;
import com.arleyhoy.semillero1.counter.model.Summary;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class WordcounterdefaultTest {
    @Test
    void mustReturnCorrectSummary() throws IOException {
        Path resourceDirectory = Paths.get("src","test","resources");
        String absolutePath=resourceDirectory.toFile().getAbsolutePath();
        WordCounter wordCounter =new Wordcounterdefault();

        Summary summary = wordCounter.process(absolutePath + File.separator +"test.txt");

        Assertions.assertEquals(2,summary.getNumberOfLines());
        Assertions.assertEquals(23, summary.getNumberOfWords());
    }
}
