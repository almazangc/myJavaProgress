package com.almazan.OOP.Composition.RoomBuild;

public class Main {
    public static void main(String[] args) {
        Wall northWall = new Wall("North");
        Wall eastWall = new Wall("East");
        Wall southWall = new Wall("South");
        Wall westWall = new Wall("West");

        Ceiling ceiling = new Ceiling(120, "Grey");

        Bed modernBed = new Bed("Modern", 5, 3, 2, 1);

        Bedroom newBedRoom = new Bedroom("Almazan", northWall, eastWall, southWall, westWall, ceiling ,modernBed);
        newBedRoom.makeBed();
    }
}
