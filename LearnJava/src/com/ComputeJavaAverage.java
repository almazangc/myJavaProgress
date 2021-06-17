package com;

import java.util.*;

public class ComputeJavaAverage
{
        public static void main(String[] args)
        {
            Scanner input = new Scanner(System.in); //Scanner object

            //Prompt the users to enter three numbers
            System.out.print("Compute Average of 3 numbers\n");

            System.out.println("Enter number1: ");
                double number1 = input.nextDouble();
            System.out.println("Enter number2: ");
                double number2 = input.nextDouble();
            System.out.println("Enter number3: ");
                double number3 = input.nextDouble();


            //Compute Average
            double average = (number1 + number2 + number3) / 3;

            //Display Results
            System.out.println("The average of" + number1 + " " + number2
            + " " + number3 + " is " + average);
        }
}
