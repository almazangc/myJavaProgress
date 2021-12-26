package com.almazan.OOP.Challenge;

/*
For the base Hamburger class, there will need to be four variables to represent the four basic ingredients of the hamburger, name, meat, price, and breadRollType.
The price variable should be of type double, while the other three are of type String.
A constructor will be needed to accept these four values as parameters when creating a new hamburger.

There will also need to be separate variables for four(4) possible additions to the hamburger.
Those should be declared with these names: addition1Name, addition1Price, addition2Name, addition2Price, addition3Name, addition3Price, addition4Name, and addition4Price.
The name variables should be of type String and the price variables should be of type double.

Five(5) methods are also needed inside the Hamburger class.
Four(4) for adding up to four additions to the hamburger and
One(1) for printing out an itemized listing of the final hamburger with addons, if any, and the total price.

Remember that a name and price must be accepted as parameters in the first four methods so that the price of the hamburger is adjusted accordingly.
These methods should be named addHamburgerAddition1, addHamburgerAddition2, addHamburgerAddition3, addHamburgerAddition4, and itemizehamburger.
The first four methods do not return values, but the last method does return the total price of the hamburger of type double,
which includes the base price of the hamburger plus any additional items.
 */

public class Hamburger {
    private String name;
    private String meat;
    private double price;
    private String breadRollType;

    private String addition1Name, addition2Name, addition3Name, addition4Name;
    private double addition1Price, addition2Price, addition3Price, addition4Price;

    public Hamburger(String name, String meat, double price, String breadRollType) {
        this.name = name;
        this.meat = meat;
        this.price = price;
        this.breadRollType = breadRollType;
        System.out.println(this.name + " hamburger on a " + this.breadRollType + " roll with " + this.meat + ", price is " + this.price);
    }

    public void addHamburgerAddition1(String name, double price){
        this.addition1Price = price;
        this.addition1Name = addition1Name;
    }

    public void addHamburgerAddition2(String name, double price){
        this.addition2Price = price;
        this.addition2Name = name;
    }

    public void addHamburgerAddition3(String name, double price){
        this.addition3Price = price;
        this.addition3Name = name;
    }

    public void addHamburgerAddition4(String name, double price){
        this.addition4Price = price;
        this.addition4Name = name;
    }

    public double itemizeHamburger(){
        double hamburgerPrice = this.price;

        System.out.println(this.name + " hamburger " + " on a " + this.breadRollType + " roll "
                + "with " + this.meat + ", price is "  + this.price);

        if(this.addition1Name != null) {
            hamburgerPrice += this.addition1Price;
            System.out.println("Added " + this.addition1Name + " for an extra " + this.addition1Price);
        }
        if(this.addition2Name != null) {
            hamburgerPrice += this.addition2Price;
            System.out.println("Added " + this.addition2Name + " for an extra " + this.addition2Price);
        }
        if(this.addition3Name != null) {
            hamburgerPrice += this.addition3Price;
            System.out.println("Added " + this.addition3Name + " for an extra " + this.addition3Price);
        }

        if(this.addition4Name != null) {
            hamburgerPrice += this.addition4Price;
            System.out.println("Added " + this.addition4Name + " for an extra " + this.addition4Price);
        }

        return hamburgerPrice;
    }
}
