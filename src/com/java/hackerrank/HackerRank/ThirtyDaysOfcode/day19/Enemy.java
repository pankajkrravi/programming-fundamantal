package com.java.hackerrank.HackerRank.ThirtyDaysOfcode.day19;

public class Enemy implements Character {
    public String weapon = "LifeSaver";

    @Override
    public void heal() {
        System.out.println("Enemy heals himself !!");

    }

    @Override
    public void attack() {
        System.out.println("Enemy attacks you !!");

    }

    @Override
    public String grtWeapon() {
        return weapon;
    }

    public void weaponDraw() {
        System.out.println("Draw Weapon by Enemy !!!");
    }
}
