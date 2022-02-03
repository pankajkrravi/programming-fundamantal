package com.java.hackerrank.HackerRank.ThirtyDaysOfcode.day19;

public class Hero implements Character {
    public String weapon = "The force";

    @Override
    public void heal() {
        System.out.println("Hero attack the Enemy !!");
    }

    @Override
    public void attack() {
        System.out.println("Hero beats you !!");
    }

    @Override
    public String grtWeapon() {
        return weapon;
    }
}
