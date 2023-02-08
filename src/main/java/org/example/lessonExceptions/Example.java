package org.example.lessonExceptions;

public class Example {

    public static void test1() throws NumberFormatException {
        throw new NumberFormatException();
    }

    public static void test2()  throws CustomException {
        throw new CustomException();
    }

    public static void main(String[] args) throws Exception {
        try {
            test2();
        }
        finally {
            test1();
        }
    }
}
