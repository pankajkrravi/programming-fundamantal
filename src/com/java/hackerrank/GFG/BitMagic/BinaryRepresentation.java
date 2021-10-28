package com.java.hackerrank.GFG.BitMagic;

/**
 * @Author pankaj
 * @create 10/26/21 6:09 PM
 * ---- print Binary representation of a given number N.
 * Input:
 * N = 2
 * Output:
 * 000000000000000000000000000010
 * Explanation:
 * The binary representation of 2 is '10'
 * but we need to print in 30 bits so append
 * remaining 0's in the left.
 * <p>
 * *****************************  Microsoft *********************************
 */
public class BinaryRepresentation {
    static String getBinaryRep(int N) {
        String str = "";
        long i;
        for (i = 1 << 30; i > 0; i = i / 2) {
            if ((N & i) != 0) {
                str = str + "1";
            } else {
                str = str + "0";
            }
        }
        return str;
    }

    public static void main(String[] args) {
        System.out.println(getBinaryRep(2));
    }
}
 // ============================= Need to fix ============ gives 31 bit o/p == expected is 30