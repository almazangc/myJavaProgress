package com.almazan;

import java.math.BigInteger;

class DoubleFactorial {
    public static BigInteger calcDoubleFactorial(int n) {
        BigInteger fact = BigInteger.ONE;

        for (int i = n; i > 0; i -= 2) {
            fact = fact.multiply(BigInteger.valueOf(i));
        }
        return fact;
    }
}
