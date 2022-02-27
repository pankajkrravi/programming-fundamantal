package com.java.hackerrank.HackerRank.ProblemSolving;

// https://www.hackerrank.com/challenges/electronics-shop/problem
public class ElectronicShop {
    static int getMoneySpent(int[] keyboards, int[] drives, int b) {
        int maxSum=-1;
        for(int i=0; i<keyboards.length; i++){
            if(keyboards[i]<b){
                for(int j=0; j<drives.length; j++){
                    if((keyboards[i]+drives[j])>maxSum && (keyboards[i]+drives[j])<=b){
                        maxSum=keyboards[i]+drives[j];
                    }
                }
            }
        }
        return maxSum;
    }
}
