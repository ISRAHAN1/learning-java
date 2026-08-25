package Glava_1.Task_1_6;

import java.math.BigInteger;

public class Max {
    public static void main(String[] args) {
        long max =Long.MAX_VALUE;
        System.out.println(maxLongSqr(BigInteger.valueOf(max)));
    }
    public static BigInteger maxLongSqr(BigInteger max){
        return max.multiply(max);
    }
}












