package com.almazan.Section8.AutoBoxingAndUnboxing;

import java.util.ArrayList;

public class Autoboxing_Unboxing {
    public static void main(String[] args) {
        /**
         * ArrayList does not take in primitive data types but class
         * Integer being a class
         */
        ArrayList<Integer> arrayListInteger = new ArrayList<Integer>();
        ArrayList<Double> arrayListDouble = new ArrayList<Double>();
        ArrayList<Float> arrayListFloat = new ArrayList<Float>();
        ArrayList<Short> arrayListShort = new ArrayList<Short>();
        ArrayList<Long> arrayListLong = new ArrayList<Long>();

        //String is a class not a primitive data type
        ArrayList<String> arrayListString = new ArrayList<String>();

        Integer newInt = new Integer(56); //Deprecated

        Integer classInt = Integer.valueOf(56); // boxing data int to class
        int dataTypeInt = classInt.intValue(); // unboxing class to int

        //Java does autoboxing and unboxing | Hover mouse for details
        Integer newClassInt = 56;
        int newDataTypeInt = newClassInt;

        ArrayList<Double> myDoubleValues = new ArrayList<Double>();

        for (double dbl=0.0; dbl <= 10.0; dbl += 0.5) {
            myDoubleValues.add(dbl);
        }

        for (int i=0; i<myDoubleValues.size(); i++) {
            double value = myDoubleValues.get(i);
            System.out.println(i + "  --> " + value);
        }
    }
}

