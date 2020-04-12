package com.ismdeep.interview;

public class InstanceOfDemo {
    public static void main(String[] args) {
        Object oString = "123";
        Object oInt = 123;
        System.out.println(oString instanceof String); /* 输出 true */
        System.out.println(oInt instanceof String); /* 输出 false */
    }
}
