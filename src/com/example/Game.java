package com.example;
import java.util.Scanner;

public class Game {


    Scanner scanner = new Scanner(System.in);
    static Scanner input = new Scanner(System.in);

    private static char[][] gameboard;   // set up board with double array 3X3
    public char Open = ' ';
    public int num = 1;

    public static int col;
    public static int row;
    public static int counter = 0;
    public static String player1;
    public static String player2;
    public static String start;
    public static boolean draw = false;





    public Game() {
        gameboard = new char[3][3];
        gameStart();
        printBoard();


            playerTurn();
        }




    // reset each spot on board
    public void gameStart (){
        System.out.println("Player X, Enter Your Name:");

        player1 = input.next();
        System.out.println("Player O, Enter Your Name:");
        player2 = input.next();
        System.out.println("Welcome " + player1 + " and " + player2 + "!");
        System.out.println("Start game? y/n");
        start = input.next();
        if (start.equalsIgnoreCase("y")) {
            System.out.println("Good luck!");
        }


        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                gameboard[i][j] = Open;
            }
        }
    }

    // display gameboard
    public void printBoard (){
        System.out.println(" Tic Tac Toe");
        System.out.println("--0----1----2--");

        System.out.println("---------------");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(" [" + gameboard[j][i] + "] ");
            }

                System.out.println("|" + i);

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
                }

        }
        // reprint board with updated moves


        }
    }

    public void playerTurn(){
        winningLogic();

        if (counter % 2 == 0){
            System.out.println(player1 + " enter row (1-3)");
            row = input.nextInt();
            System.out.println(player1 + " enter column (1-3)");

            col = input.nextInt();
            setBoard(row - 1, col - 1, 'x');
            printBoard();

            counter ++;
            System.out.println("counter is" + counter);
        } else {
            System.out.println(player2 + " enter row (1-3)" );
            row = input.nextInt();
            System.out.println(player2 + " enter column (1-3)");

            col = input.nextInt();
            setBoard(row-1, col-1, 'o');
            printBoard();

            counter ++;
            System.out.println("counter is" + counter);

        }
    }
    /*
     * will check all game logic
     * checks winning logic
     * check if space to play is avaialable
      */
    public boolean keepPlaying(){
        return true;
    }

    public boolean winningLogic(){
        if (counter == 9){
            draw = true;
        } else {
            return true;

        }
        return true;

    }
    // https://www.mkyong.com/java/how-to-convert-character-to-ascii-in-java/
    public static int CharToASCII(final char character){
        return (int)character;
    }

}
