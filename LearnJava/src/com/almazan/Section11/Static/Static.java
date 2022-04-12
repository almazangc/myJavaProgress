package com.almazan.Section11.Static;

public class Static {
    private static int numInstances = 0;
    private String name;

    public Static(String name) {
        this.name = name;
        numInstances++;
    }

    public static int getNumInstances() {
        return numInstances;
    }

    public String getName() {
        return name;
    }
}
