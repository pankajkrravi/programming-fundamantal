package com.java.hackerrank.GFG.Arrays;

/**
 * @Author pankaj
 * @create 10/23/21 9:18 PM
 */
public class AverageInStream {
    float[] streamAvg(int[] arr, int n) {
        // code here
        float []  avgArray  = new float[n];
        float numberSum=0;
        for (int i=0;i<n;i++){
          numberSum =numberSum+arr[i];
          avgArray[i] = numberSum/(i+1);
        }
        return avgArray;
    }

    public static void main(String[] args) {
        float result [] =new AverageInStream().streamAvg(new int[]{10,20,30,40,50},5);
        for (float v : result) {
            System.out.print(v+" ");
        }
    }
}
