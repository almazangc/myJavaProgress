package com.almazan.Section11.Static;

public class Main {
    public static int multiplier = 7;

    public static void main(String[] args) {
        Static firstInstance = new Static("1st Instance");
        System.out.println(firstInstance.getName() + " is instance number " + Static.getNumInstances());

        Static secondInstance = new Static("2nd instance");
        System.out.println(secondInstance.getName() + " is instance number " + Static.getNumInstances());

        Static thirdInstance = new Static("3rd instance");
        System.out.println(thirdInstance.getName() + " is instance number " + Static.getNumInstances());

        // java com.company._static.Main
        int answer = multiply(6);
        System.out.println("The answer is " + answer);
        System.out.println("Multiplier is " + multiplier);

    }

    public static int multiply(int number) {
        return number * multiplier;
    }
}
