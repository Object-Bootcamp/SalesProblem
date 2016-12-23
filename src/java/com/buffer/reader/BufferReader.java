package com.buffer.reader;

import java.util.Scanner;

public class BufferReader implements CustomReader {
    @Override
    public String read() {
        Scanner scanner = new Scanner(System.in);
        String data =scanner.nextLine();
        return data;
    }

}
