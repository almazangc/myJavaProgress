package Old;

import java.util.Scanner;

class SplitString {
  public static void main(String[] args) {
        String[] ans = new Scanner(System.in).nextLine().split("-");
        System.out.printf("%s/%s/%s%n", ans[1], ans[2], ans[0]);
  }
}
