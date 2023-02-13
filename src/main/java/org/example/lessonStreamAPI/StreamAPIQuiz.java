package org.example.lessonStreamAPI;

import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamAPIQuiz {

    public void printString() {
        Stream<List<String>> stream = Stream.of(
                Arrays.asList("SoftServe ", "IT Academy "),
                Arrays.asList("IT Academy ", "Java "),
                Arrays.asList("Test", "IT"));
        stream.flatMap(strings -> strings.stream())
                .filter(s -> s.contains("IT"))
                .forEach(System.out::println);
    }

    public void printNums() {
        List<Integer> names = Arrays.asList(1, 2, 3, 4, 5, 6);
        names.forEach(x -> --x);
        names.stream().map(x -> x + 2).filter(x -> x < 4);
        names.forEach(System.out::println);
    }

    public void printNums2() {
        Stream<Integer> stream = Stream.of(3, 5, 3, 2, 9, 1);
        stream.map(x -> x + 2)
                .distinct()
                .forEach(System.out::println);
    }

    public void printDate() {
        LocalDate date = LocalDate.of(2020, 9, 1);
        date.plusDays(5).minusWeeks(3);
        date.with(TemporalAdjusters.firstDayOfMonth());
        System.out.println(date);
    }

    public void printCharacters() {
        Stream<Character> stream = Stream.of('1', '3', '1', '8', '6', '4');
        stream.sorted((x, y) -> y.compareTo(x))
                .filter(x -> x >= 8)
                .findFirst()
                .ifPresent(System.out::println);
    }

    public static void main(String[] args) {
        StreamAPIQuiz quiz = new StreamAPIQuiz();
        quiz.printString();
        quiz.printNums2();
        quiz.printDate();
        quiz.printCharacters();
    }
}
