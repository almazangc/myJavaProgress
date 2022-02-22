package Old;

import java.util.Scanner;

public class CompareValues {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in); //object scanner

        int x, y; //variable declarations

        //Prompt user
        System.out.print("Enter x: ");
            x = input.nextInt();
        System.out.print("Enter y: ");
            y = input.nextInt();

        //Display result with ternary
        System.out.println(x < y ? "x is less than y.": (x == y ? "x is equal to y": "x is greater than y"));
    }
}
