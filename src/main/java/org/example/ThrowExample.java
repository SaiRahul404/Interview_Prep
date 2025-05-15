package org.example;

import java.io.FileReader;
import java.io.IOException;

public class ThrowExample {
    public static void main(String[] args) throws Exception {
        readFile();
    }
    static void readFile() throws IOException {
        FileReader file = new FileReader("file.txt");  // file might not exist
    }


}
// Used when you want to raise an error intentionally. - throw
// This method might throw an exception, be ready to handle it! - throws
