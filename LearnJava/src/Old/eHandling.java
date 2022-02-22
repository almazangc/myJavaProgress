package Old;
import java.util.InputMismatchException;
import java.util.Scanner;

public class eHandling {
    static final Scanner getInput = new Scanner(System.in);
    /*Exception handling and list
        ArithmeticException
        ClassNotFoundException
        IllegalArgumentException
        IndexOutOfBoundsExceptions
        InputMismatchException
        IOException
     */
    public static void main(String[] args) {
        System.out.print("Enter your age: ");
        int age = getAge();

        if (age != 0 ){
            System.out.println("You're getting older eh!");
        }
}

    public static int getAge(){
        try{
            return getInput.nextInt();
        }
        catch (InputMismatchException e) {
            System.out.println("Enter a whole number!!");
            return 0;
        }
        catch (Exception e){
            System.out.println("Cant accept that!");
            System.out.println("Error: " + e);
            System.out.println("Error Message: " + e.getMessage());
            e.printStackTrace();
            getInput.next(); //flushing current input
            return 0;
        }
    }
}
