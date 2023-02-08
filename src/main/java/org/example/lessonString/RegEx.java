package org.example.lessonString;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegEx {

    public static void main(String[] args) {
        String phrase = "tania @tetiana_divnych 001 is looking for practice";
        String namePattern = "Tania";
        Pattern p = Pattern.compile(namePattern, Pattern.CASE_INSENSITIVE);
        Matcher m = p.matcher(phrase);
        System.out.println(m.lookingAt());
    }
}
