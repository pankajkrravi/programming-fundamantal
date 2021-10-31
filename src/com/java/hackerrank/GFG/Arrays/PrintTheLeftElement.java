package com.java.hackerrank.GFG.Arrays;

import java.util.Arrays;

/**
 * @Author pankaj
 * @create 10/22/21 7:39 PM
  ===================  Optimise and fix bugs ===============*/
public class PrintTheLeftElement {
    public int leftElement(int arr[], int n) {
       /* // Your code goes here
        Arrays.sort(arr);
        int leftElement =0;
        int i,j;
        for(i=n-1;i>n/2; i --){
               System.out.print(arr[i]+" , ");
            }
        for ( j=0;j< n/2-1;j++ ){
                System.out.print(arr[j]+" ,, ");
            }

            leftElement =arr[j+1];
            return leftElement;*/
        Arrays.sort(arr);
        int mid=n/2;
        if(n%2==0)
        return arr[mid-1];
     else
        return arr[mid];
    }

    public static void main(String[] args) {
        System.out.println();
        new PrintTheLeftElement().leftElement(new int[]{8, 1, 2, 9, 4, 3, 7, 5},8); // 4
      // System.out.println(new PrintTheLeftElement().leftElement(new int[]{7, 8, 3, 4, 2, 9, 5},7)); // 5
    }
}
