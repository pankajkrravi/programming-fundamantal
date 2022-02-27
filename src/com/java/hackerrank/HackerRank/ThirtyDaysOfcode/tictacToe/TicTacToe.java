package com.java.hackerrank.HackerRank.ThirtyDaysOfcode.tictacToe;

public class TicTacToe {

    protected char[] board;
    protected char userMarker;
    protected char aiMarker;
    protected char winner;
    protected char currentMarker;

    public TicTacToe(char playerToken, char aiMarker) {

        this.userMarker = playerToken;
        this.aiMarker = aiMarker;
        this.winner = '_';
        this.currentMarker = userMarker;
        this.board = setBoard();
    }

    private char[] setBoard() {
        char board[] = new char[9];
        for (int i = 0; i < board.length; i++) {
            board[i] = '_';
        }
        return board;
    }

    public boolean playTurn(int spot) {
        boolean isValid = withinRange(spot) && !isSpotTaken(spot);
        if (isValid) {
            board[spot - 1] = currentMarker;
            currentMarker = (currentMarker == userMarker) ? aiMarker : userMarker; // if condition - flit the ternn
        }
        return isValid;
    }

    // check if spot is in range
    public boolean withinRange(int number) {
        return number > 0 && number < board.length + 1; // 1 to 9
    }

    // is spot taken
    public boolean isSpotTaken(int number) {
        return board[number - 1] != '_';
    }

    public void printBoard() {
        System.out.println();
        for (int i = 0; i < board.length; i++) {
            if (i % 3 == 0 && i != 0) {
                System.out.println();
                System.out.println("---------");
            }
            System.out.println(" | " + board[i]);
        }
        System.out.println();
    }

    public static void printIndexBoard() {
        System.out.println();
        for (int i = 0; i < 9; i++) {
            if (i % 3 == 0 && i != 0) {
                System.out.println();
                System.out.println("---------");
            }
            System.out.println(" | " + (i + 1));
        }
        System.out.println();
    }

    public boolean isThereAWinner() {
        boolean diagonalsAndMiddle = rightDiagonal() || leftDiagonal()
                || middleRow() || secondColumn() && board[4] != '_';
        boolean topAndFirst = topRow() || firstColumn() && board[0] != '_';
        boolean bottomAndThird = bottomRow() || thirdColumn() && board[8] != '_';
        if (diagonalsAndMiddle) {
            this.winner = board[4];
        } else if (topAndFirst) {
            this.winner = board[0];
        } else if (bottomAndThird) {
            this.winner = board[8];
        }
        return diagonalsAndMiddle || topAndFirst || bottomAndThird;
    }

    private boolean thirdColumn() {
        return board[2] == board[5] && board[5] == board[8];
    }

    private boolean secondColumn() {

        return board[1] == board[4] && board[4] == board[7];
    }

    private boolean topRow() {

        return board[0] == board[1] && board[1] == board[2];
    }

    private boolean middleRow() {

        return board[3] == board[4] && board[4] == board[2];
    }

    private boolean bottomRow() {
        return board[6] == board[7] && board[7] == board[8];
    }

    private boolean firstColumn() {
        return board[0] == board[3] && board[3] == board[6];
    }

   /* private boolean thirdRow() {
        return board[2] == board[5] && board[5] == board[8];
    }*/

    private boolean leftDiagonal() {
        return board[2] == board[4] && board[4] == board[6];
    }

    private boolean rightDiagonal() {
        return board[0] == board[4] && board[4] == board[8];
    }

    public boolean isTheBoardFilled(){
        for (int i=0;i<board.length;i++){
            if (board[i] == '_'){
                return false;
            }
        }
        return true;
    }

    public String gameOver(){
        boolean didSomeoneWin= isThereAWinner();
        if (didSomeoneWin){
            return "we have a Winner : "+this.winner+"'s";
        }else if (isTheBoardFilled()){
            return "Draw : Game is over";
        }else {
            return "Game is Not over";
        }
    }
}
