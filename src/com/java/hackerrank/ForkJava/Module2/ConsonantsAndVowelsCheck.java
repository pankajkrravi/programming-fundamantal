package com.java.hackerrank.ForkJava.Module2;

/**
 * @Author pankaj
 * @create 11/18/21 7:28 PM
You are given a string s containing only lowecase letters. You need to count the number of vowels and the number of consonants.

If vowel count > consonant count then print - “Yes”(without quotes).
If vowel count < consonant count then print - “No”(without quotes).
If vowel count = consonant count then print - “Same”(without quotes).
Example 1:

Input:
the quick brown fox jumps over the lazy dog

Output:
No
Example 2:

Input:
aaaaaa

Output:
Yes
Your Task:
Since this is a function problem, you don't need to take any input. Just complete the function checkString(string  s) that take s as input and produces output.


 */
public class ConsonantsAndVowelsCheck {

    static void checkString(String s) {
        int v=0;
        int c=0;

        //Your code here
        char [] charArray =s.toCharArray();
        for (int i=0;i<charArray.length;i++){
            if ((charArray[i] =='a'|| charArray[i] =='e'|| charArray[i] =='i'|| charArray[i] =='o'|| charArray[i] =='u') && (charArray[i] !=' '))
                v++;
                else if ((charArray[i] !='a'|| charArray[i] !='e'|| charArray[i] !='i'|| charArray[i] !='o'|| charArray[i] !='u') && (charArray[i] !=' '))
                    c++;
        }
        System.out.println("vowel = "+v+  " const  = "+c );
        if(v>c)
            System.out.print("Yes");
        else if(c>v)
            System.out.print("No");
        else
            System.out.print("Same");

        System.out.println();
    }

    public static void main(String[] args) {
        checkString("the quick brown fox jumps over the lazy dog");
        checkString("a i u e o t m n s w");
    }
}
