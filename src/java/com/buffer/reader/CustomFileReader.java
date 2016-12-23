package com.buffer.reader;


import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class CustomFileReader implements CustomReader {
    private final String fileName;

    public CustomFileReader(String inputFilePath) {
        this.fileName = inputFilePath;
    }

    @Override
    public String read() throws IOException {
        File file = new File(String.valueOf(Paths.get(this.fileName)));
//        String data= Files.readAllLines(file).toString();
        return "blah";
    }
}
