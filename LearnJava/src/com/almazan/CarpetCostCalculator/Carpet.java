package com.almazan.CarpetCostCalculator;

public class Carpet {
    private double cost;

    public Carpet(double cost) {
        this.cost = cost;
        if (cost < 0)
            this.cost = 0d;
    }

    public double getCost(){
        return this.cost;
    }
}
