package com.java.hackerrank.HackerRank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Author pankaj
 * @create 1/17/22 9:53 AM
 * https://www.hackerrank.com/challenges/30-2d-arrays/problem
 */
public class Day11_2DArrays {


    public void meth(int arr[][]) {
        int sum[] = new int[16];
        int h = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                sum[h] = arr[i][j] + arr[i][j + 1] + arr[i][j + 2]
                        + arr[i + 1][j + 1] + arr[i + 2][j] + arr[i + 2][j + 1]
                        + arr[i + 2][j + 2];
                h++;
            }
        }
        Arrays.sort(sum);
        System.out.println(sum[15]);
    }
}