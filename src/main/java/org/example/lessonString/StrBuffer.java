package org.example.lessonString;

public class StrBuffer {

    public static void main(String[] args) {
        String s1 = "Hello my dear mom";
        String s2 = ", I know one day we will see each other";
        StringBuffer sb = new StringBuffer(s1);
        sb.append(s2);
        sb.insert(s1.length(), s2);
        System.out.println(sb);
        System.out.println(sb.capacity());
        sb.trimToSize();
        System.out.println(sb.capacity());
    }
}
