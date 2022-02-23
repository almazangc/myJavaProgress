package com.almazan.Section9.Abstract.Animal;

import com.almazan.Section9.Abstract.Animal.Birds.Parrot;
import com.almazan.Section9.Abstract.Animal.Birds.Penguin;
import com.almazan.Section9.Abstract.Animal.Dog.Dog;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Yorkie");
        dog.breathe();
        dog.eat();

        Parrot parrot = new Parrot("Australian ringneck");
        parrot.breathe();
        parrot.eat();
        parrot.fly();

        Penguin penguin = new Penguin("Emperor");
        penguin.fly();
    }
}
