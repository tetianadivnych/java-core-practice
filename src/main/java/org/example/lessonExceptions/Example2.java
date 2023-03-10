package org.example.lessonExceptions;

public class Example2 {
    static String str = "";

    public static void method(String s) {
        try {
            if(!s.equals("SoftServe")) {
                throw new CustomException();
            }
            str += "m1 ";
            return;
        } catch (CustomException e) {
            str += "m2 ";
        } finally {
            str += "m3 ";
        }
        str += "m4 ";
    }

    public static void main(String[] args) {
        method("SoftServe");
        method("IT Academy");
        System.out.println(str);
    }
}
