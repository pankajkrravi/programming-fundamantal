package com.java.hackerrank.GFG.Strings;

import java.util.HashSet;
import java.util.Set;

/**
 * @Author pankaj
 * @create 10/24/21 6:27 PM
 * Given a string, check if all its characters are same or not
 */
public class CheckString {
    Boolean check(String s) {
        int n = s.length();
        for (int i = 1; i < n; i++)
            if (s.charAt(i) != s.charAt(0))
                return false;

        return true;
    }

    public static void main(String[] args) {
        System.out.println(new CheckForBinary().isBinary("geeks"));
        System.out.println(new CheckForBinary().isBinary("ggggg"));
    }
}
