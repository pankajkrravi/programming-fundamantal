package com.java.hackerrank.GFG.Arrays;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author pankaj
 * @create 10/24/21 2:12 PM
 *   find the elements whose value is equal to that of its index value
 *
  ****************************** Amazon, factSte, Flipkart,Hike *******************************/
public class ValueEqualToIndexValue {
    ArrayList<Integer> valueEqualToIndex(int arr[], int n) {
        // code here
        ArrayList<Integer> sameIndexValue =new ArrayList<Integer>();
        for (int i=0;i<n;i++){
                if (i +1== arr[i])
                    sameIndexValue.add(arr[i]);
        }
        return sameIndexValue;
    }

    public static void main(String[] args) {
        ArrayList<Integer> result =new ValueEqualToIndexValue().valueEqualToIndex(new int[]{15,2,45,12,7},5);

        for (int v : result ) {
            System.out.print(v+" ");
        }
    }
}
