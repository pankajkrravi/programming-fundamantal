package com.java.hackerrank.HackerRank.ThirtyDaysOfcode.tictacToe;

import com.sun.tools.jdeprscan.scan.Scan;

import java.util.Scanner;

public class TicTacToeMainRunner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean doYouWantToPlay = true;
        while (doYouWantToPlay) {
            System.out.println("Welcome to Tic tac Toe, Are you ready??  Pick a character what you want and yo be and I will be ");
            System.out.println();
            System.out.println("Enter a Single a Character that will represent you on the board");

            char playerToken = scanner.next().charAt(0);
            System.out.println("Enter a single character that will represent your opponent on the board  ");
            char opponentToken = scanner.next().charAt(0);
            TicTacToe game = new TicTacToe(playerToken, opponentToken);
            AI ai = new AI();

            // set up the game
            System.out.println();
            System.out.println("Now we can start the game, go from 0 to 9 and we shall see who will win.");
            TicTacToe.printIndexBoard();
            while (game.gameOver().equals("notOver")){
                if (game.currentMarker == game.userMarker){
                    // user tern
                    System.out.println("It's your tern");
                    int spot = scanner.nextInt();
                    while (game.playTurn(spot)){
                        System.out.println("Try again "+spot+" is invalid . This spot is already taken or out of range ");
                        spot = scanner.nextInt();
                    }
                    System.out.println("You picked "+spot+" !");
                } else {
                    // AI tern
                    System.out.println("it's my tern!!!");
                    int  aiSpot = ai.picksSpot(game);
                    game.playTurn(aiSpot);
                    System.out.println("I picked "+ aiSpot+" !");

                }
                // print
                System.out.println();
                game.printBoard();

            }
            System.out.println(game.gameOver());
            System.out.println();
            // set up a new game
            System.out.println("Do you want to play again ? Enter Y if you want or enter anything if you are tired og me .");
            char  resp= scanner.next().charAt(0);
            doYouWantToPlay = (resp=='Y');
            System.out.println();
            System.out.println();
        }
    }
}
