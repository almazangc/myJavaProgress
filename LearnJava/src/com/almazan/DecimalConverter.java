package com.almazan;

import java.util.Scanner;

public class DecimalConverter {
  
  static final Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        System.out.print("Enter number in decimal system:     ");
        long a = sc.nextLong();
      
        System.out.print("Enter target base:     ");
        int radix = sc.nextInt();
      
        System.out.printf("Conversion result:     %s", Long.toString(a, radix).toUpperCase());

        //if (radix == 16 ) System.out.printf("Conversion result:    %s", Integer.toHexString(decimalValue));
        //if (radix == 8 ) System.out.printf("Conversion result:    %s", Integer.toOctalString(decimalValue));
        //if (radix == 2 ) System.out.printf("Conversion result:    %s", Integer.toBinaryString(decimalValue));
            }
    }

