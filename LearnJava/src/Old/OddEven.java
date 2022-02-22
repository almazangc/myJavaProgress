package Old;

public class OddEven {
    public static void  main(String[] args){

        System.out.println("Print even numbers");

        for(int i = 0; i <= 10; i++){
            if(i%2 == 0){
                System.out.print(i + (i == 10 ? ".":", "));
            }
        }
    }
}
