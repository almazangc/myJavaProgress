package Old;

import java.util.Scanner;
import java.math.BigInteger;

public class AmazingNumber {
  
    public static void main(String[] args) {
        run();
    }
    
    static void displayGreet()  {
        System.out.println("Welcome to Amazing Numbers!");
        System.out.println("Supported requests:"
                            + "\n- enter a natural number to know its properties;"
                            + "\n- enter two natural numbers to obtain the properties of the list:"
                            + "\n  * the first parameter represents a starting number;"
                            + "\n  * the second parameters show how many consecutive numbers are to be processed;"
                            + "\n- separate the parameters with one space;"
                            + "\n- enter 0 to exit.");
    }
    
    static String[] getUserInput() {
        System.out.print("Enter a request: ");
        Scanner sc = new Scanner(System.in);
        return sc.nextLine().split(" ");
    }
    
    static String strRev(String line) {
        char[] ch = line.toCharArray();  
        String rev="";  
        for(int i = ch.length-1; i >= 0; i--){  
            rev += ch[i];  
        } 
        return rev;
    }
    
    static boolean isNaturalNum(BigInteger bigNum) {
        return bigNum.compareTo(BigInteger.ZERO) == 1;
    }
    
    static boolean isEven(BigInteger bigNum) {
        BigInteger[] bigDR2 = bigNum.divideAndRemainder(new BigInteger("2"));
        return bigDR2[1].compareTo(BigInteger.ZERO) == 0;
    }
    
    static boolean isBuzz(BigInteger bigNum) {
        BigInteger[] bigDR7 = bigNum.divideAndRemainder(new BigInteger("7"));
        BigInteger[] bigDR10 = bigNum.divideAndRemainder(new BigInteger("10"));
        return bigDR7[1].compareTo(BigInteger.ZERO) == 0 || bigDR10[1].compareTo(new BigInteger("7")) == 0;
    }
    
    static boolean isPalindrome(String line) {
        String strReverse = strRev(line);
        return strReverse.equals(line);
    }
    
    static boolean isDuck(String line) {
        return (line.contains("0") && !line.startsWith("0"));
    }
    
    static boolean isGapFul(String line) {
        String gap = line.charAt(0) + "" + line.charAt(line.length() - 1);
        BigInteger[] bigGap = new BigInteger(line).divideAndRemainder(new BigInteger(gap));
        return line.length() > 2 && bigGap[1].compareTo(BigInteger.ZERO) == 0;
    }
    
    static void bigNum(String start) {
            BigInteger bigNum = new BigInteger(start);
                       
            boolean isNaturalNum = isNaturalNum(bigNum);
            boolean isEven = false;
            boolean isBuzz = false;
            boolean isGapFull = false;
            
            if (isNaturalNum) {
                isEven = isEven(bigNum);
                isBuzz = isBuzz(bigNum);
                if (start.length() > 2) isGapFull = isGapFul(start);
            }
            
            boolean isDuck = isDuck(start);
            boolean isPalindrome = isPalindrome(start);
            
            if (!isNaturalNum)
                System.out.println("The first parameter should be a natural number or zero.");
            else 
                System.out.println("Properties of " + start + 
                                "\n\t buzz: " + isBuzz +
                                "\n\t duck: " + isDuck +
                                "\n\t palindromic: " + isPalindrome +
                                "\n\t gapful: "+ isGapFull + 
                                "\n\t even: " + isEven + 
                                "\n\t odd: " + !isEven);
    }
    
    static void bigNumEnd(String start, String end) {
        
        BigInteger bigNum1 = new BigInteger(end).add(new BigInteger(start));
        boolean isNaturalStartNum = isNaturalNum(new BigInteger(start));
        boolean isNaturalEndNum = isNaturalNum(new BigInteger(end));
        
        if (!isNaturalStartNum) {
                System.out.println("The first parameter should be a natural number or zero.");
                return;
        } else if (!isNaturalEndNum) {
                System.out.println("The second parameter should be a natural number or zero.");
                return;
        }
        
        for (BigInteger bigNum = new BigInteger(start); bigNum.compareTo(bigNum1) <= 0; bigNum = bigNum.add(BigInteger.ONE)) {
            String num = String.valueOf(bigNum);
            boolean isDuck = isDuck(num);
            boolean isPalindrome = isPalindrome(num);
            boolean isEven = false;
            boolean isBuzz = false;
            boolean isGapFull = false;

            if (isNaturalStartNum) {
                isEven = isEven(bigNum);
                isBuzz = isBuzz(bigNum);
                if (start.length() > 2) isGapFull = isGapFul(num);
            }

            if (!isNaturalStartNum) {
                System.out.println("The first parameter should be a natural number or zero.");
                break;
            } else if (!isNaturalEndNum) {
                System.out.println("The second parameter should be a natural number or zero.");
                break;
            } else {                
                System.out.print("\n" + bigNum + " is ");
                System.out.print(isBuzz ? " buzz" : "");
                System.out.print(isDuck ? " duck" : "");
                System.out.print(isPalindrome ? " palindromic" : "");
                System.out.print(isGapFull ? " gapful" : "");
                System.out.print(isEven ? " even" : " odd");
            }
        }
    }
    
    static void run() {
        
        displayGreet();
        
        while (true) {
            String[] input = getUserInput();
            String start = input[0];
            String end = input[0]; 
            
            if(input.length == 2) ; 
            if(start.equals("0")) break;
            
            if(input.length == 1) {
                bigNum(start);
            } else {
                end = input[1];
                bigNumEnd(start, end);
            }
        }
    }
}
