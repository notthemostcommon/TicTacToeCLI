package com.example;
import java.util.Scanner;

public class Game {


    static Scanner input = new Scanner(System.in);

    private static char[][] gameboard;   // set up board with double array 3X3
    public char Open = ' ';
    public static int col;
    public static int row;
    public static int counter = 0;
    public static String player1;
    public static String player2;
    public static String start;
    public static boolean keepPlaying = true;
    public static int playerCounter;

    public Game() {
        gameboard = new char[3][3];
        gameStart();
        }

    // reset each spot on board
    public void gameStart () {
        System.out.println("Player X, Enter Your Name:");

        player1 = input.next();
        System.out.println("Player O, Enter Your Name:");
        player2 = input.next();
        System.out.println("Welcome " + player1 + " and " + player2 + "!");
        System.out.println("Start game? y/n");
        start = input.next();
        if (start.equalsIgnoreCase("y")) {
            System.out.println("Good luck!");

            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    gameboard[i][j] = Open;
                }
            }

            playerCounter = 9;
            printBoard();
            playerTurn();
        }
    }

    // display gameboard
    public void printBoard (){
        System.out.println(" Tic Tac Toe");
        System.out.println("--1----2----3--");
        System.out.println("---------------");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(" [" + gameboard[i][j] + "] ");
            }
                System.out.println("|" + (i+1));
                System.out.println("---------------");
            }
        }

    // set board for each players turn
    public void setBoard(int i, int j, char player){
        if (i < 3 && i >= 0) {
            if (j < 3 && j >= 0) {
                if (gameboard[i][j] == Open){
                    gameboard[i][j] = player;
                    printBoard();
                    counter++;
                }
            }
        }
        else {
            System.out.println("Try Again!");
        }
    }

    public void playerTurn(){
        while (keepPlaying == true) {

            if (counter % 2 == 0) {
                System.out.println(player1 + " enter row (1-3)");
                row = input.nextInt();
                System.out.println(player1 + " enter column (1-3)");

                col = input.nextInt();
                setBoard(row - 1, col - 1, 'x');
            }
            else {
                System.out.println(player2 + " enter row (1-3)");
                row = input.nextInt();
                System.out.println(player2 + " enter column (1-3)");

                col = input.nextInt();
                setBoard(row - 1, col - 1, 'o');
            }
            winningLogic();
        }
    }

    /*
     * will check all game logic
     * checks winning logic
     * check if space to play is avaialable
      */
    public void  winningLogic() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {

                /*
                 * since we know the ASCII values of x and o, we can check if the values of the rows, columns and diagonals add to the
                 * 3x 'x' or 3x 'o', if not, then there's no winner
                 */
                if (gameboard[i][0] + gameboard[i][1] + gameboard[i][2] == 360 || gameboard[i][0] + gameboard[i][1] + gameboard[i][2] == 333) {
                    keepPlaying = false;
                    displayWinner();
                }

                // check the colums to see if there are matching values in each spot
                else if (gameboard[0][i] + gameboard[1][i] + gameboard[2][i] == 360 || gameboard[0][i] + gameboard[1][i] + gameboard[2][i] == 333) {
                    keepPlaying = false;
                    displayWinner();

                }

                // check diagonals for matching values
                else if (gameboard[0][0] + gameboard[1][1] + gameboard[2][2] == 360 || gameboard[0][0] + gameboard[1][1] + gameboard[2][2] == 333) {
                    keepPlaying = false;
                    displayWinner();
                }

                // check other diagonal for matching values
                else if (gameboard[0][2] + gameboard[1][1] + gameboard[2][0] == 360 || gameboard[0][2] + gameboard[1][1] + gameboard[2][0] == 333) {
                    keepPlaying = false;
                    displayWinner();

                }
                // check for draw, check that no cell is empty
                // this solution will trigger 1 square early

                else if (counter == playerCounter) {
                    keepPlaying = false;
                    System.out.println("It's a draw! No winner :(");
                    restartGame();
                    // reset counter and start with playerX
                    counter = 0;
                } else keepPlaying = true;
            }
        }
    }





    public void displayWinner() {
        // check counter to determine the current player
        // since the counter will already have been adjusted after a valid move, we need to check for opposites
        if (counter % 2 != 0) {
            System.out.println("Congratulations " + player1 + "!. You WON!!");
            playerCounter = 9;
            // reset counter to 0 so play with start with X
            counter = 0;
        } else {
            System.out.println("Congratulations " + player2 + "!. You WON!!");
            /*
            playerCounter is used to determine when the board is full
            since counter is reset to 1 so that o can begin, it will be full after 9 tries
             */
            playerCounter = 10;
            // reset counter to 1 so play will start with o
            counter = 1;

        }
        restartGame();
        // TODO: update score history with winner
        // TODO: reset starting user to be winner of game
    }

    public void restartGame(){
        System.out.println("Replay? y/n");
        start = input.next();
        if (start.equalsIgnoreCase("y")) {
            System.out.println("Good luck!");

            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    gameboard[i][j] = Open;
                }
            }
            printBoard();
            playerTurn();
        }
    }
}
