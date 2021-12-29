package com.almazan.Section8.Arrays;

import java.util.ArrayList;

public class ParametrizedClass {
    private static ArrayList<ArrayList> newArray = new ArrayList<>(); //Prone to bugs

    public static void main(String[] args) {
        newArray.add(new ArrayList<String>());
    }
}
