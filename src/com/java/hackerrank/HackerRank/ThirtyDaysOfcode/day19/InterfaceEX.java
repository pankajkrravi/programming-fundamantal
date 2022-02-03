package com.java.hackerrank.HackerRank.ThirtyDaysOfcode.day19;

import java.util.Random;

public interface InterfaceEX {
    //https://www.hackerrank.com/challenges/30-interfaces/problem
// Collection of abstract class, no implementation no constructor
//template of functionality
//be default it's public static final
// we can have static member in interface

    public static Character sommonCharacter() {
        Random random = new Random();
        if (Math.abs(random.nextInt()) % 2 == 0) {
            return new Enemy();
        } else {
            return new Hero();
        }
    }

    public static void main(String[] args) {
        Enemy enemy = new Enemy();
        Hero hero = new Hero();
        enemy.attack();
        hero.attack();
        enemy.heal();
        hero.heal();
        System.out.println("Enemy weapon : " + enemy.grtWeapon() + " Heo weapon : " + hero.grtWeapon());

        Character character= sommonCharacter();
        character.attack();
        character.heal();
    }
}
