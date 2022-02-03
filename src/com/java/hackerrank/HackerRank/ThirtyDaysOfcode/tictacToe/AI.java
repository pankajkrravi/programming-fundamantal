package com.java.hackerrank.HackerRank.ThirtyDaysOfcode.tictacToe;

import java.util.ArrayList;
import java.util.Random;

public class AI {
    public int picksSpot(TicTacToe game) {
        ArrayList<Integer> choices = new ArrayList<>();
        for (int i = 0; i < 9; i++) {
            //if slot is not taken , add it is as a choice

            if (game.board  [i] =='_'){
                choices.add(i+1);

            }
        }
        Random random = new Random();
        int choice = choices.get(Math.abs(random.nextInt()%choices.size()));
        return choice;
    }
}
