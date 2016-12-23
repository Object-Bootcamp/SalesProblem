package com.buffer;


import com.buffer.reader.BufferReader;
import com.buffer.reader.CustomReader;
import com.buffer.writer.BufferWriter;
import com.buffer.writer.CustomWriter;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class Buffer {
    public void doBuffer() throws IOException {
        Scanner scanner = new Scanner(System. in);
        String data =scanner.nextLine();
        System.out.print(data);

    }

    public void doBuffer(String inputFilePath, String outputFilePath) throws IOException {
        byte[] data = Files.readAllBytes(Paths.get(inputFilePath));
        Files.write(Paths.get(outputFilePath), data);
    }

    public void buffer(CustomReader reader, CustomWriter writer) {
        String data = null;
        try {
            data = reader.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
        writer.write(data);
    }
}
