package com.java.hackerrank.GFG.Java.throwVsThrows;

/**
 * @Author pankaj
 * @create 1/5/22 12:29 PM
 */
public class youngerAgeException extends RuntimeException{
    youngerAgeException(String message){
        super(message);// to make available message to Default message ExceptionHandler

    }
}
