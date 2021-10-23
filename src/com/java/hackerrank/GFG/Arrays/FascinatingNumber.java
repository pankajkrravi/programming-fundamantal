package com.java.hackerrank.GFG.Arrays;

/**
 * @Author pankaj
 * @create 10/23/21 4:46 PM
 * Fascinating Number: When a number( 3 digits or more ) is multiplied by 2 and 3, and when both these products are
 * concatenated with the original number, then it results in all digits from 1 to 9 present exactly once. There could
 * be any number of zeros and are ignored.
 * Input: 192
 * Output: Yes
 * After multiplication with 2 and 3, and concatenating with original number, resultant number is 192384576 which contains all digits from 1 to 9.
 * Input: 853
 * Output: No
 * After multiplication with 2 and 3, and concatenating with original number, the resultant number is 85317062559. In this, number 4 is missing and the number 5 has appeared multiple times. *
 * <p>
 * Approach:
 * <p>
 * <p>
 * Check if the given number has three digits or more. If not, print No.
 * Else, Multiply the given number with 2 and 3.
 * Concatenate these products with the given number to form a string.
 * Traverse this string, keep the frequency count of the digits.
 * Print No if any digit is missing or has appeared multiple times.
 * Else, print Yes.
 ******************************** Need to look *********************/
public class FascinatingNumber {
    boolean fascinating(String q) {
        // code here
        // frequency count array
        int [] frequency =new int[10];
        // obtaining the resultant number
               // int number =Integer.parseInt(q); // few test cases falling for input:  87917582637
        Long number =Long.parseLong(q);
        String  value =""+number+number*2+number*3;
        // Traversing the string character //by character
            for (int i=0;i<value.length();i++) {
                // gives integer value of //a character digit
                int digit = value.charAt(i)-'0';
                // To check if any digit has
                // appeared multiple times
                if (frequency[digit] > 0 && digit != 0)
                    return false;
                else
                    frequency[digit]++;
            }
                // Traversing through freq array to
                // check if any digit was missing
                for (int i=1;i<frequency.length;i++){
                    if (frequency[i] == 0)
                        return false;
            }
                return true;
    }

    public static void main(String[] args) {
        System.out.println(new FascinatingNumber().fascinating("192"));
        System.out.println(new FascinatingNumber().fascinating("87917582637"));
    }
}
