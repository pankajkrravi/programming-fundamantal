package com.java.hackerrank.ForkJava.Module2;

/**
 * @Author pankaj
 * @create 11/17/21 7:19 AM
 * Congrats on completing Module 1.
 * <p>
 * In the previous module we learnt about the basics of Java.  Now, we'll move to more complex stuff. Here, we'll learn about arrays.
 * <p>
 * Given an array A of N elements. The task is to count number of even and odd elements in the array.
 * <p>
 * Example 1:
 * <p>
 * Input:
 * 5
 * 1 2 3 4 5
 * <p>
 * Output:
 * 3 2
 * <p>
 * Explanation:
 * In the given array, there are 3 odd elements
 * (1, 3, 5) and 2 even elements (2 and 4).
 * Example 2:
 * <p>
 * Input:
 * 4
 * 1 6 18 7
 * <p>
 * Output:
 * 2 2
 * <p>
 * Explanation:
 * In the given array, there are 2 odd
 * elements (1, 7) and 2 even elements (6 and 18).
 * User Task:
 * Your task is to complete the function countOddEven() which should print number of odd and number of even elements in a single line seperated by space. You don't need to provide the new lin
 */
public class CountOddEven {
    static void countOddEven(int a[], int n) {

        // Your code here
        int oddCount = 0, evenCount = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] % 2 == 0)
                evenCount++;
            else
                oddCount++;
        }
        System.out.print(oddCount+" ");
        System.out.print(evenCount);


    }
}
