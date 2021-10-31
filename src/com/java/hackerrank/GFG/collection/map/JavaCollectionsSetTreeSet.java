package com.java.hackerrank.GFG.collection.map;

import java.util.TreeSet;

/**
 * @Author pankaj
 * @create 10/30/21 8:03 PM
Given n strings added in a TreeSet and four characters a,b,c,d. Firstly print all the strings which are less than a , then print all the strings which are greater than or equal to b. In the end print all the strings which are greater than or equal to c and less than d i.e between c and d ( excluding d ).

Input:

The first line of input is T denoting the number of testcases. First line consists of an integer n. Next line contains n spaced strings. Last line of each test case consists of 4 space separated characters.

Output:

For each test case output will be in three lines:
First Line :  Print all the strings which are less than a (char variable).
Second Line : Print all the strings which are greater than or equal to b (char variable).
Third Line :  Print all the strings which are greater than or equal to c and less than d i.e between c and d ( excluding d ).*/

public class JavaCollectionsSetTreeSet {
    void task(TreeSet<String> ts, char a, char b, char c, char d) {
// Add your code here. Print the output here itself.
        java.util.Set<String> setA = new java.util.TreeSet<>();
        java.util.Set<String> setB = new java.util.TreeSet<>();
        java.util.Set<String> setC = new java.util.TreeSet<>();

        java.util.Iterator it = ts.iterator();

        while (it.hasNext()) {
            String str = it.next().toString();
            char ch = str.charAt(0);
            if (ch < a)
                setA.add(str);

            if (ch >= b)
                setB.add(str);

            if (ch >= c && ch < d)
                // setC.add(str);="" }="" System.out.println(setA);="" System.out.println(setB);="" System.out.println(setC);="" }="">}
                System.out.println();
        }
    }
}

 // ================== fix it ===============