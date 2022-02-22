package Old;

public class bugSearch {
    public static final String DEFAULT_APPLICATION_NAME = "MyDemoApp";
    public static final int MAX_IMAGE_SIZE_KB = 4096;

    public static String hello = "Hello"; // (1)

    public static void main(String[] args) {

        System.out.println(DEFAULT_APPLICATION_NAME); // (2)

        //MAX_IMAGE_SIZE_KB = 2048; // (3) You can't assign a new value to final value.

        //printHello(); // (4) You can't reference a non static method in a body of a static method
    }

    private void printHello() { //instance method
        System.out.println(hello); // (5)
    }
}
