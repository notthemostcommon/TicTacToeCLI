package com.example;
import java.util.Scanner;


public class Main {
    static Scanner input = new Scanner(System.in);
    public static String player1;
    public static String player2;
    public static String start;







    public static void main(String[] args) {
        Game newGame = new Game();

//        System.out.println("Player X, Enter Your Name:");
//
//        player1 = input.next();
//        System.out.println("Player O, Enter Your Name:");
//        player2 = input.next();
//        System.out.println("Welcome " + player1 + " and " + player2 + "!");
//        System.out.println("Start game? y/n");
//        start = input.next();
//        if (start.equalsIgnoreCase("y")) {
//            System.out.println("Start");
//        }




//        playerTurn();

//        input.close();

//    }

//    public static void playerTurn(){
//        if (counter % 2 == 0){
//            System.out.println(player1 + " enter row");
//            row = input.nextInt();
//            System.out.println(player1 + " column #");
//
//            col = input.nextInt();
//            newGame.setBoard(row, col, 'x');
//            newGame.printBoard();
//
//            counter ++;
//        } else {
//            System.out.println(player2 + " enter row");
//            row = input.nextInt();
//            System.out.println(player2 + " column #");
//
//            col = input.nextInt();
//            newGame.setBoard(row, col, 'o');
//            newGame.printBoard();
//
//            counter ++;
//        }
//    }




//class Game {
//    private static char[][] gameboard;   // set up board with double array 3X3
//    public char Open = ' ';
//    public int num = 1;
//
//
//
//
//
//    public Game() {
//        gameboard = new char[3][3];
//
//    }
//
//
//
//
//    // reset each spot on board
//    public void gameStart (){
//
//
//        for (int i = 0; i < 3; i++){
//            for (int j = 0; j < 3; j++){
//                gameboard[i][j] = Open;
//            }
//        }
//    }
//
//    // display gameboard
//    public void printBoard (){
//        System.out.println(" Tic Tac Toe");
//        System.out.println("--0----1----2--");
//
//        System.out.println("---------------");
//
//        for (int i = 0; i < 3; i++) {
//            for (int j = 0; j < 3; j++) {
//                System.out.print(" [" + gameboard[j][i] + "] ");
//            }
//
//            System.out.println("|" + i);
//
//            System.out.println("---------------");
//
//        }
//    }
//    // set board for each players turn
//    public void setBoard(int i, int j, char player){
//        if (i < 3 && i >= 0) {
//            if (j < 3 && j >= 0) {
//                if (!(gameboard[i][j] == Open)){
//                    gameboard[i][j] = player;
//                    printBoard();
//                }
//
//            }
//            // reprint board with updated moves
//
//
//        }
    }
}
//
//
//
