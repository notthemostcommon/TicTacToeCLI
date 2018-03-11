package com.example;
import java.util.Scanner;

public class Game {

    private static char[][] gameboard;   // set up board with double array 3X3
//    private int[][] gameboard;
//    private int[] gameboard;
    Scanner scanner = new Scanner(System.in);
    public char Open = ' ';



    public Game() {
        gameboard = new char[3][3];

        }





    public void gameStart (){
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                gameboard[i][j] = Open;
            }
        }
    }

    public void printBoard (){
        System.out.println(" Tic Tac Toe");
        System.out.println("---------------");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(" [" + gameboard[j][i] + "] ");
            }

                System.out.println();

                System.out.println("---------------");

            }
        }
}
