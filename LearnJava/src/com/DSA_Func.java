package com;

import java.util.Scanner;

public class DSA_Func {
    public static void main(String[] args) {
        System.out.print("Select function : \n[1] Floor Function\n" +
                "[2] Ceiling Function\n[3] Modulo Function\n" +
                "Enter your option: ");
        int UserSelection = new Scanner(System.in).nextInt();

        if(UserSelection == 1 | UserSelection == 2) FloorCeil(UserSelection);
        if(UserSelection == 3) Mod();
    }
    
    static void FloorCeil(int UserSelection){
        System.out.print("Enter a number: ");
        double num = new Scanner(System.in).nextDouble();
        System.out.printf("The %s of " + num + " is %.0f.",
                UserSelection == 1 ? "Floor" : "Ceiling", UserSelection == 1 ? Math.floor(num) : Math.ceil(num));
    }

    static void Mod(){
        System.out.print("Enter number: ");
        int num1 = new Scanner(System.in).nextInt();
        System.out.print("Enter divisor: ");
        int num2 = new Scanner(System.in).nextInt();
        System.out.printf("The Modulo of %d and %d is %d.%n",
                num1, num2, num1 % num2);
    }
}

