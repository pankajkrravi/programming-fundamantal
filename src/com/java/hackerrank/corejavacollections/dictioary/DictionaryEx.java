package com.java.hackerrank.corejavacollections.dictioary;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author pankaj
 * @create 1/13/22 1:12 PM
 */
public class DictionaryEx {
    public static void main(String[] args) {
        // English to Hindi Dictionary(Abstract Class)
            Map<String, String> engAndHindiDic = new HashMap<String, String>();
        engAndHindiDic.put("Monday", "Somwar");
        engAndHindiDic.put("Tuesday", "mangalwar");
        engAndHindiDic.put("Wednesday", "Budhwar");
        engAndHindiDic.put("Thursday", "Guruwar");
        engAndHindiDic.put("Friday", "Sukrwar");
        engAndHindiDic.put("Saturday", "Saniwar");
        engAndHindiDic.put("Sunday", "Raviwar");
        // retrieve
        System.out.println(engAndHindiDic.get("Monday"));
        System.out.println(engAndHindiDic.get("Tuesday"));
        System.out.println(engAndHindiDic.get("Wednesday"));
        System.out.println(engAndHindiDic.get("Thursday"));
        System.out.println(engAndHindiDic.get("Friday"));
        System.out.println(engAndHindiDic.get("Saturday"));
        System.out.println(engAndHindiDic.get("Sunday"));
        // print all of keys values
        System.out.println("-------------Print all keys from HM --------------");
        System.out.println(engAndHindiDic.keySet());
        System.out.println("-------------Print all values from HM --------------");
        System.out.println(engAndHindiDic.values());
    }
}
