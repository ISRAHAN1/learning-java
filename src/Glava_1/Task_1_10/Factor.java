package Glava_1.Task_1_10;

import java.math.BigInteger;

public class Factor {
    public static void main(String[] args) {
        int value =6;
        System.out.println(factorial(value));
    }
    public static BigInteger factorial(int value){
        BigInteger result=BigInteger.valueOf(1);
        for (int i=1; i<=value; i++){
            result= result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }
}
