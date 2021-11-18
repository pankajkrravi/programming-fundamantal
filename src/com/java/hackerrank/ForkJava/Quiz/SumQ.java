package com.java.hackerrank.ForkJava.Quiz;

/**
 * @Author pankaj
 * @create 11/18/21 4:41 PM
 */
public class SumQ {
    public static void main(String args[])
    {
        int arr[][] = new int[3][];
        arr[0] = new int[1];
        arr[1] = new int[2];
        arr[2] = new int[3];
        int sum = 0;

        for (int i = 0; i < 3; ++i)
            for (int j = 0; j < i + 1; ++j)
                arr[i][j] = j + 1;

        for (int i = 0; i < 3; ++i)
            for (int j = 0; j < i + 1; ++j)
                sum += arr[i][j];

        System.out.print(sum);
    }
/*    arr[][] is a 2D array, array has been allotted memory in parts. 1st row contains 1 element, 2nd row contains 2 elements and 3rd row contains 3 elements. each element of array is given i + j value in loop. sum contains addition of all the elements of the array.*/
}
