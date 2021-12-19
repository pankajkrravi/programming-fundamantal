package com.java.hackerrank.DesignPattern.creational.FactoryPattrn;

/**
 * @Author pankaj
 * @create 12/15/21 11:05 AM
 */
public class ComputerFactory {
    public CompanyInter getCompanyTypr(String type){
        if (type == null){
            return null;
        } else if (type.equalsIgnoreCase("IT")){
            return new IT();
        } else if (type.equalsIgnoreCase("AUTOMOBILE")){
            return new AutoMobile();
        }else if (type.equalsIgnoreCase("INSURANCE")){
            return new Insurance();
        }
        return null;
    }
 }
