package com.almazan.Section9.Interface.Challenge;

import java.util.ArrayList;
import java.util.List;

public class Monster implements ISaveable{
    private String name;
    private int hitPoints, strength;

    public Monster(String name, int hitPoints, int strength) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.strength = strength;
    }

    @Override
    public List<String> write() {
        List<String> list = new ArrayList<String>();
        list.add(this.getName());
        list.add(Integer.toString(this.getHitPoints()));
        list.add(Integer.toString(this.getStrength()));

        return list;
    }

    @Override
    public void read(List<String> list) {
        if(list!= null && !list.isEmpty()){
            this.name = list.get(0);
            this.hitPoints = Integer.parseInt(list.get(1));
            this.strength = Integer.parseInt(list.get(2));

        }
    }

    @Override
    public String toString() {
        return "Monster{" +
                "name='" + name  +
                "', hitPoints=" + hitPoints +
                ", strength=" + strength +
                "}";
    }

    public String getName() {
        return name;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public int getStrength() {
        return strength;
    }
}
