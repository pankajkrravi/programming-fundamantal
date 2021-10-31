package com.java.hackerrank.GFG.mathematical;

/**
 * @Author pankaj
 * @create 10/10/21 5:52 PM
 * ---------------------------------------  Amazon ----------------------------------
 */
public class Replaceall0swith5 {
    /* public static void convertFive(int n) {
//add code here.
int digit, sum = 0;
while (n > 0) {
    digit = n % 10;
    if (digit == 0) {
        digit = 5;
    }
    sum = sum * 10 + digit;
    n = n / 10;
}
System.out.print(n + " All O's replaced with 5 " + sum);
}
*/
        /*public static int convertFive(int n) {
            int sum = 0;
            for (int rank = 1; n > 0; n = n / 10, rank *= 10) {
                int digit = n % 10;
                if (digit == 0)
                    digit = 5;
                sum = sum + digit * rank;
            }
            return sum;
        }*/
    int convertFive(int n){
        int c = n;
        int ans = 0;
        int replace = 0;
        while(n>0){
            int a = n%10;
            if(a == 0){
                a=5;
            }
            n=n/10;
            replace = replace * 10+a;
        }
        while(replace>0){
            int a = replace%10;
            replace /=10;
            ans = ans*10+a;
        }
        return ans;
    }
    public static void main(String[] args) {
       // System.out.print(.convertFive(9384));
    }
}
