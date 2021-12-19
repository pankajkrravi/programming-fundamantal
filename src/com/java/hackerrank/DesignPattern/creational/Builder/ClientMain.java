package com.java.hackerrank.DesignPattern.creational.Builder;

/**
 * @Author pankaj
 * @create 12/14/21 7:15 PM
 */
public class ClientMain {
    public static void main(String[] args) {
        CarComponent carComponent=new ChinaCarBuilder();
        CarDirector carDirector=new CarDirector(carComponent);
        carDirector.buildCar();
        Car car=carDirector.getCar();
        System.out.println("Car ids --> " +car);
    }
}

