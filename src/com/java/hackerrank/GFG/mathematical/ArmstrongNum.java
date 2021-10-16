package com.java.hackerrank.GFG.mathematical;

/**
 * @Author pankaj
 * @create 10/10/21 11:52 AM
  -------------------------- Oracle, VMWare ----------------------------------------- */
public class ArmstrongNum {
    static String armstrongNumber(int n) {
        // code here
        int temp = n;
        int sum = 0, digitCube = 1;
        while (temp > 0) {
            int digit = temp % 10;
            digitCube = digit * digit * digit;
            sum = sum + digitCube;
            temp = temp / 10;
        }
        if (sum == n)
            return "Yes";
        else
            return "No";
    }

    public static void main(String[] args) {
        System.out.println(ArmstrongNum.armstrongNumber(407));
    }
}