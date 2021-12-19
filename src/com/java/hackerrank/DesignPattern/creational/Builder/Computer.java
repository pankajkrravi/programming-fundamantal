package com.java.hackerrank.DesignPattern.creational.Builder;

/**
 * @Author pankaj
 * @create 12/14/21 8:57 PM
 */
public class Computer {
    // Req Parameter
    private String HDD;
    private String RAM;
    // Optional parameter
    private boolean isGraphicCardEnabled;
    private boolean isBluetoothEnabled;

    Computer(ComputerBuilder computerBuilder) {
        this.HDD = computerBuilder.HDD;
        this.RAM = computerBuilder.RAM;
        this.isGraphicCardEnabled = computerBuilder.isGraphicCardEnabled;
        this.isBluetoothEnabled = computerBuilder.isBluetoothEnabled;
    }

    public boolean isGraphicCardEnabled() {
        return isGraphicCardEnabled;
    }

    public void setGraphicCardEnabled(boolean graphicCardEnabled) {
        isGraphicCardEnabled = graphicCardEnabled;
    }

    public boolean isBluetoothEnabled() {
        return isBluetoothEnabled;
    }

    public void setBluetoothEnabled(boolean bluetoothEnabled) {
        isBluetoothEnabled = bluetoothEnabled;
    }

    public String getHDD() {
        return HDD;
    }

    public void setHDD(String HDD) {
        this.HDD = HDD;
    }

    public String getRAM() {
        return RAM;
    }

    public void setRAM(String RAM) {
        this.RAM = RAM;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "HDD='" + HDD + '\'' +
                ", RAM='" + RAM + '\'' +
                ", isGraphicCardEnabled=" + isGraphicCardEnabled +
                ", isBluetoothEnabled=" + isBluetoothEnabled +
                '}';
    }
    // step 1- create static nested class
    public static class ComputerBuilder{
        // Req Parameter
        private String HDD;
        private String RAM;
        // Optional parameter
        private boolean isGraphicCardEnabled;
        private boolean isBluetoothEnabled;
        // step 2. create constructor with all required fields
        public ComputerBuilder(String HDD,String RAM){
            this.HDD=HDD;
            this.RAM=RAM;
        }
        // step 3 - we need to have setter method for optional fields

        public ComputerBuilder setGraphicCardEnabled(boolean graphicCardEnabled) {
            this.isGraphicCardEnabled = graphicCardEnabled;
            return this;
        }

        public ComputerBuilder setBluetoothEnabled(boolean bluetoothEnabled) {
            this.isBluetoothEnabled = bluetoothEnabled;
            return  this;
        }
        //Step4. Create a method which return object of outer class.
        public Computer buildComputer(){
            return new Computer(this);
        }
    }
}
