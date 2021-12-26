package com.almazan.OOP.Composition.BuildPC;

public class Main {
    public static void main(String[] args) {
        Dimensions dimensions = new Dimensions(20,20, 5);
        Case theCase = new Case("220B", "Dell", "240", dimensions);

        Monitor theMonitor = new Monitor("69in Hyper", "Asus Rouge", 27, new Resolution(4096, 2160));

        Motherboard newMotherboard = new Motherboard("AX-99", "Asus", 4, 6, "Ver 4.1");
        PC newPC = new PC(theCase, theMonitor, newMotherboard);

//        newPC.getTheCase().pressPowerButton();
//        System.out.println("PC is now ON");
//        newPC.getMotherboard().loadProgram("WINDOW 10 OS");
//        newPC.getMotherboard().loadProgram("Paint");
//        newPC.getMonitor().drawPixelAt(232, 323, "Grey");
//
//        System.out.println("Monitor Model: " + newPC.getMonitor().getManufacturer());
//
//        newPC.getTheCase().pressPowerButton();
//        System.out.println("PC is now OFF");

            newPC.PowerUP();
            System.out.println();

            //newPC.loadProgram("Paint");
            newPC.drawPixelAt(246, 343, "Lime");

            System.out.println();
            newPC.ShutDown();
    }
}
