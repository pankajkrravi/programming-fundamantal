package com.java.hackerrank.ForkJava.Module5;

import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

/**
 * @Author pankaj
 * @create 11/21/21 7:24 PM
 * Given two arrays, one is array of political parties namely -  party, and their corresponding array of seats received - seats. You have to print the political parties in lexicographical sorted order along with their seats, and highest seats received by the party.
 * <p>
 * <p>
 * <p>
 * Input Format:
 * The first line of input contains T denoting the number of testcases. T testcases follow. Each testcase contains three lines of input. The first line contains number of parties N. The second line contains the names of the parties. The third line contains the votes corresponding to each party.
 * <p>
 * Output Format:
 * For each testcase, in a new line, print the required answer.
 * <p>
 * User Task:
 * Your task is to complete the function Election2019(party, seats, n)  which accepts three arguments and prints the required result.
 * <p>
 * Constraints:
 * 1 <= T<= 100
 * 1 <= N <= 26
 * 1 <= seats <= 543
 * <p>
 * Examples:
 * Input:
 * 1
 * 7
 * A B C D E F G
 * 90 150 33 23 17 500 2
 * Output:
 * A 90
 * B 150
 * C 33
 * D 23
 * E 17
 * F 500
 * G 2
 * 500
 * <p>
 * Explanation:
 * Testcase1:
 * We print parties and their respective seats in lexiographically sorted order. At the end we print the maximum seats.
 */
public class PartiesAndSeats {
    public static void Election2019(String party[], int seats[], int n)
    {
        //Your code here
        int max=0;
        Map<String,Integer> mp=new TreeMap<>();
        for(int i=0; i<n; i++){
            mp.put(party[i],seats[i]);
        }
        for(int e:mp.values()){
            if(e>max){
                max=e;
            }
        }
        for(Map.Entry<String,Integer> a:mp.entrySet()){
            System.out.println(a.getKey()+" "+a.getValue());
        }
        System.out.println(max);
    }

    public static void main(String[] args) {
        Election2019(new String[]{"A B C D E F G"}, new int[]{90, 150, 33, 23, 17, 500, 2}, 7);
    }
}
