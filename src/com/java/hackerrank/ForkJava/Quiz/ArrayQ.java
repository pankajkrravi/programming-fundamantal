package com.java.hackerrank.ForkJava.Quiz;

/**
 * @Author pankaj
 * @create 11/18/21 4:40 PM
 */
public class ArrayQ {
    public static void main(String[] args) {
        int arr[] = new int[]{2, 9, 8, 4, 6};
        int i;
        for(i = 0; i < arr.length; i++)
        {
            if(arr[i] == 8)
                break;
        }
        // cout << i << endl;
        for(int j = i; j < arr.length; j++)
        {
            arr[j] = arr[j+1];
        }
        for(int k = 0; k < arr.length; k++)
            System.out.print(arr[k] + " ");
    }
}
