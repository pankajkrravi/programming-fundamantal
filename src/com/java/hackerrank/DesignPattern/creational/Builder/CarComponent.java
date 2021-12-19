package com.java.hackerrank.DesignPattern.creational.Builder;

/**
 * @Author pankaj
 * @create 12/14/21 7:08 PM
 */
public interface CarComponent {
    public void buildTyre();
    public void buildSeat();
    public void buildEngine();
    public Car getCar();
}
