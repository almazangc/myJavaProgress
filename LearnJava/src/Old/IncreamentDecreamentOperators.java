package Old;

public class IncreamentDecreamentOperators {
    public static void main (String[] args){
        /**
        byte a = 0;
        System.out.println("Postfix Increament a: " + a++);

        byte b = 0;
        System.out.println("Prefix Decreament b: " + --b);
        */

        int a = 6;
        int b = a++;
        System.out.println(a); //7
        System.out.println(b); //6


        a = 6;
        b = ++a;
        System.out.println(a); //7
        System.out.println(b); //7
    }
}
