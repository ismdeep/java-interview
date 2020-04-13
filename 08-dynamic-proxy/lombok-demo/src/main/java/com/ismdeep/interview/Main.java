package com.ismdeep.interview;

import com.ismdeep.interview.model.User;

public class Main {
    public static void main(String[] args) {
        User user = new User();
        user.setId(1);
        user.setUsername("ismdeep");
        user.setPassword("123456");
        System.out.println(user);
    }
}
