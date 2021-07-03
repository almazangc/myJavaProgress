package com;

import java.util.Scanner;
import java.math.BigInteger;

class BigIntegerFactorial {
    public static void main(String[] args) {
        // gets BigInteger Value finds the closest factiorial !n >= m
        method1();
        //method2();
    }
   void method1(){
        BigInteger m = new Scanner(System.in).nextBigInteger();
        BigInteger n =  BigInteger.ONE;
        
        for (BigInteger i = new BigInteger("2"); true; i = i.add(BigInteger.ONE)) {
          
            n = n.multiply(i);
          
            if (n.compareTo(m) >= 0) {
              
                System.out.print(i);
              
                break;
            }
        }
   }
  void method2(){
        BigInteger m = new Scanner(System.in).nextBigInteger();
        long n = 1;
        BigInteger f = BigInteger.valueOf(1);
    
        while (m.compareTo(f) > 0) {
            f = f.multiply(BigInteger.valueOf(++n));           
        }
    
        System.out.println(n);
  }
}
