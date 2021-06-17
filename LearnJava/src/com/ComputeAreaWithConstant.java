package com;

import java.util.*;

public class ComputeAreaWithConstant
{
    public static void main(String[] args)
    {
        final double PI = 3.14159; //Declaring Constant

        //Create a Scanner object
        Scanner input = new Scanner(System.in);

        //Prompt user
        System.out.print("Enter number of radius: ");
        double radius = input.nextDouble();

        //Compute area
        double area = radius * radius  * PI;

        //Display Result
        System.out.println("The area for the circle of radius " +
            radius + " is " + area + ".");
    }
}
