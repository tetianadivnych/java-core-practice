package org.example.lessonString;

public class StrFormatting {

    public static void main(String[] args) {
        System.out.printf("%S!%n", "World");
        String education = "school";
        double salary = 3333.554535;
        System.out.printf("'%S'%n", education);
        System.out.printf("salary is %.2f%n", salary);
        String format = "%.2f";
        System.out.printf(format, salary);
    }
}
