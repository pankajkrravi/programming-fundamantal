package com.java.hackerrank.GFG.Arrays;

/**
 * @Author pankaj
 * @create 10/22/21 12:25 PM
 */
public class FindIndex {
    // Function to find starting and end index
    static  void findIndex(int a[], int N, int key) {
        //code here.
       // int [] result =new int[]
        for (int i=0;i<N;i++){
            if (key == a[i])
                System.out.print(i+" ");
        }
    }

    public static void main(String[] args) {
        findIndex(new int[]{1, 2, 3, 4, 5, 5}, 6, 5);
        System.out.println("--------------------------------------");
        findIndex(new int[]{ 6, 5, 4, 3, 1, 2 }, 6, 4);
    }
}
