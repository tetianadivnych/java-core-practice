package org.example.lessonString;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExEmail {

    public static void main(String[] args) {
        String email = "t.divnych@gmail.com";
        String email2 = "t.d.gmail.com";
        String pattern = "\\w+(\\.\\w+)*@(\\w+\\.)+\\w+";
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(email);
        System.out.println(m.matches());
    }
}
