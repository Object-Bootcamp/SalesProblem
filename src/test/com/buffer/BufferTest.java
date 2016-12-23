package com.buffer;

import com.buffer.reader.BufferReader;
import com.buffer.writer.BufferWriter;
import org.apache.commons.io.FileUtils;
import org.junit.Test;


import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;

import static org.junit.Assert.assertEquals;

public class BufferTest {
    @Test
    public void shouldPrintWhatIsGivenInConsole() throws IOException {
        String expected = "test";
        Buffer buffer = new Buffer();

        System.setIn(new ByteArrayInputStream(expected.getBytes()));
        ByteArrayOutputStream customOutputStream = new ByteArrayOutputStream();
        System.setOut(new java.io.PrintStream(customOutputStream));

        buffer.buffer(new BufferReader(), new BufferWriter());

        assertEquals(expected, customOutputStream.toString());
    }


    @Test
    public void shouldBeAbleToReadAndWriteToFile() throws IOException {
        Buffer buffer = new Buffer();
        String inputFilePath = "resources/input.txt";
        String outputFilePath = "resources/output.txt";

//        buffer.buffer(new CustomFileReader(inputFilePath), new CustomFileWriter(outputFilePath));
//        buffer.doBuffer(inputFilePath, outputFilePath);

        assertEquals("The files differ!", readFileContents(inputFilePath), readFileContents(outputFilePath));
    }

    @Test
    public void shouldBeAbleToReadFromConsoleAndWriteToFile()  {
        Buffer buffer = new Buffer();

    }

    private String readFileContents(String filePath) throws IOException {
        return FileUtils.readFileToString(new File(filePath));
    }


}
