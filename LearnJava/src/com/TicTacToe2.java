package com;
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
