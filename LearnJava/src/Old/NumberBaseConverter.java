package Old;
import java.math.BigInteger;
import java.util.Scanner;

public class NumberBaseConverter {
    
    public static void main(String[] args) {
        run();
    }
    
    public static void run(){
        
        Scanner scanner = new Scanner(System.in);
        
        while (true){
            System.out.print("Enter two numbers in format: {source base} {target base} (To quit type /exit) ");
            String userInput = scanner.nextLine();
            
            if (userInput.contains("/exit")){
                break;
            }
            
            String[] base = userInput.split(" ");
            
            int fromBase = Integer.parseInt(base[0]);
            int toBase = Integer.parseInt(base[1]);
            
            while (true) {
                System.out.println("Enter number in base " + fromBase + " to convert to base " + toBase + " (To go back type /back)");
                String inputSourceBase = scanner.nextLine();
                
                if (inputSourceBase.contains("/back")) {
                    break;
                }
                
                BigInteger toDecimal = new BigInteger(inputSourceBase,fromBase);
                String toTarget = toDecimal.toString(toBase);
                System.out.println("Conversion result: " + toTarget);
            }
        }
    }
}
