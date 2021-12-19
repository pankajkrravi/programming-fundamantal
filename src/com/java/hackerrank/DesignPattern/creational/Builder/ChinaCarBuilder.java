package com.java.hackerrank.DesignPattern.creational.Builder;

/**
 * @Author pankaj
 * @create 12/14/21 7:10 PM
 */
public class ChinaCarBuilder implements CarComponent{
    Car car;
    public ChinaCarBuilder(){
        car=new Car();
    }
    @Override
    public void buildTyre() {
        car.setNoOfTyres(4);
    }

    @Override
    public void buildSeat() {
        car.setSeatCapacity(5);
    }

    @Override
    public void buildEngine() {
        car.setEnginePower("250CC");
    }

    @Override
    public Car getCar() {
        return car;
    }
}
