package com.almazan;

import java.util.Scanner;

class MultiDimensionalArray {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt(); //Check n size <= 100
        
        int[][] matrix = new int[n][n];
        
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = Math.abs(j - i);
                
                System.out.print(matrix[i][j]);
                System.out.print(' ');
            }
            System.out.println();
        }
    }
}
