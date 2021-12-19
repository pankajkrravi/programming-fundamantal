package com.java.hackerrank.DesignPattern.creational.Singleton;

/**
 * @Author pankaj
 * @create 12/14/21 6:45 PM
 */
public class EarlyInilitiazitionSingleP {
    private static EarlyInilitiazitionSingleP singleP=new EarlyInilitiazitionSingleP();
    // private constructor
    private EarlyInilitiazitionSingleP(){

    }
    public static EarlyInilitiazitionSingleP getInstance(){
        return singleP;
    }
}
