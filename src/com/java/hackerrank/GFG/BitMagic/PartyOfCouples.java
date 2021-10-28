package com.java.hackerrank.GFG.BitMagic;

/**
 * @Author pankaj
 * @create 10/26/21 5:39 PM
 * In a party of N people, each person is denoted by an integer. Couples are represented by the same number.
 * Find out the only single person in the party of couples.
Input: N = 5
arr = {1, 2, 3, 2, 1}
Output: 3
Explaination: Only the number 3 is single.

    ********************************** Ola Cabs ***************************/

public class PartyOfCouples {
    static int findSingle(int N, int arr[]){
        // code here
        int single=0;
            for (int i=0;i<N;i++){
                    single^= arr[i];
            }
            return single;
    }

    public static void main(String[] args) {
        System.out.println(findSingle(5,new int[]{1,2,3,2,1}));
    }
}
