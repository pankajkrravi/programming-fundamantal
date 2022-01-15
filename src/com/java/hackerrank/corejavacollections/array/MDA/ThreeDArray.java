package com.java.hackerrank.corejavacollections.array.MDA;

/**
 * @Author pankaj
 * @create 1/15/22 6:05 PM
 */
public class ThreeDArray {
    public static void main(String[] args) {
        // base size ins maindatory, max it can be 55 in java dimension
        //3-D Array of base size 2
        int[][][] threeDArray = new int[2][][];

        threeDArray[0] = new int[3][];
        threeDArray[1] = new int[3][];

        threeDArray[0][0] = new int[3];
        threeDArray[0][1] = new int[1];
        threeDArray[0][2] = new int[2];

        threeDArray[1][0] = new int[3];
        threeDArray[1][1] = new int[1];
        threeDArray[1][2] = new int[2];

        threeDArray[0][0][0] = 1;
    }
}
