package com.java.hackerrank.ForkJava.Module5.String;

/**
 * @Author pankaj
 * @create 11/21/21 8:49 PM
n Java, arrays do not overwrite toString(). When we try write array directly to output console in Java, we get class_name + ‘@’ + hash_code of the array define by Object.toString(). See the below example for a better understanding.
 */
class GFGDemo {
    public static void main(String[] args)
    {
        String gfg[] = { "Geeks", "for", "Geeks" };
        System.out.println(gfg);
    }
}
