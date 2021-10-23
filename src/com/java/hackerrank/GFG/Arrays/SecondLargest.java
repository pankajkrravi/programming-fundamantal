package com.java.hackerrank.GFG.Arrays;

import java.util.Arrays;

/**
 * @Author pankaj
 * @create 10/22/21 3:25 PM
  --------------------------------- Sap Labs, RockStand ----------------------------------------- */
public class SecondLargest {
    int print2largest(int arr[], int n) {
        // Approach ----------1
        /*int temp;
          for (int i=0;i<n;i++){
                    for (int j=i+1;j<n;j++){
                        if (arr[i] > arr[j]){
                            temp = arr[i];
                            arr[i] =arr[j];
                            arr[j] =temp;
                        }
                    }
        }
          return arr[n-2];*/
        // Approach-------------- 2
       /* Arrays.sort(arr);
        return arr[n-2];*/

        // Approach ------3
            // code here
            int num=0;
            boolean c=true;
            if(n<2)
                return -1;
            Arrays.sort(arr);
            for(int i=n-2;i>=0;i--) {
                if(arr[i]!=arr[n-1]){
                    num=arr[i];
                    c=false;
                    break;
                }
            }
            if(c)
                return -1;
            return num;
        }

    public static void main(String[] args) {
        System.out.println(new SecondLargest().print2largest(new int[] {12, 35, 1, 10, 34, 1},6));
        System.out.println(new SecondLargest().print2largest(new int[] {10, 5, 10},3));

    }
}
