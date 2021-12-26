package com.almazan.OOP.Composition.BuildPC;

public class PC {
    private Case theCase;
    private Monitor monitor;
    private Motherboard motherboard;

    public PC(Case theCase, Monitor monitor, Motherboard motherboard) {
        this.theCase = theCase;
        this.monitor = monitor;
        this.motherboard = motherboard;
    }

    public void PowerUP(){
        theCase.pressPowerButton();
        drawLogo();
        System.out.println("Monkey.....");
    }

    private void drawLogo() {
        monitor.drawPixelAt(monitor.getNativeResolution().getWidth() / 2, monitor.getNativeResolution().getHeight() / 2, "OWO LOGO");
    }

    public void ShutDown(){
        theCase.pressPowerButton();
        System.out.println("Shutting Down PC");
    }

    boolean isPaintRunning;
    public void loadProgram(String Program) {
        motherboard.loadProgram(Program);

        if (Program.equals("Paint"))
            isPaintRunning = true;
    }

    public void drawPixelAt(int x, int y, String color){
        if (isPaintRunning)
            monitor.drawPixelAt(x, y, color);
        else
            System.out.println("Paint is not running");
    }
}
