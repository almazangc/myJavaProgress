package com.almazan;

import java.util.Scanner;

public class TicTacToe_ {

    static final Scanner sc = new Scanner(System.in);

    static char[][] TicTacToeGrid = new char[3][3];
    static boolean isXWon = false;
    static boolean isOWon = false;
    static boolean hasEmptyGrid = true;
    static boolean isXTurn = true;
    static boolean isEnd = false;

    public static void main(String[] args) {
        fillTicTacToeGrid();
        getNewMove();
    }

    static void fillTicTacToeGrid() {
        for(int i = 0; i < TicTacToeGrid.length; i++) {
            for(int j = 0; j < TicTacToeGrid.length; j++) {
                TicTacToeGrid[i][j] = ' ';
            }
        }
        printBoard();
    }

    static void getNewMove() {
        while (!isEnd) {
            int x, y;
            while(true) {
                System.out.print("\nPlayer" +(isXTurn ? " X ":" O " )+ "\nEnter new move: ");
                String n = sc.nextLine();
                if (n.matches("[\\D]")) {
                    System.out.println("You should enter numbers!");
                } else if (n.matches("[1-3]*[ ]*[1-3]*")) {
                    x = Integer.parseInt(String.valueOf(n.charAt(0)))-1;
                    y = Integer.parseInt(String.valueOf(n.charAt(2)))-1;
                    break;
                } else {
                    System.out.println("Coordinates should be from 1 to 3!");
                }
            }
            setNewMove(x,y);
        }
    }

    static void setNewMove(int x, int y) {
        if (TicTacToeGrid[x][y] == ' ') {
            if (isXTurn) {
                TicTacToeGrid[x][y] = 'X';
            } else {
                TicTacToeGrid[x][y] = 'O';
            }
            isXTurn = !isXTurn;
            checkResult();
            printBoard();
            displayResult();
        } else {
            System.out.println("This cell is occupied! Choose another one!");
            getNewMove();
        }
    }

    static void printBoard() {
        System.out.println("---------");
        for (char[] x : TicTacToeGrid) {
            System.out.print("| ");
            for (char y : x) {
                System.out.print(y + " ");
            }
            System.out.println("|");
        }
        System.out.println("---------");
    }

    static void checkResult() {
        char in;
        for (int i = 0; i < TicTacToeGrid.length; i++) {
            in = TicTacToeGrid[i][i];
            if ((TicTacToeGrid[i][0] == in && TicTacToeGrid[i][1] == in && TicTacToeGrid[i][2] == in) || (TicTacToeGrid[0][i] == in && TicTacToeGrid[1][i] == in && TicTacToeGrid[2][i] == in)) {
                if (in == 'X') isXWon = true;
                if (in == 'O') isOWon = true;
            }
        }
        if (TicTacToeGrid[1][1] != ' ') {
            in = TicTacToeGrid[1][1];
            if ((TicTacToeGrid[0][0] == in && TicTacToeGrid[2][2] == in) || (TicTacToeGrid[0][2] == in && TicTacToeGrid[2][0] == in)) {
                if (in == 'X') isXWon = true;
                if (in == 'O') isOWon = true;
            }
        }
        for (char[] i : TicTacToeGrid) {
            for (char j : i) {
                if (j == ' ') {
                    hasEmptyGrid = true;
                    break;
                }
            }
        }
    }

    static void displayResult() {
        if (isXWon && !isOWon) {
            System.out.println("X wins");
            isEnd = true;
        } else if (!isXWon && isOWon) {
            System.out.println("O wins");
            isEnd = true;
        } else if (!hasEmptyGrid) {
            System.out.println("Draw");
            isEnd = true;
        }
    }
}