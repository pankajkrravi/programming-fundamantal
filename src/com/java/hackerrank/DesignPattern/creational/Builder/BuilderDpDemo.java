package com.java.hackerrank.DesignPattern.creational.Builder;

/**
 * @Author pankaj
 * @create 12/14/21 7:06 PM
 */
public class BuilderDpDemo {
    @SuppressWarnings("unused")
    public static void main(String[] args) {

        // Tipical way to create Computer way, here if geaphic or bloothoots is nit needed still we need to opass value
       // Computer computer= new Computer("6GB","2GB",true,false);
        Computer  computer=new Computer.ComputerBuilder("8 GB","4GB").buildComputer();
        System.out.println(computer);
        // OR
        System.out.println("*************************************************");
        Computer computer1=new Computer.ComputerBuilder("1000GB","4GB").
                setBluetoothEnabled(true).setGraphicCardEnabled(false).buildComputer();
            System.out.println(computer1);
    }
}
