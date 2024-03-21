package com.serenitydojo;

import org.junit.Test;

public class HelloWorldWriterTest {

    @Test
    public void ShouldWriteHelloWordToTheConsole () {
        HelloWorldWriter writer = new HelloWorldWriter();
        writer.writerHelloWord();
    }
}
