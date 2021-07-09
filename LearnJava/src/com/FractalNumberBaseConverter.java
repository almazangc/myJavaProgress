package com;

import java.math.BigInteger;
import java.math.BigDecimal;
import java.util.Scanner;
 
public class FractalNumberBaseConverter {
    
    static final Scanner scanner = new Scanner(System.in);
    static BigInteger toDecimal;
    static BigDecimal toFractal;
    static String[] inputSourceBase = new String[2];
    static String[] base = new String[2];
    static String toTargetDecimal = "", input = "";
    static int fromBase, toBase;
    
    public static void main(String[] args) {
        run();
    }
    
    public static void run(){
        
        
        while (true){
            System.out.print("Enter two numbers in format: {source base} {target base} (To quit type /exit) ");
            String userInput = scanner.nextLine();
            
            if (userInput.contains("/exit")){
                break;
            }
            
            base = userInput.split(" ");
            
            parseInit();
            
            while (true) {
                
                System.out.print("Enter number in base " + fromBase + " to convert to base " + toBase + " (To go back type /back) ");
                
                input = scanner.nextLine();
                
                if (input.contains("/back")) {
                    break;
                }
                
                if (input.matches("[-]?[\\d]+[.]{1}[\\d]+")) {
                    
                    split();
 
                    toDecimal = new BigInteger(inputSourceBase[0],fromBase);
                    toTargetDecimal = toDecimal.toString(toBase);
                    
                    toFractal = new BigDecimal(inputSourceBase[1]);
                    
                    if (!inputSourceBase[1].matches("[0]*")) {
                        
                        if(fromBase > toBase) {
                            highBase();
                        } else {
                            lowerBase();
                        }
                        
                    } else {
                        zeroFrac();
                    }
                    
                } else {
                    wholeNum();
                }
            }
        }
    }
    static void parseInit() {
        fromBase = Integer.parseInt(base[0]);
        toBase = Integer.parseInt(base[1]);
    }
    
    static void split() {
        inputSourceBase = input.split("[.]");
    }
    
    static void wholeNum() {
        toDecimal = new BigInteger(input,fromBase);
        toTargetDecimal = toDecimal.toString(toBase);
        System.out.println("Conversion result: " + toTargetDecimal);
    }
    
    static void zeroFrac() {
        System.out.println("Conversion result: " + toTargetDecimal + ".00000");
    }
    
    static void lowerBase() {
        int power = -1;
        double xy = 0;
            for(int i = 0; i < inputSourceBase[1].length(); i++){
                int frac = Integer.parseInt(String.valueOf(inputSourceBase[1].charAt(i)));
                if (frac == 1) {
                    xy += Math.pow(fromBase, power);
                }
                power--;  
            }
 
        toFractal = new BigDecimal(xy);
        toFractal = toFractal.add(new BigDecimal(toTargetDecimal)).setScale(5);
        System.out.println("Conversion result: " + toFractal);    
    }
    
    static void highBase() {
        
        String toTargetFractal = "";
                
        while (toFractal.compareTo(BigDecimal.ZERO) != 0) {
            
            toFractal.multiply(BigDecimal.valueOf(toBase));
 
            if (toFractal.compareTo(BigDecimal.valueOf(1)) >= 0){
                toTargetFractal = toTargetFractal.concat("1");
                toFractal = toFractal.subtract(BigDecimal.ONE);
            } else {
                toTargetFractal = toTargetFractal.concat("0");
            }
        }
        
        System.out.println("Conversion result: " + toTargetDecimal + "." + toTargetFractal.substring(0,5));
    }
}
