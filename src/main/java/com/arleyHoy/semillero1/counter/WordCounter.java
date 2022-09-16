package com.arleyHoy.semillero1.counter;

import com.arleyHoy.semillero1.model.summary;

import java.io.IOException;

public interface WordCounter {
    summary process(String pathFile) throws IOException;
}
