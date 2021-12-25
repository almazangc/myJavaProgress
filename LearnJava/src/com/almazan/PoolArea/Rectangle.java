package com.almazan.PoolArea;

import com.sun.source.tree.BreakTree;

/*
    1. Write a class with the name Rectangle. The class needs two fields (instance variable) with name width and length both of type double.

    The class needs to have one constructor with parameters width and length both of type double and it needs to initialize the fields.

    In case the width parameter is less than 0 it needs to set the width field value to 0.

    In case the length parameter is less than 0 it needs to set the length field value to 0.

    Write the following methods (instance methods):
    * Method named getWidth without any parameters, it needs to return the value of width field.
    * Method named getLength without any parameters, it needs to return the value of length field.
    * Method named getArea without any parameters, it needs to return the calculated area (width * length).
 */
public class Rectangle {

    private double width;
    private double length;

    public Rectangle(double width, double length) {
        this.length = length;
        if(length < 0)
            this.length = 0;

        this.width = width;
        if (width < 0)
            this.width = 0;
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    public double getArea(){
        return getLength() * getWidth();
    }
}
