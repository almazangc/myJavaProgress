package com.almazan.Section9.InnerClass;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static Button btnPrint = new Button("Print");

    public static void main(String[] args) {
        Gearbox newGearbox = new Gearbox(5);
        /**
         * to call an inner class must call the master class first
         * to create a new Gear must be Gearbox varName.new
         */

        Gearbox.Gear newGear = newGearbox.new Gear(3, 4.5d);
        //Gearbox.Gear second = new Gearbox.Gear(2, 15.4);
        //Gearbox.Gear third = new newGearbox.Gear(3, 17.8);

        System.out.printf(String.valueOf(newGear.driveSpeed(10)));

//        class ClickListener implements Button.OnClickListener {
//            public ClickListener() {
//                System.out.println("I've been attached");
//            }
//
//            @Override
//            public void onClick(String title) {
//                System.out.println(title + " was clicked");
//            }
//        }
//
//        btnPrint.setOnClickListener(new ClickListener());
            btnPrint.setOnClickListener(new Button.OnClickListener() {
                @Override
                public void onClick(String title) {
                    System.out.println(title + " was clicked");
                }
            });
            listen();
    }

    private static void listen() {
        boolean quit = false;
        while(!quit) {
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch(choice) {
                case 0:
                    quit = true;
                    break;
                case 1:
                    btnPrint.onClick();

            }
        }
    }
}
