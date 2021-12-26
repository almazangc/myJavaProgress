package com.almazan.OOP.Composition.RoomBuild;

public class Ceiling {
    private int height;
    private String colorPaint;

    public Ceiling(int height, String colorPaint) {
        this.height = height;
        this.colorPaint = colorPaint;
    }

    public int getHeight() {
        return height;
    }

    public String getColorPaint() {
        return colorPaint;
    }
}
