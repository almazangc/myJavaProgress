package com.almazan.OOP.Composition.RoomBuild;

public class Bedroom {
    private String room;
    private Wall wall_1;
    private Wall wall_2;
    private Wall wall_3;
    private Wall wall_4;
    private Ceiling ceiling;
    private Bed bed;

    public Bedroom(String room, Wall wall_1, Wall wall_2, Wall wall_3, Wall wall_4, Ceiling ceiling, Bed bed) {
        this.room = room;
        this.wall_1 = wall_1;
        this.wall_2 = wall_2;
        this.wall_3 = wall_3;
        this.wall_4 = wall_4;
        this.ceiling = ceiling;
        this.bed = bed;
    }

    public void makeBed(){
        System.out.println("BedRoom --> Making BED");
        bed.make();
    }
}
