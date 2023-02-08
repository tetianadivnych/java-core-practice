package org.example.lessonString;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StrQuizSolutions {

    public static void main(String[] args) {
        String s1, s2, s3;
        s1 = String.format("This is real number %f,", 2.5);
        s2 = String.format("integer number %d, ", 4);
        s3 = String.format("string %s", "hello");
        System.out.println(s1+s2+s3);

        System.out.println("123456789012".substring(5, 7));

        String template = "([^\\s][a-zA-Z])*s";
        String template2 = "s[a-z]*s";
        String template3 = "s[A-z0-9]+";
        String template4 = "s[a-zA-Z0-9]*";
        Pattern pattern = Pattern.compile(template3);
        Matcher matcher = pattern.matcher("sC2");
        System.out.println(matcher.matches());

        String text1 = "SoftServe";
        String text2 = new String("SoftServe");
        System.out.print(text1 == text2);
        System.out.println(text1.equals(text2));

        String s11 = "hello";
        String s12 = "brother";

        String str1 = s11 + s12;
        String str2 = s11.concat(s12);
        String str3 = s11.concat("".concat(s12));
        System.out.println(str3);
        System.out.println(s11.charAt(1));


        String task = "to do \\ a list for \\ a this day";
        System.out.println(task);
        task = task.replace('\\', '_');
        System.out.println(task);

    }
}
