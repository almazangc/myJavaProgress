package com.almazan.CarpetCostCalculator;

public class Floor {
    private double width;
    private double length;

    public Floor(double width, double length) {
        this.width = width;
        this.length = length;

        if (width < 0)
            this.width = 0d;
        if (length < 0)
            this.length = 0d;
    }

    public double getArea() {
        return this.length * this.width;
    }
}
