package com.almazan;

import java.util.Scanner;

class pet{
    // Instance variable (data or "state")
    String name;
    int[] stat = new int[4];
    int level;
    /*
     * This is what they call a class
     * like a blueprint/template for objects
     * Classes can contain
     * 1. Data
     * 2. Subroutines (methods)
     */
}

class selectablePlayerClass{
    //class constructor

    int HP, MP, ATTACK, DEFENCE, SPEED;
    String SKILL;

    public selectablePlayerClass (int HP, int MP, int ATTACK, int DEFENCE, int SPEED, String SKILL) {
        this.HP = HP;
        this.MP = MP;
        this.ATTACK = ATTACK;
        this.DEFENCE = DEFENCE;
        this.SPEED = SPEED;
        this.SKILL = SKILL;
    }
}

class playerInfo{
    //Getter and setter
    String username;
    int LEVEL, AREA, STORY_CHAPTER;

    public playerInfo(){

    }

    public playerInfo(String username, int LEVEL, int AREA, int STORY_CHAPTER){
        this.username = username;
        this.LEVEL = LEVEL;
        this.AREA = AREA;
        this.STORY_CHAPTER = STORY_CHAPTER;
    }


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}

public class Contructor_Class {
    static final Scanner getInput = new Scanner(System.in);
    public static void main(String[] args) {
        pet cat = new pet();
        cat.name = "martha"; //name
        cat.stat[0] = 15; //attack
        cat.stat[1] = 10; //def
        cat.stat[2] = 120; //hp
        cat.stat[3] = 25; //spd
        cat.level = 5; //level

        pet worm = new pet();
        worm.name = "sheesh"; //name
        worm.stat[0] = 2; //attack
        worm.stat[1] = 1; //def
        worm.stat[2] = 500; //hp
        worm.stat[3] = 2; //spd
        worm.level = 2; //level

        selectablePlayerClass warrior = new selectablePlayerClass(2000,200, 60, 250, 30, "TAUNT");
        selectablePlayerClass hunter = new selectablePlayerClass(540, 250, 360, 30,90, "HIT LOCK");
        selectablePlayerClass thief = new selectablePlayerClass(1100, 350, 240, 10, 230, "BACK STAB");
        selectablePlayerClass smith = new selectablePlayerClass(310, 1000, 20, 60,900, "ARM CREATE");

        playerInfo player1 = new playerInfo("Lomi", 99, 104, 9);
        System.out.println("Current Player IGN:" + player1.getUsername());
        System.out.print("Enter new ign: ");
        player1.setUsername(getInput.nextLine());
        System.out.println("New Player IGN:" + player1.getUsername());
    }
}
