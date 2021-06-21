package com;

import java.util.Scanner;

/**
 * Almazan Gilber C.
 */
public class TicTacToe {

    //static char [][] TicTacToeGrid = {{'x','o','o'}, {'_', '_', 'o'}, {'o','o','o'}};

    public static char [][] TicTacToeGrid = new char[3][3];

    public static void main(String[] args) {
        // write your code here
        input();
        new GameStateDisplay(TicTacToeGrid);
        GameStateDisplay.print();

        new GameStateResult(TicTacToeGrid);
        GameStateResult.CheckResult();
    }

    static void input() {
        String in = new Scanner(System.in).nextLine();

        int n = 0;

        for(int i = 0; i < TicTacToeGrid.length; i++) {
            for(int j = 0; j < TicTacToeGrid.length; j++) {
                TicTacToeGrid[i][j] = in.charAt(n);
                n++;
            }
        }
    }
}

class GameStateDisplay {

    static char[][] TicTacToeGrid;

    public GameStateDisplay (char[][] TicTacToeGrid) {
        this.TicTacToeGrid = TicTacToeGrid;
    }

    static void print() {
        dashLine();
        for (char[] x : TicTacToeGrid) {
            pipeLine();
            for (char y : x) {
                System.out.print(y + " ");
            }
            pipeLine();
            System.out.println();
        }
        dashLine();
    }

    static void pipeLine() {
        System.out.print("| ");
    }

    static void  dashLine() {
        System.out.println("---------");
    }
}

class GameStateResult {

    GameStateResult (char[][] TicTacToeGrid) {
        this.TicTacToeGrid = TicTacToeGrid;
    }

    static char[][] TicTacToeGrid;

    static int xCount = 0;
    static int oCount = 0;
    static boolean hasEmptyGrid = false;

    static int inputX = 0;
    static int inputO = 0;

    static void CheckResult() {
        columnrow();
        diagonalLine();
        checkHasEmptyGrid();



        if (xCount > 0 && oCount == 0) {
            System.out.println("X wins");
        } else if (oCount > 0 && xCount == 0) {
            System.out.println("O wins");
        } else if ((Math.abs(inputX-inputO) >= 2 || (oCount > 0 && xCount > 0)) && hasEmptyGrid) {
            System.out.println("Impossible");
        } else if (oCount == 0 && xCount == 0 && hasEmptyGrid) {
            System.out.println("Game not finished");
        } else if (oCount == 0 && xCount == 0 && !hasEmptyGrid) {
            System.out.println("Draw");
        }
        System.out.println("X : " + inputX + "\nO :" + inputO);
        System.out.println("x win: " + xCount + "\no win: " + oCount + "\nhasEmptyCell: " + hasEmptyGrid + "\nImpossible: " + (Math.abs(inputX-inputO) >= 2));

    }

    static void columnrow() {

        for (int i = 0; i < TicTacToeGrid.length; i++) {

            char in = TicTacToeGrid[i][i]; //0 0 x

            if (TicTacToeGrid[i][0] == in && TicTacToeGrid [i][1] == in && TicTacToeGrid[i][2] == in) {
                if (in == 'X') xCount++;
                else oCount++;
            }

            if (TicTacToeGrid[0][i] == in && TicTacToeGrid [1][i] == in && TicTacToeGrid[2][i] == in) {
                if (in == 'X') xCount++;
                else oCount++;
            }
        }
    }

    static void diagonalLine() {
        if (TicTacToeGrid[1][1] != '_'){

            char in = TicTacToeGrid[1][1];

            if (TicTacToeGrid[0][0] == in && TicTacToeGrid [1][1] == in && TicTacToeGrid[0][2] == in) {
                if (in == 'X') xCount++;
                else oCount++;
            }
            if (TicTacToeGrid[0][2] == in && TicTacToeGrid [1][1] == in && TicTacToeGrid[2][0] == in) {
                if (in == 'X') xCount++;
                else oCount++;
            }
        }
    }

    static void checkHasEmptyGrid() {
        for (char[] i : TicTacToeGrid) {
            for (char j : i){
                if(j == '_') {
                    hasEmptyGrid = true;
                } else if (j == 'X') {
                    inputX++;
                } else {
                    inputO++;
                }
            }
        }
    }
}

