package Old;

import java.util.*;

public class ComputeKilometers_per_mile {
    public static void main (String[] args)
    {
        double miles = 100; // miles value
        final double KILOMETERS_PER_MILE = 1.609; //constant kpm

        //Kilometers Computation
        double kilometer = miles * KILOMETERS_PER_MILE;

        //Display Kilometer Result
        System.out.print("Miles: " + miles + "\nKPH: " + KILOMETERS_PER_MILE + "\nKilometers: " + kilometer);
    }
}
