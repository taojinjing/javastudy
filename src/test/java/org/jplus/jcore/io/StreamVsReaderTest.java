package org.jplus.jcore.io;

import org.junit.Test;

import java.io.IOException;

public class StreamVsReaderTest {

    @Test
    public void printAsByteCode() throws IOException {
        int[] bytes = new StreamVsReader().printAsByteCode();
        for (int abyte : bytes) {
            System.out.println(abyte);
        }
    }

    @Test
    public void printAsOutputStream() throws IOException {
        new StreamVsReader().printAsOutputStream();
    }

    @Test
    public void printAsReader() throws IOException {
        char[] chars = new StreamVsReader().printAsReader();
        for (char achar : chars) {
            System.out.println(achar);
        }

    }
}