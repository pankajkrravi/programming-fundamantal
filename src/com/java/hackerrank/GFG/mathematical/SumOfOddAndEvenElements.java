package com.java.hackerrank.GFG.mathematical;

/**
 * @Author pankaj
 * @create 10/13/21 11:05 PM
 */
public class SumOfOddAndEvenElements {
    public int[] find_sum(int n)
    {
        // Code here
        int result[] = new int[2];
        int evenSum=0,oddSum =0,i=1;

        while(i <= n){
            if(i% 2 != 0)
                oddSum =oddSum+i;
            else
            evenSum = evenSum+i;
             i++;
        }
        result[0] = oddSum;
        result[1] = evenSum;
        return result;
    }

    public static void main(String[] args) {
        int arr[] = new SumOfOddAndEvenElements().find_sum(5);
       System.out.println(arr[0]);
       System.out.println(arr[1]);
        }
}
