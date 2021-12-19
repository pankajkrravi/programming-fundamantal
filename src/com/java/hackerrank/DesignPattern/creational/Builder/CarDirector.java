package com.java.hackerrank.DesignPattern.creational.Builder;

/**
 * @Author pankaj
 * @create 12/14/21 7:12 PM
 */
public class CarDirector {
    private CarComponent carComponent= null;
    public CarDirector(CarComponent carComponent){
        this.carComponent=carComponent;
    }
    public void buildCar(){
        carComponent.buildTyre();
        carComponent.buildSeat();
        carComponent.buildEngine();
    }
    public Car getCar(){
        return carComponent.getCar();
    }
}
