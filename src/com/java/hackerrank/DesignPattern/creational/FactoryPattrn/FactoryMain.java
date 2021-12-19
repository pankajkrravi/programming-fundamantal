package com.java.hackerrank.DesignPattern.creational.FactoryPattrn;

import javafx.scene.transform.Scale;

import java.util.Scanner;

/**
 * @Author pankaj
 * @create 12/15/21 11:12 AM
 */
public class FactoryMain {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter company type");
           String readCompanyType=scanner.next();
           ComputerFactory computerFactory=new ComputerFactory();
          CompanyInter ref= computerFactory.getCompanyTypr(readCompanyType);
            ref.companyType();
    }
}
