package com.java.hackerrank.GFG.Arrays;

/**
 * @Author pankaj
 * @create 10/23/21 10:29 PM
 */
public class TransposeOfTheArray {
    int[][] transpose(int a[][], int n){
        // Code here
        int [][] transpose = new int[n][n];
       for (int i=0;i<n;i++){
           for(int j=0;j<n;j++){
                   transpose[j][i] = a[i][j];
           }
       }
       return transpose;
    }

    public static void main(String[] args) {
        int [] [] result= new TransposeOfTheArray().transpose(new int[][]{{1,2,3},{4,5,6},{7,8,9}},3);
        for (int r=0;r<result.length;r++){
            for(int s=0;s<result.length;s++){
                System.out.print(result[r][s]+" ");
            }
            System.out.println();
        }
    }
}
