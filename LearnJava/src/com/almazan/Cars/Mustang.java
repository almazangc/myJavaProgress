package com.almazan.Cars;

public class Mustang extends Car{

    private int roadServiceMonths;

    public Mustang(int roadServiceMonths) {
        super("Mustang", "4WD", 5, 5, 6, false);
        this.roadServiceMonths = roadServiceMonths;
    }
}
