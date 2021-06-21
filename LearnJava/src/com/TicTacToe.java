package com;
<<<<<<< HEAD

import java.util.Scanner;
import java.util.regex.*;  

/**
 * Author: ALMAZAN Gilbert 2hours
 */
public class TicTacToe {
 
    //static char [][] TicTacToeGrid = {{'x','o','o'}, {'_', '_', 'o'}, {'o','o','o'}};

    public static char [][] TicTacToeGrid = new char[3][3];

    public static void main(String[] args) {
        // write your code here
        new getGameInput(TicTacToeGrid);
        getGameInput.GameInitialState();
        
        new GameStateDisplay(TicTacToeGrid);
        GameStateDisplay.print();

        new GameStateResult(TicTacToeGrid);
        GameStateResult.CheckResult();
        
        getGameInput.getUserMove();
        
        
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
        //System.out.println("X : " + inputX + "\nO :" + inputO);
        //System.out.println("x win: " + xCount + "\no win: " + oCount + "\nhasEmptyCell: " + hasEmptyGrid + "\nImpossible: " + (Math.abs(inputX-inputO) >= 2));

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

class getGameInput {
    
    getGameInput (char[][] TicTacToeGrid){
        this.TicTacToeGrid = TicTacToeGrid;
    }
    
    static final Scanner sc = new Scanner(System.in);
    
    static char[][] TicTacToeGrid = new char[3][3];
    
    static int x,y;
    
    static void GameInitialState() {
        
        String in = sc.nextLine();

        int n = 0;

        for(int i = 0; i < TicTacToeGrid.length; i++) {
            for(int j = 0; j < TicTacToeGrid.length; j++) {
                TicTacToeGrid[i][j] = in.charAt(n);
                n++;
            }
        }
    }
    
    static void getUserMove(){
        while(true) {
            
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
        setNewMove();
    }
    
    static void setNewMove() {
        
        if (TicTacToeGrid[x][y] == '_') {
            TicTacToeGrid[x][y] = 'X';
            
            new GameStateDisplay(TicTacToeGrid);
            GameStateDisplay.print();
        } else {
            System.out.println("This cell is occupied! Choose another one!");
            getUserMove();
        }
    }
    
}
=======
import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // firs input of 9 symbols
        System.out.print("Enter cells: ");
        String str1 = scanner.nextLine();
        char[][] field = new char[3][3];
        // fill an array in a nested for loop
        for (int i = 0, k = 0; i < field.length && k < 7; i++, k += 3) {
            for (int j = 0; j < field[i].length; j++) {
                field[i][j] = str1.charAt(k + j);
            }
        }
        // first output an array with printf() method
        String dashes = "---------";
        System.out.println(dashes);
        for (char[] chars : field) {
            System.out.printf("| %c %c %c |\n", chars[0], chars[1], chars[2]);
        }
        System.out.println(dashes);
        // second input of 2 integers
        System.out.print("Enter the coordinates: ");
        boolean flag = false;        
        while (!flag) {
            String str2 = scanner.next();
            String str3 = scanner.next();
            // utf-16 value test - is character a number?
            if (str2.charAt(0) > 57 || str3.charAt(0) > 57) {
                System.out.print("You should enter numbers!\nEnter the coordinates: ");
                continue;
            }
            // utf-16 value test - is character in the (1; 3) interval?
            if ((str2.charAt(0) < 49 || str2.charAt(0) > 51) ||
                    (str3.charAt(0) < 49 || str3.charAt(0) > 51)) {
                System.out.print("Coordinates should be from 1 to 3!\nEnter the coordinates: ");
                continue;
            }
            // convert character to integer
            int x = Integer.parseInt(String.valueOf(str2.charAt(0)));
            int y = Integer.parseInt(String.valueOf(str3.charAt(0)));
            // is the sell [x][y] free?
            if (field[x - 1][y - 1] != '_') {
                System.out.print("This cell is occupied! Choose another one!\nEnter the coordinates: ");
            } else {
                field[x - 1][y - 1] = 'X';
                flag = true;
            }
        }
        // second output an array
        System.out.println(dashes);
        for (char[] chars : field) {
            System.out.printf("| %c %c %c |\n", chars[0], chars[1], chars[2]);
        }
        System.out.println(dashes);           
    }
}
>>>>>>> 08c88c2e840ab36f2f7e82ea020b8d37cc2fcd77
