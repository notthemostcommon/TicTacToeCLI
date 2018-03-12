package com.example;
import java.util.Scanner;


public class Main {
    public static int counter = 0;
    static Scanner input = new Scanner(System.in);
    public static String player1;
    public static String player2;
    public static String start;




    public static void main(String[] args) {
        Game newGame = new Game();

        System.out.println("Player X, Enter Your Name:");

        player1 = input.next();
        System.out.println("Player O, Enter Your Name:");
        player2 = input.next();
        System.out.println("Welcome " + player1 + " and " + player2 + "!");
        System.out.println("Start game? y/n");
        start = input.next();
        if (start.equalsIgnoreCase("y")) {
            System.out.println("Start");
        }


        playerTurn();
        newGame.gameStart();
        newGame.printBoard();

        input.close();

    }

    public static void playerTurn(){
        if (counter % 2 == 0){
            System.out.println(player1 + "'s turn.");
        } else {
            System.out.println(player2 + "'s turn.");
        }

    }

}




