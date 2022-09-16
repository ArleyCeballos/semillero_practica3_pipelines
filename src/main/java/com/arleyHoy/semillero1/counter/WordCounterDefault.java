package com.arleyHoy.semillero1.counter;

import com.arleyHoy.semillero1.model.summary;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;


public class WordCounterDefault implements WordCounter {
    @Override
    public summary process(String pathFile) throws IOException {
        Path path = Paths.get(pathFile);
        long numberOfLines = Files.lines(path).count();
        long numberOfWord = Files.lines(path)
                .map(line -> line.split(""))
                .mapToInt(WordsOfLine -> WordsOfLine.length)
                .sum();

        return new summary(numberOfLines, numberOfWord);
    }
}
