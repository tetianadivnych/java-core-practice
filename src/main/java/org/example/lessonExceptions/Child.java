package org.example.lessonExceptions;

import java.io.IOException;

public class Child extends Parent {


    public void print() {
        System.out.println("Child is printing...");
    }

    public static void main(String[] args)  {
        Parent object = new Child();
        try {
            object.print();
        } catch (Exception e) {
            System.out.println("Catch block");
        } finally {
            System.out.println("Finally");
        }

    }
}
