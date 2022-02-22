package Old;

import java.util.Scanner;

public class DSAS_Functions {
    public static void main(String[] args) {
        functions(selectFx());
    }

    private static int selectFx() {
        System.out.print("\nSelect Function "
                + "\n\t[1] Floor Function"
                + "\n\t[2] Ceiling Function"
                + "\n\t[3] Modulo Function"
                + "\n\nSelect your function: ");
        return optionCheck();
    }

    private static int optionCheck() {
        while (true) {
            String strInput = new Scanner(System.in).nextLine();
            switch (strInput) {
                case "1":
                case "2":
                case "3":
                    return Integer.parseInt(strInput);
                default:
                    System.out.print("\nInvalid selection"
                            + "\nEnter a valid selection: ");
                    break;
            }
        }
    }

    private static void functions(int sel) {
        if (sel == 1 || sel == 2) FloorCielFx(sel);
        if (sel == 3) modFx();
    }

    private static void FloorCielFx(int sel) {
        System.out.printf("------------------\n%s", (sel == 1) ? "Floor Function" : "Ceiling Function");

        while (true) {
            System.out.print("\nEnter a number:");
            String strInput = new Scanner(System.in).nextLine();
            boolean inputValidation = strInput.matches("[-]?[\\d]{0,2}[.]?[\\d]*");

            if (!inputValidation) {
                System.out.println("\nInvalid Input");
            } else {
                double x;

                if (sel == 1) {
                    x = Math.floor(Double.parseDouble(strInput));
                } else {
                    x = Math.ceil(Double.parseDouble(strInput));
                }
                System.out.printf("The %s of %s in %s.\n", x == 1 ? "floor" : "ceiling", x, (int) x);
                break;
            }
        }
    }

    private static void modFx() {
        System.out.println("------------------\n" + "Modulo Function");

        int dividend = 0, divisor = 0;

        for (byte i = 0; i < 2; ) {
            System.out.printf("Enter a %s: ", i == 0 ? "dividend" : "divisor");
            String strInput = new Scanner(System.in).nextLine();
            boolean inputValidation = strInput.matches("[-]?[\\d]{0,2}[.]?[\\d]*");

            if (!inputValidation) {
                System.out.println("\nInvalid Input");
            } else {
                if (i == 0) dividend = Integer.parseInt(strInput);
                if (i == 1) divisor = Integer.parseInt(strInput);
                i++;
            }
        }
        System.out.printf("\nThe modulo of %d and %d is %d.",
                dividend, divisor, (dividend % divisor));
    }
}
