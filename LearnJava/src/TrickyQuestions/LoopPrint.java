package TrickyQuestions;

public class LoopPrint {
    public static void main(String[] args) {
//        String S = "* * * * * * *";
//
//        System.out.printf("%s \n", S);

    /**
     * print loop of your name 5x without using loop method
     */
        String name = "almazan";
        String s = "i";

        s = s.replaceAll("i", "iiiii");
        s = s.replaceAll("i", name + "\n");
        System.out.println(s);
    }
}
