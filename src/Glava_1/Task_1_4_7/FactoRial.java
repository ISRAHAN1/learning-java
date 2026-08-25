package Glava_1.Task_1_4_7;

import java.math.BigInteger;

public class FactoRial {
    public static void main(String[] args) {
        int value = 3;
        System.out.println(factorial(value));
    }

    public static BigInteger factorial(int value) {
        BigInteger s = BigInteger.valueOf(1);
        for (int i = 1; i <= value; i++) {
            s = s.multiply(BigInteger.valueOf(i));
        }
        return s;
    }
}
