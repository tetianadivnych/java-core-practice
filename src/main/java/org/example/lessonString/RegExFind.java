package org.example.lessonString;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExFind {

    public static void main(String[] args) {
        String phrase = "Hello my 4 all dear friends and dear family";
        String pattern = "\\w+\\s+\\d";
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(phrase);
        while (m.find()) {
            System.out.print(phrase.substring(m.start(), m.end()) + "*");
        }
    }
}
