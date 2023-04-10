package com.yangweiyao.pattern.decorate.io;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

public class InputTest {

    public static void main(String[] args) {
        int c;
        try (InputStream io = new LowerCaseInputStream(new BufferedInputStream(Files.newInputStream(Paths.get(""))))) {
            while ((c = io.read()) >= 0) {
                System.out.print((char) c);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
