package org.example.lessonString;

public class StrBuilder {

    public static void main(String[] args) {
        String s1 = "Hello my dear mom";
        String s2 = ", I know one day we will see each other";
        StringBuilder stringBuilder = new StringBuilder(s1);
        stringBuilder.append(s2);
        System.out.println(stringBuilder);
        System.out.println(stringBuilder.substring(19));
        System.out.println("Capacity before: " + stringBuilder.capacity());
        stringBuilder.trimToSize();
        System.out.println("Capacity after: " + stringBuilder.capacity());
    }
}
