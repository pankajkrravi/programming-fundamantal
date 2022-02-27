package com.java.hackerrank.HackerRank.ThirtyDaysOfcode.day28;

import java.util.HashSet;
import java.util.Set;

public class User {
    String userNme;
    String password;
    int age;
    Set<Integer> orderIds;

    User(String userNme, String customerPassword, int customAge, int customerAge, Set<Integer> orderId) {
        this.userNme = userNme;
        this.password = customerPassword;
        this.orderIds = orderId;
    }

    public static void main(String[] args) {
        Set set = new HashSet();
        set.add(146);
       // User pankaj = new User("Pankaj Kumar ravi", " pass8698", new HashSet<Integer>());

    }
}
