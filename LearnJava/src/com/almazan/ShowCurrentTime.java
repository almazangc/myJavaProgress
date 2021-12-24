package com.almazan;

public class ShowCurrentTime {
    public static void main(String[] args){

        //obtain total milliseconds since midnight,  jan 1 1970
        long totalMilliseconds = System.currentTimeMillis();

        //obtain total seconds since midnight, jan 1,1970
        long totalSeconds = totalMilliseconds / 1000;

        //Compute the current seconds in the minute in the hour
        long currentSecond = totalSeconds % 60;

        //Obtain the total minutes
        long totalMinutes = totalSeconds / 60;

        //Compute the current minute in the hour
        long currentMinute = totalMinutes % 60;

        //Obtain the total hours
        long totalHour = totalMinutes / 60;

        //Compute the current hour
        long currentHour = totalHour % 24;

        // Display results25
        System.out.println("Current time is " + currentHour + ":" + currentMinute + ":" + currentSecond + " GMT");
        System.out.println("GMT 0: HH/MM/SS");
    }
}
