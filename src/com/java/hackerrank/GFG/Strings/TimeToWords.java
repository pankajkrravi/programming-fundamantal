package com.java.hackerrank.GFG.Strings;

/**
 * @Author pankaj
 * @create 10/29/21 9:18 PM
 */
public class TimeToWords {

    String timeToWord(int H, int M)
    {
        String a[] = { "zero", "one", "two", "three", "four","five", "six", "seven", "eight", "nine","ten", "eleven", "twelve", "thirteen","fourteen", "fifteen", "sixteen", "seventeen","eighteen", "nineteen", "twenty", "twenty one","twenty two", "twenty three", "twenty four","twenty five", "twenty six", "twenty seven","twenty eight", "twenty nine"};
        String  tmp="";
        if(M==0)
            tmp=a[H]+" 0' clock";
        else if(M==15)
            tmp="quarter past "+a[H];
        else if(M==30)
            tmp="half past "+a[H];
        else if(M==45)
            if(H==11)
                tmp="quarter to "+a[H+1];
            else
                tmp="quarter to "+a[(H+1)%12];
        else if(M<30)
            if(M==1)
                tmp=a[M]+" minute past "+a[H];
            else
                tmp=a[M]+" minutes past "+a[H];
        else if(M>30 && M<=60)
            if(M==59)
                if(H==11)
                    tmp=a[60-M]+" minute to "+a[H+1];
                else
                    tmp=a[60-M]+" minute to "+a[(H+1)%12];
            else
            if(H==11)
                tmp=a[60-M]+" minutes to "+a[H+1];
            else
                tmp=a[60-M]+" minutes to "+a[(H+1)%12];
        return tmp;
    }

}
