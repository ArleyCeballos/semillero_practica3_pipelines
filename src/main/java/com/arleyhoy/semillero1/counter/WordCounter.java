package com.arleyhoy.semillero1.counter;

import com.arleyhoy.semillero1.model.Summary;

import java.io.IOException;

public interface WordCounter {
    Summary process(String pathFile) throws IOException;
}
