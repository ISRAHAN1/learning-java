package Glava_1.Task_1_11;

import java.math.BigInteger;

public class Recurcia {
    public static void main(String[] args) {
        int sa=5;
        System.out.println(ResCur(sa));
    }

    public static BigInteger ResCur(int value){
        BigInteger result = BigInteger.valueOf(1);
        if(value==0 || value == 1){
            return result;
        }
        result=BigInteger.valueOf(value).multiply(ResCur(value-1));
        return result;
    }
}

