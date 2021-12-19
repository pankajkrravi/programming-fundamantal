package com.java.hackerrank.HackerRank;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.HashSet;
import java.util.stream.Collectors;

/**
 * @Author pankaj
 * @create 12/18/21 9:06 PM
https://www.hackerrank.com/challenges/beautiful-triplets/problem?utm_campaign=challenge-recommendation&utm_medium=email&utm_source=7-day-campaign
 */

public class BeautifulTriplets {
    public static int main(String[] args) {
        // JS
        /*function beautifulTriplets(d, arr) {
            let result = 0;

            for (let i = 0; i < arr.length; i++) {
                if (arr.includes(arr[i] + d) && arr.includes(arr[i] + d * 2)) {
                    result++
                }
            }
            return result
        }*/
        Scanner scanner=new Scanner(System.in);
        int size=scanner.nextInt();
        int d=scanner.nextInt();

        int count=0;
        HashSet hashSet=new HashSet();
        for(int i=0;i<d;i++){
            int number=scanner.nextInt();
            if (hashSet.contains(number-d)&&hashSet.contains(number-2*d))
                count++;
            hashSet.add(number);
        }
        scanner.close();;
        return count;
    }
}

//we need to have a[i] + 2*d == a[j] + d == a[k] to have a beautiful triplet.
//
//Time Complexity: O(n)
//Space Complexity: O(n)