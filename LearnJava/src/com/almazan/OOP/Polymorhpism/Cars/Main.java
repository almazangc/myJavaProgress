package com.almazan.OOP.Polymorhpism.Cars;

class Car{
    private boolean engine;
    private String name;
    private int cylinders;
    private int wheels;

    public Car(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
        this.engine = true;
        this.wheels = 4;
    }

    public String startEngine(){
        return this.name + " -> startEngine()";
    }

    public String accelerate(){
        return this.name + " -> accelerate()";
    }

    public String brake(){
        return this.name + " -> brake()";
    }

    public String getName() {
        return name;
    }

    public int getCylinders() {
        return cylinders;
    }
}

class Mitsubishi extends Car{
    public Mitsubishi(int cylinder, String name) {
        super(cylinder, name);
    }

    @Override
    public String startEngine() {
        return super.getName() + " -> startEngine()";
    }

    @Override
    public String accelerate() {
        return super.getName() + " -> accelerate()";
    }

    @Override
    public String brake() {
        return super.getName() + " -> brake()";
    }
}

class Holden extends Car{
    public Holden(int cylinder, String name) {
        super(cylinder, name);
    }

    @Override
    public String startEngine() {
        return super.getName() + " -> startEngine()";
    }

    @Override
    public String accelerate() {
        return super.getName() + " -> accelerate()";
    }

    @Override
    public String brake() {
        return super.getName() + " -> brake()";
    }
}

class Ford extends Car{
    public Ford(int cylinder, String name) {
        super(cylinder, name);
    }

    @Override
    public String startEngine() {
        return super.getName() + " -> startEngine()";
    }

    @Override
    public String accelerate() {
        return super.getName() + " -> accelerate()";
    }

    @Override
    public String brake() {
        return super.getName() + " -> brake()";
    }
}

public class Main {
    public static void main(String[] args) {
        // We are going to go back to the car analogy.
        // Create a base class called Car
        // It should have a few fields that would be appropriate for a generice car calss.
        // engine, cylinders, wheels, etc.
        // Constructor should initialize cylinders (number of) and name, and set wheels to 4
        // and engine to true. Cylinders and names would be passed parameters.
        //
        // Create appropriate getters
        //
        // Create some methods like startEngine, accelerate, and brake
        //
        // show a message for each in the base class
        // Now create 3 sub classes for your favorite vehicles.
        // Override the appropriate methods to demonstrate polymorphism in use.
        // put all classes in the one java file (this one).

        Car car = new Car(8, "Base car");
        System.out.println(car.startEngine());
        System.out.println(car.accelerate());
        System.out.println(car.brake());

        Mitsubishi mitsubishi = new Mitsubishi(6, "Outlander VRX 4WD");
        System.out.println(mitsubishi.startEngine());
        System.out.println(mitsubishi.accelerate());
        System.out.println(mitsubishi.brake());

        Ford ford = new Ford(6, "Ford Falcon");
        System.out.println(ford.startEngine());
        System.out.println(ford.accelerate());
        System.out.println(ford.brake());

        Holden holden = new Holden(6, "Holden Commodore");
        System.out.println(holden.startEngine());
        System.out.println(holden.accelerate());
        System.out.println(holden.brake());
    }
}
