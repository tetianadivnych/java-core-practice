package org.example.lessonFunctionalInterfaces;

import java.util.function.BinaryOperator;

public class LambdaQuiz {

    public static void m1() {
        BinaryOperator<String> s = (s1, s2) -> s1 + s2 + s1;
        System.out.println(s.apply("a", "b"));

    }

    public static void main(String[] args) {
        m1();
    }
}
