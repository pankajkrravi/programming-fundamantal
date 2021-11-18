package com.java.hackerrank.ForkJava.Module2;

/**
 * @Author pankaj
 * @create 11/18/21 8:06 PM
 * Given two strings S1 and S2 consisting of only lowercase characters whose anagrams are almost equal. The task is to count the number of characters which needs to be edited(delete) to make S1 equal to S2.
 * <p>
 * Example 1:
 * <p>
 * Input:
 * madame
 * madam
 * <p>
 * Output:
 * 1
 * <p>
 * Explanation:
 * String S1 = madame, string S2 = madam. character 'e' in
 * first string is need to be deleted to make S1 equal to S2.
 * Example 2:
 * <p>
 * Input:
 * suryansh
 * suryanshzzawesome
 * <p>
 * Output:
 * 9
 * <p>
 * Explanation:
 * String S1 = suryansh, string S2 = suryanshzzawesome.
 * All character after "suryansh" in second string are
 * need to be deleted to make S1 equal to S2.
 */
public class AlmostEqual {
    static int coutChars(String s1, String s2) {
        //Your code here
        /*int n = 0, count = 0;
        if (s1.length() > s2.length())
            n = s1.length();
        else
            n = s2.length();
        for (int i = 0; i < n; i++) {
            if (s1.charAt(i) != s2.charAt(i) && )
                count++;

        }
        return count;*/ // StringIndexOutOfBoundsException
      /*  int noc = Math.abs(s1.length() - s2.length());
        for(int i=0; i<Math.min(s1.length() ,s2.length()); i++){
            if(s1.charAt(i) != s2.charAt(i))
                noc++;
        }
        return noc;*/

        int[] arr = new int[26];
        int sum = 0;
        int len2 = s2.length();
        int len1 = s1.length();

        for (int i = 0; i < len1; i++){
            arr[ s1.charAt(i) - 'a']++;
        }

        for (int j = 0; j < len2; j++){
            arr[ s2.charAt(j) - 'a']--;
        }

        for (int v = 0; v <26; v++){
            sum += Math.abs(arr[v]);
        }

        return sum;
        }

    public static void main(String[] args) {
        System.out.println(coutChars("suryansh", "suryanshzzawesome"));
    }
}
