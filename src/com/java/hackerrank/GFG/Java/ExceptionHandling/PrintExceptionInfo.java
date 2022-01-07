package com.java.hackerrank.GFG.Java.ExceptionHandling;

/**
 * @Author pankaj
 * @create 1/5/22 10:30 AM
 */
public class PrintExceptionInfo {
    public static void main(String[] args) {
        int x = 10, y = 2, z = 0;
        System.out.println(x / y);
        try {
            System.out.println(x / z);
        } catch (ArithmeticException arithmeticException) {
            // System.out.println(arithmeticException);
            //System.out.println(arithmeticException.toString());
            // Incase of above two line- it will print only ExceptionName and description but not Stacktrace
            // arithmeticException.printStackTrace();
            // Incase of printStackTrace- it will print all three things i.e ExceptionName and description and Stacktrace
            System.out.println(arithmeticException.getMessage());//it will only  print exception description
        }
    }
}
