package com.almazan;
/*
    Let's com.almazan.TicTacToe_.test what you have learned about Operators.
 1. Create a double variable with a value of 20.00.
 2. Create a second variable of type double with the value 8
 3. Add both numbers together and multiply by 100.00.
 4. Use the remainder operator to figure out what the remainder from the result of the operation in step 3 and 40.00.
    Use the modulus or remainder operator on ints or use double.
 5. Create a boolean variable that assigns the value true if the remainder in #4 is 0, or false if its not zero.
 6. Output the boolean variable.
 7. Write an if-then statement that displays a message "Got some remainder" if the boolean in the step 5 is not true.
 */
public class Challenge_0 {
    public static void main(String[] args) {

        double firstDouble = 20.00d;
        double secondDouble = 80.00d;

        double totalOfDoubles = (firstDouble + secondDouble) * 100.00d;
        System.out.println("MyValuesTotal = " + totalOfDoubles);

        double theRemainder = totalOfDoubles % 40.00d;
        System.out.println("theRemainder = " + theRemainder);

        boolean isNoRemainder = theRemainder == 0;
        System.out.println("isNoRemainder = " + isNoRemainder);

        if (!isNoRemainder) {
            System.out.println("Got some remainder");
        }
    }
}
