package org.jplus.jcore.io;

import java.io.*;

public class StreamVsReader {
    private static final String HELLO = "你好";

    public int[] printAsByteCode() throws IOException {
        byte[] bytes = HELLO.getBytes();
        int[] b = new int[bytes.length];
        int i = 0;
        try (InputStream inputStream = new ByteArrayInputStream(bytes)) {
            while (inputStream.available() != 0) {
                b[i++] = inputStream.read();
            }
        }
        return b;
    }

    public void printAsOutputStream() throws IOException {
        try (InputStream inputStream = new ByteArrayInputStream(HELLO.getBytes());
             OutputStream os = new ByteArrayOutputStream()) {
            while (inputStream.available() != 0) {
                os.write(inputStream.read());
            }
            System.out.println(os.toString());
        }
    }

    public char[] printAsReader() throws IOException {
        char[] c = new char[HELLO.length()];
        try (Reader reader = new InputStreamReader(new ByteArrayInputStream(HELLO.getBytes()))) {
            int length = reader.read(c);
            System.out.println(length);
        }
        return c;
    }
}
