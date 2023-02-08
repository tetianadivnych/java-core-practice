package org.example.lessonExceptions;

import java.io.IOException;

public class Parent {

    public void print() throws IOException {
        System.out.println("Parent is printing...");
        throw new IOException();
    }

}
