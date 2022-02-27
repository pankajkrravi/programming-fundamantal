package com.java.hackerrank.HackerRank.ProblemSolving;

import java.util.List;

// https://www.hackerrank.com/challenges/divisible-sum-pairs/problem
public class DivisibleSumPairs {
    /*
     * Complete the 'divisibleSumPairs' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. INTEGER k
     *  3. INTEGER_ARRAY ar
     */

    public static int divisibleSumPairs(int n, int k, List<Integer> ar)
    {
        int count=0;
        for(int i =0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(i<j)
                {

                    if((ar.get(i)+ar.get(j))%k ==0)
                    {
                        count++;
                    }
                }
            }
        }
        return count;
    }
}