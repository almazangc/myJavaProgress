package Old;

import java.util.Scanner;

public class QueenIsUnderAttack {

    static int x1, y1;
    static int x2, y2;

    public static void main(String[] args) {
        getInput();
        System.out.println(isQueenUnderAttack());
    }

    static void getInput() {
        Scanner sc = new Scanner(System.in);
        x1 = sc.nextInt();
        y1 = sc.nextInt();
        x2 = sc.nextInt();
        y2 = sc.nextInt();
    }

    static String isQueenUnderAttack() {
        if ((x1 == x2 || y1 == y2) || Math.abs(x1 - x2) == Math.abs(x1 - x2)) return "YES";
        return "NO";
    }
}
