package org.example.lessonString;

import java.util.Arrays;

public class StrMethods {

    public static void main(String[] args) {
        String text = "rock and  stone      are  friends";
        System.out.println("Original string:" + text);
        String noSpaceString = text.replaceAll("\\s+", " ");
        System.out.println("After space removal: " + noSpaceString);
        String splitBySpace = Arrays.toString(noSpaceString.split("\\s+"));
        System.out.println("After split: " + splitBySpace);
        CharSequence charSequence = splitBySpace.subSequence(0, 10);
        System.out.println("New subsequence: " + charSequence);
    }
}
