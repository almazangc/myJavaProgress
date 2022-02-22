package com.almazan.Section9.Interface.Challenge;

import java.util.ArrayList;
import java.util.List;

public class Player implements ISaveable{
    private String name, weapon;
    private int hitPoints, strength;

    public Player(String name, int hitPoints, int strength) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.strength = strength;
        this.weapon = "Sword";
    }

    @Override
    public List<String> write() {
        List<String> list = new ArrayList<>();
        list.add(this.getName());
        list.add(Integer.toString(this.getHitPoints()));
        list.add(Integer.toString(this.getStrength()));
        list.add(this.getWeapon());
        return list;
    }

    @Override
    public void read(List<String> list) {
        if(list!= null && !list.isEmpty()){
            setName(list.get(0));
            setHitPoints(Integer.parseInt(list.get(1)));
            setStrength(Integer.parseInt(list.get(2)));
            setWeapon(list.get(3));
        }
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name  +
                "', hitPoints=" + hitPoints  +
                ", strength=" + strength +
                ", weapon='" + weapon +
                "'}";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }
}

