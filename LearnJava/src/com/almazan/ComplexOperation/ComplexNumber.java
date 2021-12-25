package com.almazan.ComplexOperation;

public class ComplexNumber {
    private double real;
    private double imaginary;

    public ComplexNumber(double real,double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public double getReal() {
        return real;
    }

    public double getImaginary() {
        return imaginary;
    }

    public void add(double real, double imaginary){
        this.real += real;
        this.imaginary += imaginary;
    }

    public void add(ComplexNumber another) {
        add(another.real, another.imaginary);
    }

    public void subtract(double real, double imaginary){
        this.real -= real;
        this.imaginary -= imaginary;
    }

    public void subtract(ComplexNumber another) {
        subtract(another.real, another.imaginary);
    }
}
