package com.ismdeep.interview;

public class StringAndJVM {
    public static void main(String[] args) {
        String s1 = new String("Java");
        String s2 = s1.intern();
        String s3 = "Java";

        System.out.println(s1 == s2);
        System.out.println(s2 == s3);
    }
}
