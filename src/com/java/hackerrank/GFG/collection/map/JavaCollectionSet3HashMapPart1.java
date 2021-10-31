package com.java.hackerrank.GFG.collection.map;

import java.util.HashMap;

/**
 * @Author pankaj
 * @create 10/30/21 8:23 PM
HashMap is a part of collection in Java. It provides the basic implementation of Map interface of Java. It stores the data in (Key, Value) pairs. To access a value you must know its key, otherwise, you can’t access it. HashMap is known as HashMap because it uses the technique called Hashing. Solve the following problem using a HashMap.

Given two arrays key[] and arr[] of size N and a key s. Each key[i] and arr[i] form a key-value pair. Find if the value of S in the N key-value pairs.



Example 1:

Input: n = 3
keys = {sak, varun, vijay}
arr = {5, 7, 3}
s = sak
Output: 5
Explaination: The key is present in the map.
So its corresponding value is returned which
is 5.
 */
public class JavaCollectionSet3HashMapPart1 {
    static int map(int n, String keys[], int arr[], String s){
        for (int i = 0; i < n; ++i)
        {

            if (keys[i].equals(s)){

                return arr[i];

            }
        }
        return -1;
    }
    public static void main(String[] args) {
        System.out.println(map(3,new String[]{"sak","varun","vijay"},new int[]{5,7,3},"s"));
        System.out.println(map(3,new String[] {"csdb", "dsh", "askj", "adfs"},new int[]{4,5,8,9},"dptu"));
    }
}
