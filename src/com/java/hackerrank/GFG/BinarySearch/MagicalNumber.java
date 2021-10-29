package com.java.hackerrank.GFG.BinarySearch;

/**
 * @Author pankaj
 * @create 10/29/21 12:03 PM
Your friend loves magic and he has coined a new term - "Magical number". To perform his magic, he needs that Magic number. There are N number of people in the magic show, seated according to their ages in an ascending order. Magical number is that seat no. where the person has the same age as that of the given seat number.
Help your friend in finding out that "Magical number"

Input:
The first line of input contains an integer T denoting the number of test cases.
The first line of each test case is N, size of an array.
The second line of each test case contains N input A[].

Output:

Print "Magical Number"
Print "-1" when index value does not match with value. */
public class MagicalNumber {
    public static int binarySearch(int arr[], int low, int high) {
        // your code here
        for (int i=0;i<arr.length;i++){
            if (i == arr[i])
                return i;
        }
        return -1;
    }
}
 // =================== ned to fix it =================s