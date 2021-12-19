package com.java.hackerrank.DesignPattern.creational.Builder;

/**
 * @Author pankaj
 * @create 12/14/21 7:18 PM
 */
public class Car {
    public int noOfTyres;
    public String  enginePower;
    public int seatCapacity;

    public int getNoOfTyres() {
        return noOfTyres;
    }

    public void setNoOfTyres(int noOfTyres) {
        this.noOfTyres = noOfTyres;
    }

    public String getEnginePower() {
        return enginePower;
    }

    public void setEnginePower(String enginePower) {
        this.enginePower = enginePower;
    }

    public int getSeatCapacity() {
        return seatCapacity;
    }

    public void setSeatCapacity(int seatCapacity) {
        this.seatCapacity = seatCapacity;
    }

    @Override
    public String toString() {
        return "Car{" +
                "noOfTyres=" + noOfTyres +
                ", enginePower='" + enginePower + '\'' +
                ", seatCapacity=" + seatCapacity +
                '}';
    }
}
