package Old;

//Method Overloading by same method name but different parameters

public class FeetAndInchesToCentimeter {

    public static double calcFeetAndInchesToCentimeters(double feet, double inches){
        if(feet >= 0 && (inches >= 0 && inches <= 12)){
            return ((feet*12 + calcFeetAndInchesToCentimeters(inches)*12)*2.54);
        }
            System.out.println("Invalid parameters");
            return -1;
    }

    public static double calcFeetAndInchesToCentimeters(double inches){
        if(inches >= 0){
            return inches/12;
        }
            System.out.println("Invalid parameters");
            return -1;
    }
}
