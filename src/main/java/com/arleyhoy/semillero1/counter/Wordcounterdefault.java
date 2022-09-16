package com.arleyhoy.semillero1.counter;

import com.arleyhoy.semillero1.Summary;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;


public class Wordcounterdefault implements WordCounter {
    @Override
    public Summary process(String pathFile) throws IOException {
        Path path = Paths.get(pathFile);
        long numberOfLines = getNumberOfLines(path);
        long numberOfWord = getNumberOfWord(path);

        return new Summary(numberOfLines, numberOfWord);
    }

    private static long getNumberOfLines(Path path) throws IOException {
      try(Stream<String> lines= Files.lines(path)){
          return lines.count();
      }
    }

    private static long getNumberOfWord(Path path) throws IOException {
        try(Stream<String> lines= Files.lines(path)){
            return  lines
                    .map(line -> line.split(""))
                    .mapToInt(WordsOfLine -> WordsOfLine.length)
                    .sum();
        }

    }


}
