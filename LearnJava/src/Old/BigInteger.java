package Old;

import java.util.Scanner;
import java.math.BigInteger;

class BigInt {
    public static void main(String[] args) {
        // BigInteger is immutable and an object
        Scanner sc = new Scanner(System.in);
        BigInteger a = sc.nextBigInteger();
        BigInteger b = sc.nextBigInteger();
        BigInteger c = sc.nextBigInteger();
        BigInteger d = sc.nextBigInteger();
        
        BigInteger result = expression(a, b, c, d);
        System.out.print(result);
    }
    
    static BigInteger expression(BigInteger a, BigInteger b, BigInteger c, BigInteger d) {
        return  a.negate().multiply(b).add(c).subtract(d);
        //(-a) * b + c - d
    }
}
