package com.almazan;

import java.util.Scanner;

class HeronFormula {
    
    static final Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {

        double[] input = new double[3];
        input[0] = sc.nextDouble();
        input[1] = sc.nextDouble();
        input[2] = sc.nextDouble();
  
        System.out.println(heronsFormula(input));
    }
  
    public static double heronsFormula(double[] input) {
        double p = (input[0] + input[1] + input[2]) / 2.0d;
        double s = Math.sqrt(p * (p - input[0]) * (p - input[1]) * (p - input[2]));
        return s;
    }
}
